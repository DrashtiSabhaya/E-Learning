<%--============= Header =================--%>
<%@ include file="header.jsp" %>

<%--============= Contact =================--%>
<section id="main">
    <div class="container">
        <c:if test="${not empty sessionScope.message}">
        <div class="alert alert-success">
          <strong>FeedBack Saved!</strong> ${sessionScope.message}
            <%session.removeAttribute("message"); %>
        </div>
        </c:if>
	<article id="main-col">
	<h1 class="page-title">Learn</h1>
        <ul id="services">
            <li><h3>Get In Touch</h3>
                <h6><i class="fa fa-envelope"></i>  drashti@gmail.com</h6>
                <h6><i class='fa fa-phone'></i>  +91 7123456789</h6>
            </li>
            <li><h3>Find Us</h3>
                <h6><i class="fa fa-map-marker"></i>  Metoda, Nr. Govt School</h6>
                <h6><i class="fa fa-address-card"></i>  Rajkot, Gujarat</h6>
                <h6><i class="fa fa-map"></i>  India - 360021</h6>
            </li>			
        </ul>
	</article>
            <aside id="sidebar">
                <div class="dark mt-4">
                    <h3>Feed Back</h3>
                    <form action="savefeedback" method="POST" class="quote">
                        <div>
                            <label>Name</label>
                            <input type="text" name="name" placeholder="Name">
                        </div>
                        <div>
                            <label>Email</label>
                            <input type="email" name="email" placeholder="Email">
                        </div>
                        <div>
                            <label>Message</label>
                            <textarea placeholder="Message.." name="message"></textarea> 
                        </div>
                        <input class="button1" type="submit" value="Save">
                    </form>
                </div>
            </aside>	
	</div>
</section>

<%--============= Footer =================--%>
<%@ include file="footer.jsp" %>