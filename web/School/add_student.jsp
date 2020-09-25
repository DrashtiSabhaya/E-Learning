<%-- 
    Document   : add_student
    Created on : 13 Aug, 2020, 4:13:53 PM
    Author     : Drashti
--%>

<%@ include file="school_header.jsp" %>

<section class="signin">
  <div class="container-fluid">
    <div class="heading">
        <h1><span>ADD</span> Student</h1>
    </div>
    <div class="page-card">
     <form action="savestudent" method="POST">
      <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-users"></i></span>
        </div>
        <select name="standard_id">
        <option selected="" disabled="">Select Standard</option>
        <option value="1">1</option>
        <option value="2">2</option>
        </select>
      </div>
      <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-tasks"></i></span>
        </div>
          <select name="medium">
          <option selected="" disabled="">Select Medium</option>
          <option value="english">English</option>
          <option value="gujarati">Gujarati</option>
        </select>
      </div>
      <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-id-badge"></i></span>
        </div>
          <input type="text" class="form-control" name="rollno" placeholder="Enter Roll No." required="">
      </div>
      <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-user-circle"></i></span>
        </div>
          <input type="text" class="form-control" name="fname" placeholder="First Name" required="">
      </div>
      <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-user-circle-o"></i></span>
        </div>
          <input type="text" class="form-control" name="mname" placeholder="Middle Name" required="">
        </div>
      <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-user-o"></i></span>
        </div>
          <input type="text" class="form-control" name="lname" placeholder="Last Name" required="">
        </div>
      <div class="input-group form-group">
          <div class="input-group-prepend">
            <span class="input-group-text"><i class="fa fa-envelope"></i></span>
          </div>
          <input type="email" class="form-control" name="email" placeholder="Email Address" required="">
        </div>
        <div class="input-group form-group">
          <div class="input-group-prepend">
            <span class="input-group-text"><i class="fa fa-phone"></i></span>
          </div>
            <input type="text"class="form-control" name="contactno" placeholder="Contact Number" required="">
        </div>
        <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-users"></i></span>
        </div>
        <select name="gender">
          <option selected="" disabled="">Select Gender</option>
          <option value="m">Male</option>
          <option value="f">Female</option>
        </select>
        </div>
        <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-calendar"></i></span>
        </div>
            <input type="Date" class="form-control" name="dob" placeholder="Birth Date" required="">
        </div>
        <div class="custom-file mb-3">
          <input type="file" class="custom-file-input" accept=".jpg,.jpeg,.png" id="customFile" name="filename">
          <label class="custom-file-label" for="customFile">Choose Photo</label>
        </div>
        <div class="input-group form-group">
          <div class="input-group-prepend">
            <span class="input-group-text"><i class="fa fa-user"></i></span>
          </div>
            <input type="text" class="form-control" name="username" placeholder="Enter Username" required="">
        </div>
        <div class="input-group form-group">
          <div class="input-group-prepend">
            <span class="input-group-text"><i class="fa fa-key"></i></span>
          </div>
            <input type="password" class="form-control" name="password" placeholder="Enter Password" required="">
        </div>
        <div class="form-group">
          <input type="submit" value="Save" class="btn login_btn">
        </div>  
      </form>
    </div>
  </div>
</section>

<%@ include file="school_footer.jsp" %>

