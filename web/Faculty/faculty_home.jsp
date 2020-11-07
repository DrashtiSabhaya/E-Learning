<%--================ Header ===================--%>
<%@include file="faculty_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<%--================ Faculty Classes ===================--%>
<section id="boxes">
    <center class="container">
        <h3>YOUR CLASSES</h3>
    </center>
    <div class="container">
        <c:forEach var="class" items="${list}">    
            <div class="box">
                <div class="card">
                    <img class="card-img-top" src="<c:url value="../resources/images/slide1.jpg"/>" alt="Image" style="width:100%">
                    <div class="card-body">
                        <h4 class="card-title">${class.subject} ${class.standard}</h4>
                        <h6 class="card-text">Subject : ${class.subject}</h6>
                        <h6 class="card-text">Standard : ${class.standard}</h6>
                        <h6 class="card-text">Medium : ${class.medium}</h6>
                        <a href="add_content" class="btn btn-success">Add Material</a>
                    </div>
                </div>
            </div>
        </c:forEach>   
    </div>
</section>
    
<%--================ Footer ===================--%>
<%@include file="footer.jsp" %>