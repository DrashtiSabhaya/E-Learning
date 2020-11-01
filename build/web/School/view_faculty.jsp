<%-- 
    Document   : view_faculty
    Created on : 13 Aug, 2020, 3:21:26 PM
    Author     : Drashti
--%>
<%@ include file="school_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<center class="container"><h3>FACULTY LIST</h3></center>
<div class="col-lg-12 p-3">
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
    
    <table id="myTable" class="display">
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact</th>
                <th>Gender</th>
                <th>Experience</th>
                <th>Subjects</th>
                <th>Photo</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:set var="i" value="1" scope="page" />   
            <c:forEach var="faculty" items="${list}">   
                <tr>  
                    <td>${i}</td>
                    <c:set var="i" value="${i + 1}" scope="page"/>
                    <td>${faculty.fname} ${faculty.mname} ${faculty.lname}</td>
                    <td>${faculty.email}</td>
                    <td>${faculty.contactno}</td>
                    <td>${faculty.gender}</td>
                    <td>${faculty.experience}</td>
                    <td>${faculty.subject}</td>
                    <td><img style="height:100px; width:100px" src="<c:url value="../resources/photos/${faculty.filename}"/>"></td>
                    <td><a href="edit_faculty?id=${faculty.id}" class="btn btn-primary">Edit</a></td>
                    <td><a href="deletefaculty?id=${faculty.id}" class="btn btn-danger" onclick="return confirm('Do you want to Delete?')">Delete</a></td>
                </tr>  
            </c:forEach>   
        </tbody>
    </table>
</div>

<%@ include file="school_footer.jsp" %>
