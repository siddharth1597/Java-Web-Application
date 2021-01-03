/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.spring.beans.AddCourseBean;
import com.spring.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class AddCourseController {
    @Autowired  
    CourseDao course;

    @RequestMapping(value = "/showCourse", method = RequestMethod.GET)
    public String showcourse(Model model) {
        model.addAttribute("course", new AddCourseBean());
        return "addNewCourse";
    }

    @RequestMapping(value="/saveCourse",method = RequestMethod.POST)
    public String save(@ModelAttribute AddCourseBean cr) {
        course.save(cr);
        return "redirect:viewList";
    }

    @RequestMapping("/viewList")
    public String viewlist(Model model) {
        List<AddCourseBean> list = course.getCourses();
        model.addAttribute("course_list", list);
        return "index";
    }
}
