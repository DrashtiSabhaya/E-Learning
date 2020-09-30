<%@ include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<div class="container-fluid pb-3">
<center class="pt-3"><h3>SCHOOLS LIST</h3></center>
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
            <th>School Id</th>
            <th>School Name</th>
            <th>Owner Name</th>
            <th>Register NO.</th>
            <th>Standard</th>
            <th>Medium</th>
            <th>Address</th>
            <th>Email</th>
            <th>Contact No.</th> 
            <th>Edit</th>
            <th>Remove</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="school" items="${list}">   
       <tr>  
       <td>${school.id}</td>  
       <td>${school.name}</td>
       <td>${school.ownername}</td>
       <td>${school.registerno}</td>
       <td>${school.standard}</td>
       <td>${school.medium}</td>
       <td>${school.address}</td>
       <td>${school.email}</td>
       <td>${school.contactno}</td>
       <td><a href="editschool?id=${school.id}"><button class="btn btn-primary">Edit</button></a></td>
       <td><a href="deleteschool?id=${school.id}"><button class="btn btn-danger" onclick="return confirm('Do you want to Remove School Permanently?')">Remove</button></a></td>
       </tr>  
    </c:forEach>   
    </tbody>
</table>
</div>
<%@ include file="footer.jsp" %>  