/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.spring.beans.AddCourseBean;

/**
 *
 * @author hp
 */
public class CourseDao {

    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(AddCourseBean bean) {
        String sql = "insert into course(course_id,name,field,level,teacher_name) values('" + bean.getCourseID() + "','" + bean.getCourseName() + "','" + bean.getField() + "','" + bean.getLevel() + "','" + bean.getTeacherName() +"')";
        String two_sql = "insert into course_info(course_id, prerequistic, recommended_list) values('" + bean.getCourseID() + "','" + bean.getPrerequisites() + "','" + bean.getRecommended_list() +"')";
        template.update(sql);
        return template.update(two_sql);
    }

    public List<AddCourseBean> getCourses() {
        String query = "select * from course inner join course_info on course_info.course_id = course.course_id";
       
        return template.query(query, new RowMapper<AddCourseBean>() {
            public AddCourseBean mapRow(ResultSet rs, int row) throws SQLException {
                AddCourseBean course = new AddCourseBean();
                course.setCourseID(rs.getInt("course_id"));
                course.setCourseName(rs.getString("name"));
                course.setTeacherName(rs.getString("teacher_name"));
                course.setRecommended_list(rs.getString("recommended_list"));
                System.out.println(course);
                
                return course;
            }
        });
    }
}
