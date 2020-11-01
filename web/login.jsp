<%--================ Header ===================--%>
<%@ include file="header.jsp" %>
    
<%--============== Log in Form ================--%>
<section class="login">
    <div class="container-fluid">
        <div class="heading">
            <h1><span>Log</span> in</h1>
        </div>
        <div class="page-card">
            <c:if test="${not empty error}">
                <div class="alert alert-danger">
                    <strong>Denied !</strong> ${error}
                </div>
            </c:if>
            <form action="loginCheck" method="POST">
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-users"></i></span>
                    </div>
                    <select required="" class="" name="loginas" required="">
                        <option selected="" disabled="">Login As</option>
                        <option value="student">Student</option>
                        <option value="teacher">Teacher</option>
                        <option value="school">School</option>
                    </select>
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-user"></i></span>
                    </div>
                    <input type="text" class="form-control" name="username" placeholder="Enter Username" required="" pattern="(?=.*\d)(?=.*[a-z]).{4,}" title="Username must contain atleast 4 Alpha numeric Characters">
                </div>
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-key"></i></span>
                    </div>
                    <input type="password" class="form-control" name="password" placeholder="Enter Password" required=""
                           pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Password Must Contain atleast 6 Alpha numeric Characters" required="">
                </div>
                <div class="form-group">
                    <input type="submit" value="Login" class="btn login_btn">
                </div>
                <div class="form-group">
                    <h6><a href="forgot">Forgot Password?</a></h6>
                </div>
            </form>
        </div>
    </div>
</section>
    
<%--=============== Footer ==================--%>
<%@ include file="footer.jsp" %>