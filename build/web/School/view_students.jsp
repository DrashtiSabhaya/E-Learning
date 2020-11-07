<%-- 
    Document   : view_students
    Created on : 13 Aug, 2020, 3:23:21 PM
    Author     : Drashti
--%>
<%--============= Header =================--%>
<%@ include file="school_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<%--============= Student List =================--%>
<center class="container">
    <h3>STUDENTS LIST</h3>
</center>
<c:if test="${not empty sessionScope.error}">
    <div class="alert alert-danger">
        <strong>Failed !</strong> ${sessionScope.error}
        <%session.removeAttribute("error"); %>
    </div>
</c:if>
<c:if test="${not empty sessionScope.message}">
    <div class="alert alert-success">
        <strong>Success !</strong> ${sessionScope.message}
        <%session.removeAttribute("message"); %>
    </div>
</c:if>
<div class="col-lg-12 p-3">
    <table id="myTable" class="display">
        <thead>
            <tr>
                <th>ID</th>
                <th>Roll no</th>
                <th>Std</th>
                <th>Medium</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact</th>
                <th>Gender</th>
                <th>Birth Date</th>
                <th>Photo</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:set var="i" value="1" scope="page" />
            <c:forEach var="student" items="${list}">   
                <tr>  
                    <td>${i}</td>
                    <c:set var="i" value="${i + 1}" scope="page"/>
                    <td>${student.rollno}</td>  
                    <td>${student.standard}</td>  
                    <td>${student.medium}</td>   
                    <td>${student.fname} ${student.mname} ${student.lname}</td>
                    <td>${student.email}</td>
                    <td>${student.contactno}</td>
                    <td>${student.gender}</td>
                    <td>${student.dob}</td>
                    <td><img style="height:100px; width:100px" src="<c:url value="../resources/photos/${student.filename}"/>"></td>
                    <td><a href="edit_student?id=${student.id}" class="btn btn-primary">Edit</a></td>
                    <td><a href="deletestud?id=${student.id}" class="btn btn-danger" onclick="return confirm('Do you want to Delete?')">Delete</a></td>       </tr>  
                </c:forEach>
        </tbody>
    </table>
</div>

<%--============= Footer =================--%>
<%@ include file="school_footer.jsp" %>
