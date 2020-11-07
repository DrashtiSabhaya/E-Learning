<%-- 
    Document   : view-video
    Created on : 19 Sep, 2020, 10:17:04 AM
    Author     : Drashti
--%>
<%--================ Header ===================--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@include file="faculty_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<%--================ View Videos ===================--%>
<center class="container">
    <h3>VIDEOS</h3>
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
                <th>Medium</th>
                <th>Subject</th>
                <th>Topic</th>
                <th>Video</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:set var="i" value="1" scope="page" />
            <c:forEach var="video" items="${list}">   
                <tr>  
                    <td>${i}</td>
                    <c:set var="i" value="${i + 1}" scope="page"/>
                    <td>${video.standard}</td>
                    <td>${video.medium}</td>
                    <td>${video.subject}</td>
                    <td>${video.topic}</td>
                    <td>
                        <div class="embed-responsive embed-responsive-4by3" id="video">
                            <iframe class="embed-responsive-item" src="https://www.youtube.com/embed/${fn:substringAfter(link, "v=")}" allowfullscreen></iframe>
                        </div>
                    </td>
                    <td><a href="deletevid?id=${video.id}" class="btn btn-danger" onclick="return confirm('Do you want to Delete?')">Delete</a></td>
                </tr>  
            </c:forEach>   
        </tbody>
    </table>
</div>

<%--================ Footer ===================--%>           
<%@ include file="footer.jsp" %>  

