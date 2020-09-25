<%-- 
    Document   : view_subjects
    Created on : 13 Aug, 2020, 3:20:31 PM
    Author     : Drashti
--%>

<%@ include file="school_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<div class="col-lg-12 p-3">

<table id="myTable" class="display">
    <thead>
        <tr>
            <th>Subject Id</th>
            <th>Subject Name</th>
            <th>Standard</th>
            <th>Medium</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="subject" items="${list}">   
       <tr>  
       <td>${subject.id}</td>  
       <td>${subject.name}</td>
       <td>${subject.standard}</td>
       <td>${subject.medium}</td>
       <td><button class="btn btn-primary">Edit</button></td>
       <td><button class="btn btn-danger">Delete</button></td>
       </tr>  
   </c:forEach>
</tbody>
</table>
</div>

<%@ include file="school_footer.jsp" %>
