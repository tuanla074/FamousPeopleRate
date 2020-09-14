<%-- 
    Document   : Login
    Created on : Mar 25, 2018, 5:32:59 PM
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
                <div class="col-sm-2 col-sm-offset-2"></div>
                <div class="col-sm-3">
                    <form action="login" method="post">
                        <div class="form-group">
                            <label>Username</label>
                            <input class="form-control" type="text" required name="user" placeholder="Username"/>
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input class="form-control" type="password" required name="pass" placeholder="PAssword"/>
                        </div>
                        <div class="form-group">
                                <button class="btn btn-success" style="background-color:#ff9900; color:black ; border-color:#ff9900">Login</button>
                        </div> 
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>