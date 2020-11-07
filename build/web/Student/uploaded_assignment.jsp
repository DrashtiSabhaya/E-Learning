<%--============= Header =================--%>
<%@ include file="student_header.jsp" %>

<%--============= Upload Assignment =================--%>
<center class="container">
    <h3>UPLOADED ASSIGNMENT</h3>
</center>
<div class="col-lg-12 p-3">    
    <table id="myTable" class="display">
        <thead>
            <tr>
                <th>Id</th>
                <th>Subject</th>
                <th>Topic</th>            
                <th>Submit Date</th>
                <th>Status</th>
                <th>Remarks</th>
                <th>View</th>
            </tr>
        </thead>
        <tbody>  
            <c:set var="i" value="1" scope="page" />   
            <c:forEach var="assign" items="${list}">   
                <tr>  
                    <td>${i}</td>
                    <c:set var="i" value="${i + 1}" scope="page"/>
                    <td>${assign.subject}</td>
                    <td>${assign.topic}</td>
                    <td>${assign.submitdate}</td>
                    <td><c:if test="${assign.status == 0}"><span class="text-primary">Submitted</span></c:if>
                        <c:if test="${assign.status == 1}"><span class="text-success">Checked</span></c:if> 
                        </td>
                        <td>${assign.remarks}</td>
                    <td><button class="btn btn-info" data-toggle="modal" data-file="<c:url value="../resources/upload-assignments/${assign.filename}"/>" data-target="#myModal">View</button></td>
                </tr>  
            </c:forEach>   
        </tbody>
    </table>
</div>
<%--================ View Material Modal ===================--%>
<!-- The Modal -->
<div class="modal" id="myModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <!-- Modal Header -->
            <div class="modal-header">
                <h4 class="modal-title">Assignment</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>  
            <!-- Modal body -->
            <div class="modal-body">
                <div class="form-group">
                    <label>Document</label>
                    <div class="embed-responsive embed-responsive-4by3" id="document">
                        <iframe class="embed-responsive-item" src="file" id="file" allowfullscreen></iframe>
                    </div>
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
        var file = $(event.relatedTarget).data('file');
        $(this).find("#file").attr("src",file);
    });
</script>

<%--============= Footer =================--%>
<%@ include file="student_footer.jsp" %>
