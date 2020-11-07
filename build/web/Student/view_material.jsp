<%--============= Header =================--%>
<%@ include file="student_header.jsp" %>
    
<%--============= Subject Material =================--%>
<ul class="breadcrumb m-3">
    <li class="breadcrumb-item"><a href="student_subjects">Subjects</a></li>
    <li class="breadcrumb-item"><a href="view_subject_content?id=${sub_id}&name=${sub_name}">${sub_name}</a></li>
    <li class="breadcrumb-item active">Material</li>
</ul>
<center class="container">
    <h3>SUBJECT MATERIAL</h3>
</center>
<div class="col-lg-12 p-3">
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
                <th>Id</th>
                <th>Subject</th>
                <th>Topic</th>
                <th>Faculty</th>
                <th>View</th>
                <th>Download</th>
            </tr>
        </thead>
        <tbody>  
            <c:set var="i" value="1" scope="page" />   
            <c:forEach var="material" items="${list}">   
                <tr>  
                    <td>${i}</td>
                    <c:set var="i" value="${i + 1}" scope="page"/>
                    <td>${material.subject}</td>
                    <td>${material.topic}</td>
                    <td>${material.faculty}</td>
                    <td><button class="btn btn-info" data-toggle="modal" data-file="<c:url value="../resources/upload-material/${material.filename}"/>" data-target="#myModal">View</button></td>
                    <td><a class="btn btn-success" href="downloadmaterial?filename=${material.filename}">Download</a></td>
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