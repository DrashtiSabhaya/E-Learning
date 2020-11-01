<%@ include file="student_header.jsp" %>
<div class="col-lg-12 p-3">
    
    <table id="myTable" class="display">
        <thead>
            <tr>
                <th>Id</th>
                <th>Subject</th>
                <th>Topic</th>
                <th>File</th>
                <th>Download</th>
            </tr>
        </thead>
        <tbody>  
            <c:forEach var="material" items="${list}">   
                <tr>  
                    <td>${material.id}</td>  
                    <td>${material.subject}</td>
                    <td>${material.topic}</td>
                    <td>${material.filename}</td>
                    <td><button class="btn btn-info">Download</button></td>
                </tr>  
            </c:forEach>   
        </tbody>
    </table>
</div>
    
<%@ include file="student_footer.jsp" %>