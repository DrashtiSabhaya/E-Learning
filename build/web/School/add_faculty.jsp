<%-- 
    Document   : add_faculty
    Created on : 13 Aug, 2020, 4:13:36 PM
    Author     : Drashti
--%>

<%@ include file="school_header.jsp" %>

<section class="signin">
    <div class="container-fluid">
        <div class="heading">
            <h1><span>ADD</span> Faculty</h1>
        </div>
        <div class="page-card">
            <c:if test="${not empty message}">
                <div class="alert alert-success">
                    <strong>Success !</strong> ${message}
                </div>
            </c:if> 
            <form action="savefaculty" method="POST" enctype="multipart/form-data">
                <input type="hidden" name="school_id" value="${sessionScope.id}">       
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
                    <input type="tel" class="form-control" name="contactno" pattern="[0-9]{10}" placeholder="Contact Number" title="Contact No must be of 10 digits" required="">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-users"></i></span>
                    </div>
                    <select name="gender" required="">
                        <option selected="" disabled="">Select Gender</option>
                        <option value="Male">Male</option>
                        <option value="Female">Female</option>
                    </select>
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-id-badge"></i></span>
                    </div>
                    <input type="text" class="form-control" name="experience" placeholder="Experience" required="">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-star"></i></span>
                    </div>
                    <input type="text" class="form-control" name="subject" placeholder="Enter Subjects" required="">
                </div>      
                <div class="custom-file mb-3">
                    <input type="file" class="custom-file-input" id="customFile" size="50" accept=".jpg,.jpeg,.png" name="file" required="">
                    <label class="custom-file-label" for="customFile">Choose Photo</label>
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-user"></i></span>
                    </div>
                    <input type="text" class="form-control" name="username" placeholder="Enter Username" pattern="(?=.*\d)(?=.*[a-z]).{4,}" title="Username must contain atleast 4 Alpha numeric Characters" required="">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-key"></i></span>
                    </div>
                    <input type="password" class="form-control" name="password" placeholder="Enter Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Password Must Contain atleast 6 Alpha numeric Characters" required="">
                </div>
                <div class="form-group">
                    <input type="submit" value="Save" class="btn login_btn">
                </div>  
            </form>
        </div>
    </div>
</section>

<%@ include file="school_footer.jsp" %>
