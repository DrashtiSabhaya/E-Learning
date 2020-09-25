<%-- 
    Document   : add_subject
    Created on : 17 Aug, 2020, 3:39:59 PM
    Author     : Drashti
--%>

<%@ include file="school_header.jsp" %>

<section class="login">
  <div class="container-fluid">
    <div class="heading">
    <h1><span>Add </span>Subject</h1>
    </div>
    <div class="page-card">
    <form action="savesubject" method="POST">
      <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-users"></i></span>
        </div>
        <select name="standard">
        <option selected="" disabled="">Select Standard</option>
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        </select>
      </div>
      <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-tasks"></i></span>
        </div>
        <select name="medium">
          <option selected="" disabled="">Select Medium</option>
          <option value="English">English</option>
          <option value="Gujarati">Gujarati</option>
          <option value="Hindi">Hindi</option>
        </select>
      </div>
      <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-asterisk"></i></span>
        </div>
        <input type="text" class="form-control" name="name" placeholder="Enter Subject Name">
      </div>                   
      <div class="form-group">
        <input type="submit" value="Save" class="btn login_btn"> 
        </div> 
      </form>
    </div>
  </div>
</section>


<%@ include file="school_footer.jsp" %>
