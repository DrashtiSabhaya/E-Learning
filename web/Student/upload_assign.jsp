<%--============= Header =================--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="student_header.jsp" %>

<%--============= Upload Assignment =================--%>
<section class="login">
    <div class="container-fluid">
        <div class="heading">
            <h1><span>UPLOAD </span>ASSIGNMENT</h1>
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
            <form action="uploadassign" method="POST" enctype="multipart/form-data">
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-tasks"></i></span>
                    </div>
                    <form:select name="subject" path="subject" required="">
                        <form:option value="NONE" label="Select Subject" disabled="" />
                        <form:options items="${subject}"/>
                    </form:select>
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-file"></i></span>
                    </div>
                    <form:select name="topic" path="topic" required="">
                        <form:option value="NONE" label="Select Assignment" disabled="" />
                        <form:options items="${topic}"/>
                    </form:select>
                </div>
                <div class="custom-file mb-3">
                    <input type="file" class="custom-file-input" id="customFile" name="file">
                    <label class="custom-file-label" for="customFile">Choose Assignment File</label>
                </div>
                <div class="form-group">
                    <input type="submit" value="Upload" class="btn login_btn"> 
                </div> 
            </form>
        </div>
    </div>
</section>

<%--============= Footer =================--%>
<%@ include file="student_footer.jsp" %>
