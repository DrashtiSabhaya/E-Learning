<%@ include file="student_header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:set var="subject_id" value="1" scope="session"  />

<section>
<div class="container-fluid">
    <ul class="breadcrumb m-3">
      <li class="breadcrumb-item"><a href="student_subjects.jsp">Subjects</a></li>
      <li class="breadcrumb-item"><a href="view_subject_content.jsp">Maths</a></li>
      <li class="breadcrumb-item active">Videos</li>
    </ul>    
  <div class="row">
    <div class="col-9">
        <div class="container">
         <h2>Maths</h2>
         </div>
        <div class="embed-responsive embed-responsive-21by9"id="video">
            <iframe class="embed-responsive-item" src="https://www.youtube.com/embed/${fn:substringAfter(link, "v=")}" allowfullscreen></iframe>
        </div>
    </div>
    <div class="col-3">
    <div class="container">
    <h2>Next Chapter</h2>
    </div>
    <div class="overflow-auto border" style="height: 425px">
        <div class="list-group">
            <c:forEach var="list" items="${topic_list}"> 
                <a href="#" class="list-group-item list-group-item-action" />${list}</a>
            </c:forEach>
        </div>
    </div>
    </div>
  </div>
</div>
<div class="container-fluid">
    <div class="row m-3">
      <div class="row col-12 border-top primary">
         <div class="container">
         <h2>Discussion Forum</h2>
         </div>
        <div class="container">
            <ul class="list-group list-group-flush">
                <li class="list-group-item">Posted By : Drashti <small><i>Posted on February 19, 2016</i></small><br> Comment : Nullam et eros sit amet magna dictum pulvinar.</li>
                <li class="list-group-item">Posted By : Drashti <small><i>Posted on February 19, 2016</i></small><br> Comment : Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eget metus a urna pulvinar feugiat</li>
                <li class="list-group-item">Posted By : Drashti <small><i>Posted on February 19, 2016</i></small><br> Comment : Nullam et eros sit amet magna dictum pulvinar.</li>
                <li class="list-group-item">Posted By : Drashti <small><i>Posted on February 19, 2016</i></small><br> Comment : Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eget metus a urna pulvinar feugiat</li>
                <li class="list-group-item">Posted By : Drashti <small><i>Posted on February 19, 2016</i></small><br> Comment : Nullam et eros sit amet magna dictum pulvinar.</li>
                <li class="list-group-item">Posted By : Drashti <small><i>Posted on February 19, 2016</i></small><br> Comment : Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eget metus a urna pulvinar feugiat</li>            
            </ul>
            <ul class="pagination pagination justify-content-end">
                <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                <li class="page-item"><a class="page-link" href="#">1</a></li>
                <li class="page-item active"><a class="page-link" href="#">2</a></li>
                <li class="page-item"><a class="page-link" href="#">3</a></li>
                <li class="page-item"><a class="page-link" href="#">Next</a></li>
            </ul>
            <section class="jumbotron">
            <div class="container">
                <h2>Discuss Your Question..</h2><br>
                <form>
                    <textarea class="input-group form-control" type="text" name="comment" placeholder="Enter Your Question.."></textarea>
                    <br>
                    <div class="form-group">
			<input type="submit" value="POST" class="btn login_btn">
                    </div>
                </form>
            </div>
        </section>
        </div>
      </div>
    </div>
</div>
</section>
<%@ include file="student_footer.jsp" %>
