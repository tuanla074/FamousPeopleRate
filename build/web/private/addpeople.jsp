<%-- 
    Document   : addpeople
    Created on : Mar 25, 2018, 10:06:19 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-sm-4 col-sm-offset-4">
                    <form action="/WebApplication3/addR">
                        <h3 class="text-center">New</h3>
                        <div class="form-group">
                            <label>Name</label>
                            <input type="text" required class="form-control" name="name"/>
                        </div>
                         <div class="form-group">
                            <label>Nationality</label>
                            <input type="text" required class="form-control" name="nationality"/>
                        </div>
                         <div class="form-group">
                            <label>Profession</label>
                            <input type="text" required class="form-control" name="pro"/>
                        </div>
                         <div class="form-group">
                            <label>Pictures's link</label>
                            <input type="text" required class="form-control" name="pics"/>
                        </div>
                        <input type="hidden"name="user" value=${user}>
                        <div class="form-group">
                            <button type="submit" class="btn btn-block btn-success"style="background-color:#ff9900; color:black ; border-color:#ff9900">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
