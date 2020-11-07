<%-- 
    Document   : forgot
    Created on : 22 Sep, 2020, 10:04:55 AM
    Author     : Drashti
--%>
    
<%--================ Header ===================--%>
<%@ include file="header.jsp" %>
    
<%--============== Log in Form ================--%>
<section class="login">
    <div class="container-fluid">
        <div class="heading">
            <h1>Forgot Password</h1>
        </div>
        <div class="page-card">
            <c:if test="${not empty error}">
                <div class="alert alert-danger">
                    <strong>Denied !</strong> ${error}
                </div>
            </c:if>
            <c:if test="${not empty message}">
                <div class="alert alert-success">
                    <strong>Done !</strong> ${message}
                </div>
            </c:if>
            <form action="sendPassword" method="POST">
                <div class="input-group form-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-users"></i></span>
                    </div>
                    <select required="" name="loginas">
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
                        <span class="input-group-text"><i class="fa fa-envelope"></i></span>
                    </div>
                    <input type="email" class="form-control" name="email" placeholder="Enter Email" required="">
                </div>
                <div class="form-group">
                    <input type="submit" value="Submit" class="btn login_btn">
                </div>
            </form>
        </div>
    </div>
</section>
    
<%--=============== Footer ==================--%>
<%@ include file="footer.jsp" %>