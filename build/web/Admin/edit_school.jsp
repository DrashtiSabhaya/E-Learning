<%--============= Header =================--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    
<%--============= Edit School =================--%>
<a href="list_school" class="btn btn-success mt-3 ml-5">Back</a>
<section class="signin">
    <div class="container-fluid">
        <div class="heading"> 
            <h1>Edit School</h1>
        </div>
        <div class="page-card">
            <c:if test="${not empty error}">
                <div class="alert alert-danger">
                    <strong>Failed !</strong> ${error}
                </div>
            </c:if>
            <c:if test="${not empty message}">
                <div class="alert alert-success">
                    <strong>Success !</strong> ${message}
                </div>
            </c:if>
            <form:form action="saveupdate" modelAttribute="school" method="POST">
                <form:hidden path="id"/>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-university"></i></span>
                    </div>
                    <form:input class="form-control" path="name" placeholder="School Name" required="" />
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-user-o"></i></span>
                    </div>
                    <form:input class="form-control" path="registerno" placeholder="School Registration ID" required="" />
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-envelope"></i></span>
                    </div>
                    <form:input class="form-control" path="email" placeholder="Email Address" required="" />
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-phone"></i></span>
                    </div>
                    <form:input class="form-control" path="contactno" pattern="[0-9]{10}" placeholder="Contact Number" required="" />
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-user"></i></span>
                    </div>
                    <form:input  class="form-control" path="ownername" placeholder="School Owner Name" required="" />
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-address-card"></i></span>
                    </div>
                    <form:input class="form-control" placeholder="Address" path="address" required="" />
                </div>
                Enter range i.e. 1-7 or 1-10
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-star"></i></span>
                    </div>
                    <form:input class="form-control" placeholder="Enter Standards" path="standard" />
                </div>
                Enter Comma Separated Values
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-check-square-o"></i></span>
                    </div>
                    <form:input class="form-control" placeholder="School Medium" path="medium" required="" />
                </div>          
                <div class="form-group">
                    <input type="submit" name="update" value="Update" class="btn login_btn">
                </div>  
            </form:form>
        </div>
    </div>
</section>
    
<%--============= Footer =================--%>
<%@ include file="footer.jsp" %>