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
    <link rel="stylesheet" type="text/css" href="<c:url value="../resources/css/style.css" />">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="<c:url value="../resources/css/dt.css" />">
    <script src="<c:url value="../resources/js/jquery.js" />"></script>
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
    <ul class="navbar-nav ml-auto justify-content-center">
      <li class="nav-item">
        <a class="nav-link" href="school_home">Home</a>
      </li>
      <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">Standards</a>
      <div class="dropdown-menu">
        <a class="dropdown-item font" href="add_standard">Add Standard</a>
        <a class="dropdown-item font" href="view_standard">View Standards</a>
      </div>
      </li>
      <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">Subjects</a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="add_subject">Add Subjects</a>
        <a class="dropdown-item" href="view_subjects">View Subjects</a>
      </div>
      </li>
      <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">Faculty</a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="add_faculty">Add Faculty</a>
        <a class="dropdown-item" href="view_faculty">View Faculty</a>
      </div>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">Students</a>
              <div class="dropdown-menu">
        <a class="dropdown-item" href="add_student">Add Students</a>
        <a class="dropdown-item" href="view_students">View Students</a>
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
