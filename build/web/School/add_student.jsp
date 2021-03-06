<%-- 
    Document   : add_student
    Created on : 13 Aug, 2020, 4:13:53 PM
    Author     : Drashti
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--================ Header ===================--%>
<%@ include file="school_header.jsp" %>

<%--================ Add Student ===================--%>
<section class="signin">
    <div class="container-fluid">
        <div class="heading">
            <h1><span>ADD</span> Student</h1>
        </div>
        <div class="page-card">
            <c:if test="${not empty error}">
                <div class="alert alert-danger">
                    <strong>Failed !</strong> ${error}
                    <%session.removeAttribute("error"); %>
                </div>
            </c:if>
            <c:if test="${not empty message}">
                <div class="alert alert-success">
                    <strong>Success !</strong> ${message}
                    <%session.removeAttribute("message"); %>
                </div>
            </c:if> 
            <form action="savestudent" method="POST" enctype="multipart/form-data">
                <input type="hidden" name="school_id" value="${sessionScope.id}">       
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-users"></i></span>
                    </div>
                    <form:select name="standard" path="standard" required="">
                        <form:option value="NONE" label="Select Standard" />
                        <form:options items="${school_standard}"/>
                    </form:select>
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-tasks"></i></span>
                    </div>
                    <form:select name="medium" path="medium" required="">
                        <form:option value="NONE" label="Select Medium" disabled="" />
                        <form:options items="${medium}"/>
                    </form:select>
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-id-badge"></i></span>
                    </div>
                    <input type="text" class="form-control" name="rollno" placeholder="Enter Roll No." required="">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-user-circle"></i></span>
                    </div>
                    <input type="text" class="form-control" name="fname" placeholder="First Name" required="">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-user-circle-o"></i></span>
                    </div>
                    <input type="text" class="form-control" name="mname" placeholder="Middle Name" required="">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-user-o"></i></span>
                    </div>
                    <input type="text" class="form-control" name="lname" placeholder="Last Name" required="">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-envelope"></i></span>
                    </div>
                    <input type="email" class="form-control" name="email" placeholder="Email Address" required="">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-phone"></i></span>
                    </div>
                    <input type="text"class="form-control" name="contactno" placeholder="Contact Number" required="">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-users"></i></span>
                    </div>
                    <select name="gender">
                        <option selected="" disabled="">Select Gender</option>
                        <option value="Male">Male</option>
                        <option value="Female">Female</option>
                    </select>
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-calendar"></i></span>
                    </div>
                    <input type="Date" class="form-control" name="dob" placeholder="Birth Date" required="">
                </div>
                <div class="custom-file mb-3">
                    <input type="file" class="custom-file-input" accept=".jpg,.jpeg,.png" id="customFile" name="file">
                    <label class="custom-file-label" for="customFile">Choose Photo</label>
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-user"></i></span>
                    </div>
                    <input type="text" class="form-control" name="username" placeholder="Enter Username" required="">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-key"></i></span>
                    </div>
                    <input type="password" class="form-control" name="password" placeholder="Enter Password" required="">
                </div>
                <div class="form-group">
                    <input type="submit" value="Save" class="btn login_btn">
                </div>  
            </form>
        </div>
    </div>
</section>

<%--================ Footer ===================--%>                
<%@ include file="school_footer.jsp" %>

