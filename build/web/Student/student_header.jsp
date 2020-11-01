<%-- 
    Document   : school_header
    Created on : 13 Aug, 2020, 3:26:17 PM
    Author     : Drashti
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="shortcut icon" href="<c:url value="../resources/images/logo-2.png" />">
        <title>Learn</title>
        <meta name="viewport" content="width=device-width, intial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="../resources/css/style.css" />">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="<c:url value="../resources/css/dt.css" />">   
        <script src="<c:url value="../resources/js/dt.js" />"></script>
        <script src="<c:url value="../resources/js/popper.js" />"></script>
        <script type="text/javascript">
            $(document).ready( function () {
                $('#myTable').DataTable();
            } );
        </script>
    </head>
    <body>
        <header>
            <%--============= Check for Login =================--%>  
            <c:if test="${empty sessionScope.username}">
                <script type="text/javascript">
                    alert("Please Login first!");
                    window.location.href='../login';
                </script> 
            </c:if>
            <%--============= Navigation Bar =================--%>  
            <div class="">
                <div id="logo">
                    <img src="<c:url value="../resources/images/logo.png"/>">  
                </div>
                <nav class="navbar navbar-expand-md font justify-content-center">
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="" id="collapsibleNavbar">
                        <ul class="navbar-nav ml-auto justify-content-center text-white">
                            <li class="nav-item">
                                <a class="nav-link" href="student_home">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="student_subjects">Subjects</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">Assignments</a>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item font" href="view_assignment">View Assignments</a>
                                    <a class="dropdown-item font" href="upload_assign">Uploaded Assignments</a>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a href="logout"><button type="button" class="btn btn-danger">LOG OUT</button></a>
                            </li> 
                        </ul>
                    </div>  
                </nav>
            </div>	
        </header>
