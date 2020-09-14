<%-- 
    Document   : index.jsp
    Created on : Mar 25, 2018, 5:22:58 PM
    Author     : Lenovo
--%>

<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.string"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="PeopleR.PeopleR" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-default" style="background-color:#ffcc00; color:black; border-color:#ffcc00">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">${user.getUser()}</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"  style="background-color:#ff9900; color:black; border-color:#ff9900"><a style="background-color:#ff9900; color:black; border-color:#ff9900 "  href="#">Home</a></li>
                    <li><a href="#">People</a></li>
                </ul>
            </div>
        </nav>
        <div class="jumbotron text-center" style="background-color:#ffcc00">
            <h1>Rating</h1>
            <p>Everyone has opinions</p> 
        </div>
        <div class="container">
            <div class="col-sm-4">
                <button class="btn btn-success"  style="background-color:#ff9900; color:black; border-color:white "type="submit"><a style="color:black" href="/WebApplication3/JC?i=${user.id}" >Add</a></button>
            </div>
            <div>
                <form action="/WebApplication3/searchC">
                    <div class="input-group">
                        <input type="text" class="form-control" name="sea"placeholder="Search">
                        <div class="input-group-btn">
                            <button class="btn btn-default" type="submit">
                                <i class="glyphicon glyphicon-search"></i>
                            </button>
                        </div>
                    </div>
                </form>
            </div>
            </br>
            <div class="row">
                <c:forEach items="${ppl}" var="po">
                    <div class="col-sm-4" style="border-color:#ffcc00; background-color:white" >
                        <div class="well well-sm">
                            <center>
                                <h2 class="center-block" style="font-family:fantasy">${po.name} - (${po.rate})</h2>
                                <p>${po.ntnl} - ${po.pros}</p>
                            </center>
                            <img src="../Pics/${po.pics}" height="480" width="320" class ="center-block img-rounded"alt=""/>
                            </br>
                            <button type="button" class="btn btn-info center-block" data-toggle="collapse" data-target="#${po.id}" style="background-color:#ff9900; color:black; border-color:white ">More</button>
                        </div>
                        <div id="${po.id}" class="collapse">
                            <form action="/WebApplication3/rate">
                                <div class="form-group">
                                    <select name="rating" class=" btn btn-primary dropdown-toggle" style="background-color:#ff9900; border-color:black; color:black">
                                        <option value="5">5</option>
                                        <option value="4">4</option>
                                        <option value="3">3</option>
                                        <option value="2">2</option>
                                        <option value="1">1</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label>comment:</label>
                                    <input class="form-control" type="text" required name="com"/>
                                </div>
                                <input type="hidden"name="up" value="${user.id}">
                                <input type="hidden"name="ups" value="${po.id}">
                                <div class="form-group">
                                    <button class="btn btn-success" style="background-color:#ff9900; color:black ; border-color:#ff9900" type="submit">Submit</button>
                                </div>

                            </form>
                            <form action="/WebApplication3/GC">
                                <center> <button class="btn btn-success"  style="background-color:#ff9900; color:black; border-color:white "type="submit"><a style="color:black" href="/WebApplication3/GC?i=${po.id}&d=${user.id}">Gallery</a></button></center>
                            </form>
                        </div>
                    </div>
                </c:forEach>
            </div
            <div class="col-sm-4 col-sm-offset-4">
                <form action="/WebApplication3/log">
                    <center> <button class="btn btn-success" style="background-color:#ff9900; color:black ; border-color:#ff9900" type="submit">Log Out</button></center>
                </form>
            </div>
        </div>
    </body>
</html>
