<%--============= Header =================--%>
<%@ include file="header.jsp" %>
<%--============= Sign Up =================--%>
<section class="signin"> 
    <div class="container-fluid">
        <div class="heading">
            <h1><span>Sign</span> Up</h1>
        </div>
        <div class="page-card">
            <c:if test="${not empty message}">
                <div class="alert alert-success container">
                    <strong>Registration Success!</strong> ${message}
                </div><br>
            </c:if> 
            <form action="register" method="POST">
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-university"></i></span>
                    </div>
                    <input type="text" class="form-control" name="name" placeholder="School Name" required="">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-user-o"></i></span>
                    </div>
                    <input type="text" class="form-control" name="registerno" placeholder="School Registration ID" required="">
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
                        <span class="input-group-text"><i class="fa fa-user"></i></span>
                    </div>
                    <input type="text" class="form-control" name="ownername" placeholder="School Owner Name" required="">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-address-card"></i></span>
                    </div>
                    <input type="text" class="form-control" placeholder="Address" name="address" required="">
                </div>
                Enter range i.e. 1-7 or 1-10
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-star"></i></span>
                    </div>
                    <input type="text" class="form-control" placeholder="Enter Standards" name="standard" required="">
                </div>
                Enter Comma Separated Values
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-check-square-o"></i></span>
                    </div>
                    <input type="text" class="form-control" placeholder="School Medium" name="medium" required="">
                </div>          
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-user"></i></span>
                    </div>
                    <input type="text" class="form-control" placeholder="Enter Username" name="username" pattern="(?=.*\d)(?=.*[a-z]).{4,}" title="Username must contain atleast 4 Alpha numeric Characters" required="">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-key"></i></span>
                    </div>
                    <input type="password" name="password" placeholder="Enter Password" class="form-control" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Password Must Contain atleast 6 Alpha numeric Characters" required="">
                </div>
                <div class="form-group">
                    <input type="submit" name="signup" value="Sign Up" class="btn login_btn">
                </div>  
            </form>
        </div>
    </div>
</section>
    
<%--============= Footer =================--%>
<%@ include file="footer.jsp" %>