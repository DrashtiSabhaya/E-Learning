<%--================ Header ===================--%>
<%@ include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<%--================ View Request ===================--%>
<div class="container-fluid pb-3">
<center class="pt-3"><h3>SCHOOL REQUESTS</h3></center>
<c:if test="${not empty sessionScope.message}">
<div class="alert alert-success">
  <strong>Approved !</strong> School Request is approved.
    <%session.removeAttribute("message"); %>
</div>
</c:if>
<c:if test="${not empty sessionScope.mailstatus}">
<div class="alert alert-info">
  <strong>Mail Sent !</strong> ${sessionScope.mailstatus}
  <%session.removeAttribute("mailstatus"); %>
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
            <th>Approve</th>
            <th>Delete</th>
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
       <td><a href="approve?id=${school.id}&email=${school.email}&name=${school.ownername}"><button class="btn btn-primary">Approve</button></a></td>
       <td><button class="btn btn-danger" data-toggle="modal" data-target="#myModal">Reject</button></td>
       </tr>  
    </c:forEach>   
    </tbody>
</table>

<%--================ Reject Modal ===================--%>
<!-- The Modal -->
  <div class="modal" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Request Reject</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>  
        <!-- Modal body -->
        <div class="modal-body">
        <form action="sendEmail" method="POST" class="quote">
        <div class="form-group">
            <label>Email</label>
            <input type="email" name="recipient" class="form-control" placeholder="School Email" required="">
        </div>
        <div class="form-group">
            <label>Subject</label>
            <input type="text" name="subject" class="form-control" placeholder="Subject Line" required="">
        </div>
        <div class="form-group">
            <label>Reason</label>
            <textarea placeholder="Reason for Rejection.."  class="form-control" name="message" required=""></textarea> 
        </div>
        <input class="btn btn-info" type="submit" value="Send">
        </form>
        </div>    
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>        
      </div>
    </div>
  </div>
<!--! The Modal -->
</div>
<%--================ Footer ===================--%>
<%@ include file="footer.jsp" %>  

