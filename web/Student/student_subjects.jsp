<%@ include file="student_header.jsp" %>

<section id="boxes">
  <div class="container">
    <div class="box">
      <div class="card">
        <img class="card-img-top p-md-5" src="<c:url value="../resources/images/math.png"/>" alt="Card image" style="width:100%">
        <div class="card-body">
        <h4 class="card-title">Maths</h4>
        <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
        <a href="view_subject_content.jsp" class="btn btn-primary">View</a>
        </div>
      </div>
    </div>
  <div class="box">
      <div class="card">
        <img class="card-img-top p-md-5" src="<c:url value="../resources/images/science.png"/>" alt="Card image" style="width:100%">
        <div class="card-body">
        <h4 class="card-title">Science</h4>
        <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
        <a href="#" class="btn btn-primary">View</a>
        </div>
      </div>
    </div>
    <div class="box">
      <div class="card">
        <img class="card-img-top p-md-5" src="<c:url value="../resources/images/com_1.png"/>" alt="Card image" style="width:100%">
        <div class="card-body">
        <h4 class="card-title">Computer</h4>
        <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
        <a href="#" class="btn btn-primary">View</a>
        </div>
      </div>
    </div>
    <div class="box">
      <div class="card">
        <img class="card-img-top p-md-5" src="<c:url value="../resources/images/langu.png"/>" alt="Card image" style="width:100%">
        <div class="card-body">
        <h4 class="card-title">English</h4>
        <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
        <a href="#" class="btn btn-primary">View</a>
        </div>
      </div>
    </div>    
  </div>
</section>

<%@ include file="student_footer.jsp" %>
