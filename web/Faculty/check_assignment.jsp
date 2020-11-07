<%--================ Header ===================--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@include file="faculty_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<%--================ Check Assignment ===================--%>
<a href="review" class="btn btn-success m-3">Back</a>    
<center class="container">
    <h3>CHECK ASSIGNMENT</h3>
</center>
<div class="col-lg-12 p-3">
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
                <th>Id</th>
                <th>Standard</th>
                <th>Subject</th>
                <th>Topic</th>
                <th>Student Name</th>
                <th>Submitted Date</th>
                <th>View</th>
                <th>Download</th>
            </tr>
        </thead>
        <tbody>
            <c:set var="i" value="1" scope="page" />
            <c:forEach var="assign" items="${list}">   
                <tr>  
                    <td>${i}</td>
                    <c:set var="i" value="${i + 1}" scope="page"/>
                    <td>${assign.std}</td>
                    <td>${assign.subject}</td>
                    <td>${assign.topic}</td>
                    <td>${assign.name}</td>
                    <td>${assign.submitdate}</td>
                    <td><button class="btn btn-info" data-toggle="modal" data-val="${assign.id}" data-file="<c:url value="../resources/upload-assignments/${assign.filename}"/>" data-target="#myModal">View</button></td>
                    <td><a class="btn btn-success" href="downloadassign?filename=${assign.filename}">Download</a></td>
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
                <h4 class="modal-title">Check Assignment</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>  
            <!-- Modal body -->
            <div class="modal-body">
                <form action="addremarks" method="POST" class="quote">
                    <input type="hidden" name="id" id="assignid" value="">
                    <div class="form-group">
                        <label>Add Your Remarks</label>
                        <input type="text" name="remarks" class="form-control" placeholder="Remarks.." required="">
                    </div>
                    <input class="btn btn-info" type="submit" value="Mark as Checked">
                </form>
                <div class="form-group">
                    <label></label>
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
        var id = $(event.relatedTarget).data('val');
        $(this).find("#file").attr("src",file);
        $(this).find("#assignid").val(id);
    });
</script>
    
<%--================ Footer ===================--%>  
<%@ include file="footer.jsp" %>