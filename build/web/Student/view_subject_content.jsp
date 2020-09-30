<%@ include file="student_header.jsp" %>

<section id="boxes">
    <ul class="breadcrumb">
      <li class="breadcrumb-item"><a href="student_subjects">Subjects</a></li>
      <li class="breadcrumb-item active">${name}</li>
    </ul>
    <div class="container">
    <div class="box">
      <div class="card">
        <img class="card-img-top p-md-5" src="<c:url value="../resources/images/vid.png"/>" alt="Card image" style="width:100%">
        <div class="card-body">
        <h4 class="card-title">Videos</h4>
        <a href="view_video?id=${id}" class="btn btn-primary">View</a>
        </div>
      </div>
    </div>
  <div class="box">
      <div class="card">
        <img class="card-img-top p-md-5" src="<c:url value="../resources/images/material.png"/>" alt="Card image" style="width:100%">
        <div class="card-body">
        <h4 class="card-title">Material</h4>
        <a href="view_material" class="btn btn-primary">View</a>
        </div>
      </div>
    </div>
    <div class="box">
      <div class="card">
        <img class="card-img-top p-md-5" src="<c:url value="../resources/images/assig.png"/>" alt="Card image" style="width:100%">
        <div class="card-body">
        <h4 class="card-title">Assignments</h4>
        <a href="view_assignment" class="btn btn-primary">View</a>
        </div>
      </div>
    </div>
    <div class="box">
      <div class="card">
        <img class="card-img-top p-md-5" src="<c:url value="../resources/images/quiz.png"/>" alt="Card image" style="width:100%">
        <div class="card-body">
        <h4 class="card-title">Quiz</h4>
        <a href="#" class="btn btn-primary">View</a>
        </div>
      </div>
    </div>    
  </div>
</section>
<%@ include file="student_footer.jsp" %>
