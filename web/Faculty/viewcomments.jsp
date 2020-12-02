<%--================ Header ===================--%>
<%@ include file="faculty_header.jsp" %>

<%--============== View Request =================--%>
<center class="container">
    <h3>Comment List</h3>
</center>
<div class="container-fluid pb-3">
    <table id="myTable" class="display">
        <thead>
            <tr>
                <th>Id</th>
                <th>Student Username</th>
                <th>Comment/Question</th>
                <th>Date</th>
                <th>Reply</th>
            </tr>
        </thead>
        <tbody>
            <c:set var="i" value="1" scope="page" />
            <c:forEach var="comments" items="${list}">   
                <tr>  
                    <td>${i}</td>
                    <c:set var="i" value="${i + 1}" scope="page"/>
                    <td>${comments.username}</td>
                    <td>${comments.comment}</td>
                    <td>${comments.date}</td>
                    <td><button class="btn btn-info" data-toggle="modal" data-val="${comments.comment}" data-subject="${comments.username}" data-target="#myModal">Reply</button></td>
                </tr>  
            </c:forEach>   
        </tbody>
    </table>
    
    <%--================ View Comment Modal ===================--%>
    <!-- The Modal -->
    <div class="modal" id="myModal">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="modal-title">Comment</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>  
                <!-- Modal body -->
                <div class="modal-body">
                    <form action="" method="POST" class="quote">
                        <div class="form-group">
                            <label>Student Username</label>
                            <input type="text" name="subject" id="subject" class="form-control" placeholder="Subject Line" disabled="">
                        </div>
                        <div class="form-group">
                            <label>Comment</label>
                            <textarea placeholder="Comment" id="message"  class="form-control" name="message" disabled=""></textarea> 
                        </div>
                        <div class="form-group">
                            <label>Reply</label>
                            <textarea placeholder="Write your Reply.." id="reply"  class="form-control" name="reply"></textarea> 
                        </div>
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
<script>
    $('#myModal').on('show.bs.modal', function(event) {
        var message = $(event.relatedTarget).data('val');
        var subject = $(event.relatedTarget).data('subject');
        $(this).find("#subject").val(subject);
        $(this).find("#message").val(message);
    });
</script>
<%--================ Footer ===================--%>
<%@ include file="footer.jsp" %>  

