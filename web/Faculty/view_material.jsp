<%@include file="faculty_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<div class="col-lg-12 p-4">
    <h2>MATERIALS</h2>
    <table id="myTable" class="display">
    <thead>
        <tr>
            <th>Id</th>
            <th>Standard</th>
            <th>Subject</th>
            <th>Topic</th>
            <th>File</th>
            <th>Delete</th>
        </tr>
    </thead>
    <tbody>  
      <c:forEach var="material" items="${list}">   
       <tr>  
       <td>${material.id}</td>  
       <td>${material.standard}</td>
       <td>${material.subject}</td>
       <td>${material.topic}</td>
       <td>${material.filename}</td>
       <td><button class="btn btn-danger">Delete</button></td>
       </tr>  
   </c:forEach>   
    </tbody>
</table>
</div>

<%@ include file="footer.jsp" %>  

