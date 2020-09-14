<%-- 
    Document   : Gallery
    Created on : Apr 14, 2018, 2:03:37 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.string"%>
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
        <style>
            div.gallery img {
                width: 100%;
                height: 50%;
            }
            div.gallery{
                display: inline-block;
            }
            #ko img:hover {
                border:solid;
            }
            #ko img{
                margin: 3px;
                width: auto;
                height:200px;
                position:inherit;
                display: inline-block;
            }

        </style>
    </head>
    <body>
        <nav class="navbar navbar-default" style="background-color:#ffcc00; color:black; border-color:#ffcc00">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">${user.getUser()}</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"  style="background-color:#ff9900; color:black; border-color:#ff9900"><a style="background-color:#ff9900; color:black; border-color:#ff9900 "  href="index.jsp">Home</a></li>
                    <li><a href="#">People</a></li>
                </ul>
            </div>
        </nav>
        <div class="jumbotron text-center" style="background-color:#ffcc00">
            <h1>Rating</h1>
            <p>Everyone has opinions</p> 
        </div>
        <div class="container">
            <div class="col-sm-4" >
                <form>
                    <button class="btn btn-success"  style="background-color:#ff9900; color:black; border-color:white "type="submit"><a style="color:black" href="/WebApplication3/addsw?hol=${peo}&us=${user.id}">Add</a></button>
                </form>
            </div>
            </br>
            </br>
            </br>
            <div class="row">
                <c:forEach items="${pics}" var="po">
                    <div class="gallery" id="ko">
                        <div>
                            <a target="_blank" href="../Pics/${po}">
                                <img src="../Pics/${po}" class="img-thumbnail">
                            </a>
                        </div>
                    </div
                </div>
            </c:forEach>
        </div>
        </br>
        </br>
        </br>
        </br></br>

        <c:forEach items ="${CaR}" var="dis">
            <div class="well">
                <h5><b>${dis.user} - ${dis.rate}</b></h5>
                <p>${dis.comment}</p>
            </div>
        </c:forEach>
    </div>
    <div class="col-sm-4 col-sm-offset-4">
        <form action="/WebApplication3/log">
            <center> <button class="btn btn-success" style="background-color:#ff9900; color:black ; border-color:#ff9900" type="submit">Log Out</button></center>
        </form>
    </div>
</body>
</html>
