<%@ include file="school_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<div class="col-lg-12 p-3">
<table id="myTable" class="display">
    <thead>
        <tr>
            <th>Standard Id</th>
            <th>Standard</th>
            <th>Medium</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="standard" items="${list}">   
       <tr>  
       <td>${standard.id}</td>  
       <td>${standard.standard}</td>
       <td>${standard.medium}</td>
       <td><button class="btn btn-primary">Edit</button></td>
       <td><button class="btn btn-danger">Delete</button></td>
       </tr>  
   </c:forEach>   
    </tbody>
</table>
</div>

<%@ include file="school_footer.jsp" %>