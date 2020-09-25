<%-- 
    Document   : view_faculty
    Created on : 13 Aug, 2020, 3:21:26 PM
    Author     : Drashti
--%>
<%@ include file="school_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<div class="col-lg-12 p-3">
<center><h3>FACULTY LIST</h3></center>
    <table id="myTable" class="display">
    <thead>
        <tr>
            <th>Faculty Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Contact</th>
            <th>Gender</th>
            <th>Experience</th>
            <th>Photo</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="faculty" items="${list}">   
       <tr>  
       <td>${faculty.id}</td>  
       <td>${faculty.fname}</td>
       <td>${faculty.email}</td>
       <td>${faculty.contactno}</td>
       <td>${faculty.gender}</td>
       <td>${faculty.experience}</td>
       <td></td>
       <td><button class="btn btn-primary">Edit</button></td>
       <td><button class="btn btn-danger">Delete</button></td>
       </tr>  
   </c:forEach>   
</tbody>
</table>
</div>

<%@ include file="school_footer.jsp" %>
