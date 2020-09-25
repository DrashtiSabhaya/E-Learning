<%@include file="student_header.jsp" %>

<section class="login">
  <div class="container-fluid">
    <div class="heading">
    <h1><span>Upload </span>Assignment</h1>
    </div>
    <div class="page-card">
    <form>
      <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-tasks"></i></span>
        </div>
        <select>
        <option selected="" disabled="">Choose Subject</option>
        <option>1</option>
        <option>2</option>
        </select>
      </div>
      <div class="input-group form-group">
        <div class="input-group-prepend">
          <span class="input-group-text"><i class="fa fa-file"></i></span>
        </div>
        <select>
          <option selected="" disabled="">Choose Assignment</option>
          <option>English</option>
          <option>Gujarati</option>
        </select>
      </div>
        <div class="custom-file mb-3">
          <input type="file" class="custom-file-input" id="customFile" name="filename">
          <label class="custom-file-label" for="customFile">Choose Assignment file</label>
        </div>
        <div class="form-group">
        <input type="submit" value="Upload" class="btn login_btn"> 
        </div> 
      </form>
    </div>
  </div>
</section>

<%@ include file="student_footer.jsp" %>
