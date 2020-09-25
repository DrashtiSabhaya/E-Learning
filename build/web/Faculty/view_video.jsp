<%-- 
    Document   : view-video
    Created on : 19 Sep, 2020, 10:17:04 AM
    Author     : Drashti
--%>

<%@include file="faculty_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<div class="col-lg-12 p-4">
    <h2>Videos</h2>
    <table id="myTable" class="display">
    <thead>
        <tr>
            <th>Id</th>
            <th>Standard</th>
            <th>Subject</th>
            <th>Topic</th>
            <th>Link</th>
            <th>Delete</th>
        </tr>
    </thead>
    <tbody>  
    <c:forEach var="video" items="${list}">   
       <tr>  
       <td>${video.id}</td>  
       <td>${video.standard}</td>
       <td>${video.subject}</td>
       <td>${video.topic}</td>
       <td>${video.link}</td>
       <td><button class="btn btn-danger">Delete</button></td>
       </tr>  
    </c:forEach>   
    </tbody>
</table>
</div>

<%@ include file="footer.jsp" %>  

