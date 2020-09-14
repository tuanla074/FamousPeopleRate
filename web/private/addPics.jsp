<%-- 
    Document   : addPics
    Created on : Apr 14, 2018, 8:14:34 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                    <form action="/WebApplication3/adp">
                         <div class="form-group">
                            <label>Pictures's link ${yu}</label>
                            <input type="text" required class="form-control" name="pics"/>
                        </div>
                        <input type="hidden" name="peop" value="${yu}">
                        <input type="hidden" name="few" value="${iop}">
                        <div class="form-group">
                            <button type="submit" class="btn btn-block btn-success"style="background-color:#ff9900; color:black ; border-color:#ff9900">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
