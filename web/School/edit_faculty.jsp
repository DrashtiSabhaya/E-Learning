<%--============= Header =================--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="school_header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    

<section class="signin">
    <div class="container-fluid">
        <div class="heading">
            <h1><span>Edit</span> Faculty</h1>
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
            <form:form action="saveupdatefac" modelAttribute="faculty" method="POST">
                <form:hidden path="id"/>
                <form:hidden path="school_id"/>       
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-user-circle"></i></span>
                    </div>
                    <form:input class="form-control" path="fname" placeholder="First Name" required="" />
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-user-circle-o"></i></span>
                    </div>
                    <form:input class="form-control" path="mname" placeholder="Middle Name" required="" />
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-user-o"></i></span>
                    </div>
                    <form:input class="form-control" path="lname" placeholder="Last Name" required="" />
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
                    <form:input class="form-control" path="contactno" pattern="[0-9]{10}" placeholder="Contact Number" title="Contact No must be of 10 digits" required=""/>
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-users"></i></span>
                    </div>
                    <form:select path="gender" required="">
                        <form:option value="Male">Male</form:option>
                        <form:option value="Female">Female</form:option>
                    </form:select>
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-id-badge"></i></span>
                    </div>
                    <form:input class="form-control" path="experience" placeholder="Experience" required="" />
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-star"></i></span>
                    </div>
                    <form:input class="form-control" path="subject" placeholder="Enter Subjects" required="" />
                </div>      
                <div class="form-group">
                    <input type="submit" value="Save" class="btn login_btn">
                </div>  
            </form:form>
        </div>
    </div>
</section>

<%@ include file="school_footer.jsp" %>
