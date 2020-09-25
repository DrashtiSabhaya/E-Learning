<%@include file="faculty_header.jsp" %>
<section class="login">
    <div class="container-fluid">
        <div class="heading">
        <h1><span>Add </span>Video</h1>
        </div>
        <div class="page-card">
            <form action="addvideo" method="POST">
            <div class="input-group form-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"><i class="fa fa-users"></i></span>
                    </div>
                <select name="standard" required="">
                    <option disabled="" selected="">Standard</option>
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
                    <select name="subject" required="">
                        <option disabled="" selected="">Subject</option>
                    <option value="maths">Maths</option>
                    <option value="science">Science</option>
                    <option value="History">History</option>
                    <option value="English">English</option>
                </select>
            </div>
             <div class="input-group form-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><i class="fa fa-asterisk"></i></span>
            </div>
                 <input type="text" class="form-control" name="topic" placeholder="Enter Topic" required="">
            </div>
            <div class="input-group form-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><i class="fa fa-link"></i></span>
            </div>
                <input type="text" class="form-control" name="link" placeholder="Enter Link" required="">
            </div>

             <div class="form-group">
                    <input type="submit" value="Save" class="btn login_btn"> 
             </div>	
        </form>
      </div>
    </div>
</section>

<%@include file="footer.jsp" %>