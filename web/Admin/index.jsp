<%--================ Header ===================--%>
<%@ include file="header.jsp" %>

<%--============== Home Carousel ===============--%>
<div id="demo" class="carousel slide" data-ride="carousel">
    <ul class="carousel-indicators">
        <li data-target="#demo" data-slide-to="0" class="active"></li>
        <li data-target="#demo" data-slide-to="1"></li>
        <li data-target="#demo" data-slide-to="2"></li>
  </ul>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="<c:url value="../resources/images/4.jpg"/>" alt="Slide1" width="1100" height="500">   
    </div>
    <div class="carousel-item">
      <img src="<c:url value="../resources/images/Second.jpg"/>" alt="Slide2" width="1100" height="500">
    </div>
    <div class="carousel-item">
      <img src="<c:url value="../resources/images/First.jpg"/>" alt="Slide3" width="1100" height="500">
    </div>
  </div>
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>
<%--================ Footer ===================--%>
<%@ include file="footer.jsp" %>  