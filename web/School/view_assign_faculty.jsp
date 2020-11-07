<%-- 
    Document   : view_assign_faculty
    Created on : 13 Aug, 2020, 3:20:31 PM
    Author     : Drashti
--%>
<%--============= Header =================--%>
<%@ include file="school_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<%--============= Assigned Subject =================--%>
<center class="container">
    <h3>ASSIGNED SUBJECTS</h3>
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
                <th>Subject</th>
                <th>Standard</th>
                <th>Medium</th>
                <th>Faculty</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:set var="i" value="1" scope="page" />
            <c:forEach var="subject" items="${list}">   
                <tr>  
                    <td>${i}</td>
                    <c:set var="i" value="${i + 1}" scope="page"/>
                    <td>${subject.subject}</td>
                    <td>${subject.standard}</td>
                    <td>${subject.medium}</td>
                    <td>${subject.faculty}</td>
                    <td><a href="deleteassign?id=${subject.id}" class="btn btn-danger" onclick="return confirm('Do you want to Delete?')">Delete</a></td>
                </tr>  
            </c:forEach>
        </tbody>
    </table>
</div>

<%--============= Footer =================--%>            
<%@ include file="school_footer.jsp" %>
