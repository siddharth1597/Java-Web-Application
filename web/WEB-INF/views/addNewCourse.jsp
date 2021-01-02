<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course Settings</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <h3 class="mt-4 mb-4">Course Settings</h3>
            <form>
                <div class="form-group col-md-7">
                    <label for="id">Course ID</label>
                    <input type="text" class="form-control" id="id" placeholder="Enter Course ID" name="id">
                </div>
                <div class="form-group col-md-7">
                    <label for="name">Course Name</label>
                    <input type="text" class="form-control" id="name" placeholder="Enter Course Name" name="name">
                </div> <div class="form-group col-md-7">
                    <label for="level">Course Level</label>
                    <input type="text" class="form-control" id="level" placeholder="Enter Level" name="level">
                </div>
                <div class="form-group col-md-7">
                    <label for="teacher">Teacher Name</label>
                    <input type="text" class="form-control" id="teacher" placeholder="Enter Teacher Name" name="teacher">
                </div>
                <div class="form-group col-md-7">
                    <label for="pre">Prerequisites</label>
                    <input type="text" class="form-control" id="pre" placeholder="Enter Prerequisites" name="pre">
                </div>
                <div class="form-group col-md-7">
                    <label for="rec">Recommended:</label>
                    <input type="text" class="form-control" id="rec" placeholder="Enter Recommended" name="rec">
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-success mt-3 ml-3">Save Information</button>
                </div>
            </form>
        </div>
    </body>
</html>