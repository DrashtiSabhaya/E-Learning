<%--================ Header ===================--%>
<%@ include file="header.jsp" %>

<%--============== View Request =================--%>
<center class="container">
    <h3>SENT MAILS</h3>
</center>
<div class="container-fluid pb-3">
<table id="myTable" class="display">
    <thead>
        <tr>
            <th>Id</th>
            <th>School Id</th>
            <th>Email</th>
            <th>Subject</th> 
            <th>Date</th>
            <th>View</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="email" items="${list}">   
        <tr>  
            <td>${email.id}</td>  
            <td>${email.school_id}</td>
            <td>${email.mailto}</td>
            <td>${email.subject}</td>
            <td>${email.date}</td>
            <td><button class="btn btn-info" data-toggle="modal" data-val="${email.message}" data-subject="${email.subject}" data-email="${email.mailto}" data-target="#myModal">View</button></td>
        </tr>  
    </c:forEach>   
    </tbody>
</table>

<%--================ Reject Modal ===================--%>
<!-- The Modal -->
  <div class="modal" id="myModal">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">School Mail</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>  
        <!-- Modal body -->
        <div class="modal-body">
         <div class="form-group">
            <label>Email</label>
            <input type="email" name="recipient" id="email" class="form-control" placeholder="School Email" disabled="">
        </div>
        <div class="form-group">
            <label>Subject</label>
            <input type="text" name="subject" id="subject" class="form-control" placeholder="Subject Line" disabled="">
        </div>
        <div class="form-group">
            <label>Reason</label>
            <textarea placeholder="Reason for Rejection.." id="message"  class="form-control" name="message" disabled=""></textarea> 
        </div>
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
<script>
$('#myModal').on('show.bs.modal', function(event) {
  var message = $(event.relatedTarget).data('val');
  var email = $(event.relatedTarget).data('email');
  var subject = $(event.relatedTarget).data('subject');
  $(this).find("#subject").val(subject);
  $(this).find("#email").val(email);
  $(this).find("#message").val(message);
});
</script>
<%--================ Footer ===================--%>
<%@ include file="footer.jsp" %>  

