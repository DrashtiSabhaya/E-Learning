<%-- 
    Document   : view_students
    Created on : 13 Aug, 2020, 3:23:21 PM
    Author     : Drashti
--%>

<%@ include file="school_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<div class="col-lg-12 p-3">
<table id="myTable" class="display">
    <thead>
        <tr>
            <th>ID</th>
            <th>Roll no</th>
            <th>Standard</th>
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
    <c:forEach var="student" items="${list}">   
       <tr>  
       <td>${student.id}</td>  
       <td>${student.rollno}</td>  
       <td>${student.standard_id}</td>  
       <td>${student.medium}</td>   
       <td>${student.fname} ${student.mname} ${student.lname}</td>
       <td>${student.email}</td>
       <td>${student.contactno}</td>
       <td>${student.gender}</td>
       <td>${student.dob}</td>
       <td></td>
       <td><button class="btn btn-primary">Edit</button></td>
       <td><button class="btn btn-danger">Delete</button></td>
       </tr>  
   </c:forEach>
    </tbody>
</table>
</div>

<%@ include file="school_footer.jsp" %>
