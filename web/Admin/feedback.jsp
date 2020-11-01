<%--============= Header =================--%>
<%@ include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<%--============= FeedBack List =================--%>
<div class="col-lg-12 p-4">
    <center><h3>FEEDBACK</h3></center>
    
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
                <th>Feedback Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Message</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>  
            <c:forEach var="feedback" items="${list}">   
                <tr>  
                    <td>${feedback.id}</td>  
                    <td>${feedback.name}</td>
                    <td>${feedback.email}</td>
                    <td>${feedback.message}</td>
                    <td><a href="deletefeedback?id=${feedback.id}" class="btn btn-danger" onclick="return confirm('Do you want to Delete?')">Delete</a></td>
                </tr>  
            </c:forEach>   
        </tbody>
    </table>
</div>
<%--============= Footer =================--%>
<%@ include file="footer.jsp" %>  

