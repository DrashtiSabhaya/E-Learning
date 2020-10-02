<%@ include file="student_header.jsp" %>

<div class="col-lg-12 p-3">

<table id="myTable" class="display">
    <thead>
        <tr>
            <th>Id</th>
            <th>Subject</th>
            <th>Chapter</th>            
            <th>Topic</th>           
            <th>Assign Date</th>
            <th>Due Date</th>           
            <th>Download</th>
            <th>Status</th>
        </tr>
    </thead>
        <tbody>  
      <c:forEach var="assign" items="${list}">   
       <tr>  
       <td>${assign.id}</td>  
       <td>${assign.subject}</td>
       <td>${assign.topic}</td>
       <td>${assign.filename}</td>
       <td>${assign.date}</td>
       <td>${assign.duedate}</td>
       <td><button class="btn btn-info">Download</button></td>
       <td>Done</td>
       </tr>  
      </c:forEach>   
    </tbody>
  </table>
</div>

<%@ include file="student_footer.jsp" %>
