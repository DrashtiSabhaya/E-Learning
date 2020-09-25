<%@include  file="faculty_header.jsp" %>

<section class="login">
<div class="container-fluid">
    <div class="heading">
        <h1><span>Add </span>Material</h1>
    </div>
    <div class="page-card">
        <form action="addcontent" method="POST">
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
            <option value="5">5</option>
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
            <option value="3">Hindi</option>
            <option value="4">History</option>
        </select>
    </div>
     <div class="input-group form-group">
    <div class="input-group-prepend">
        <span class="input-group-text"><i class="fa fa-asterisk"></i></span>
    </div>
     <input type="text" class="form-control" name="topic" placeholder="Enter Topic">
    </div>
     <div class="custom-file mb-3">
         <input type="file" class="custom-file-input" accept=".pdf, .doc" id="customFile" name="filename">
     <label class="custom-file-label" for="customFile">Choose file</label>
    </div>
     <div class="form-group">
        <input type="submit" value="Save" class="btn login_btn"> 
     </div>		
   </form>
  </div>
</div>
</section>

<%@include file="footer.jsp" %>