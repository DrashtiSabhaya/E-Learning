<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--============= Header =================--%>
<%@ include file="school_header.jsp" %>

<%--============= Add New Standard =================--%>
<section class="login">
  <div class="container-fluid">
    <div class="heading">
    <h1><span>Add </span>Standard</h1>
    </div>
    <div class="page-card">
        <c:if test="${not empty error}">
        <div class="alert alert-danger">
          <strong>Denied !</strong> ${error}
          <%session.removeAttribute("error"); %>
        </div>
        </c:if>
        <c:if test="${not empty message}">
        <div class="alert alert-success">
          <strong>Done !</strong> ${message}
          <%session.removeAttribute("message"); %>
        </div>
        </c:if>
     <form action="addstandard" method="POST">
         <input type="hidden" name="school_id" value="${sessionScope.id}">
      <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-users"></i></span>
        </div>
        <form:select name="standard" path="standard" required="">
            <form:option value="NONE" label="Select Standard" disabled=""/>
            <form:options items="${standard}"/>
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
        <div class="form-group">
          <input type="submit" value="Save" class="btn login_btn"> 
        </div> 
      </form>
    </div>
  </div>
</section>
         
<%--============= Footer =================--%>
<%@ include file="school_footer.jsp" %>
