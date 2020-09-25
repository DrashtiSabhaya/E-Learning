<%@include file="faculty_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<section id="boxes">
<h3 class="text-center">YOUR CLASSES</h3>
 <div class="container">
   <c:forEach var="class" items="${list}">    
    <div class="box">
      <div class="card">
        <img class="card-img-top" src="<c:url value="../resources/images/slide1.jpg"/>" alt="Image" style="width:100%">
        <div class="card-body">
        <h4 class="card-title">${class.classname}</h4>
        <h6 class="card-text">Subject : Maths</h6>
        <h6 class="card-text">Standard : ${class.standard}</h6>
        <a href="add_content.jsp" class="btn btn-primary">Add Material</a>
        <a href="" class="btn btn-danger">Delete</a>
        </div>
      </div>
    </div>
   </c:forEach>   
  </div>
</section>

<%@include file="footer.jsp" %>