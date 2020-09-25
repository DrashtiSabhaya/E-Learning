<%@include file="faculty_header.jsp" %>

<section class="signin">
    <div class="container-fluid">
      <div class="heading">
        <h1><span>Create </span>Class</h1>
      </div>
   <div class="page-card">
   <form action="createclass" method="POST">
    <div class="input-group form-group">
        <div class="input-group-prepend">
            <span class="input-group-text"><i class="fa fa-users"></i></span>
        </div>
        <select name="standard">
            <option selected="" disabled="">Standard</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
        </select>
    </div>
        <div class="input-group form-group">
        <div class="input-group-prepend">
            <span class="input-group-text"><i class="fa fa-tasks"></i></span>
            </div>
        <select name="subject">
            <option selected="" disabled="">Subject</option>
            <option value="1">Maths</option>
            <option value="2">Science</option>
            <option value="3">History</option>
        </select>
    </div>
     <div class="input-group form-group">
    <div class="input-group-prepend">
        <span class="input-group-text"><i class="fa fa-asterisk"></i></span>
    </div>
         <input type="text" class="form-control" name="classname" placeholder="Enter Class Name">
     </div>
     <div class="custom-file mb-3 form-group">
         <input type="file" class="custom-file-input" id="customFile" name="coverphoto">
         <label class="custom-file-label" for="customFile">Choose Cover photo</label>
    </div>
     <div class="form-group">
        <input type="submit" value="Save" class="btn login_btn"> 
     </div>	
   </form>
  </div>
  </div>
</section>

<%@include file="footer.jsp" %>