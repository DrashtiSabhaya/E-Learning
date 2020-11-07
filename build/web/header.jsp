<%-- 
    Document   : header
    Created on : 28 Aug, 2020, 8:50:12 AM
    Author     : Drashti
--%>
<%--================ Header ===================--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="shortcut icon" href="<c:url value="resources/images/logo-2.png" />">
        <title>Learn</title>
        <meta name="viewport" content="width=device-width, intial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="resources/css/style.css" />">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="<c:url value="resources/js/jquery.js" />"></script>
        <script src="<c:url value="resources/js/popper.js" />"></script>
        <script src="<c:url value="resources/js/bootstrap.min.js" />"></script>
    </head>
    <body>
        <header>
            <%--============= Navigation Bar =================--%>  
            <div>
                <div id="logo">
                    <img src="<c:url value="/resources/images/logo.png"/>">
                </div>
                <nav class="navbar navbar-expand-md">
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="collapsibleNavbar">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link" href="index">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="about">About Us</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="contact">Contact</a>
                            </li> 
                            <li class="nav-item">
                                <a href="login"><button type="button" class="btn btn-danger">LOG IN</button></a>
                            </li> 
                            <li class="nav-item">
                                <a href="signup"><button type="button" class="btn btn-light">SIGN UP</button></a>
                            </li>  
                        </ul>
                    </div>  
                </nav>
            </div>	
        </header>
        <%--================! Header ===================--%>