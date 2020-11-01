<%--============= Header =================--%>
<%@ include file="header.jsp" %>

<%--============= Carousel =================--%>
<div id="demo" class="carousel slide" data-ride="carousel">
    <ul class="carousel-indicators">
        <li data-target="#demo" data-slide-to="0" class="active"></li>
        <li data-target="#demo" data-slide-to="1"></li>
        <li data-target="#demo" data-slide-to="2"></li>
    </ul>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="<c:url value="resources/images/4.jpg"/>" alt="Slide1" width="1100" height="500">
            <div class="carousel-caption">
                
            </div>   
        </div>
        <div class="carousel-item">
            <img src="<c:url value="resources/images/Second.jpg"/>" alt="Slide2" width="1100" height="500">
            <div class="carousel-caption">
                
            </div>   
        </div>
        <div class="carousel-item">
            <img src="<c:url value="resources/images/First.jpg"/>" alt="Slide3" width="1100" height="500">
            <div class="carousel-caption">
            </div>   
        </div>
    </div>
    <a class="carousel-control-prev" href="#demo" data-slide="prev">
        <span class="carousel-control-prev-icon"></span>
    </a>
    <a class="carousel-control-next" href="#demo" data-slide="next">
        <span class="carousel-control-next-icon"></span>
    </a>
</div>

<%--============= Newsletter =================--%>
<section id="newsletter">
    <div class="container">
        <h3>Subscribe to our Newsletter</h3>
        <form>
            <input type="email" name="news" placeholder="Enter Email..">
            <button type="submit" class="btn btn-danger">Subscribe</button>
        </form>
    </div>
</section>

<%--============= About Us =================--%>
<section>
    <div class="jumbotron jumbotron-fluid">
        <div class="container">
            <h1>Learn With Us</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut eget metus a urna pulvinar feugiat. Ut in ligula at justo scelerisque laoreet placerat eu urna. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas in augue eu lacus dapibus molestie. Suspendisse sagittis iaculis odio nec fringilla. Quisque pellentesque purus sit amet dapibus eleifend. Ut sit amet eleifend leo. Nullam sed ultrices lorem. Morbi posuere ac mauris non eleifend.</p>
            <p>
                Nullam et eros sit amet magna dictum pulvinar. Sed ultricies, nisi sit amet ullamcorper facilisis, velit nisi commodo arcu, vitae aliquam urna lacus ut mauris. Proin mollis sem eget malesuada dapibus. Vestibulum eu efficitur eros. Quisque accumsan tortor arcu, ut aliquam nulla posuere eu. Donec neque sem, volutpat sed vestibulum at, sollicitudin sed est. Suspendisse condimentum dui placerat nibh hendrerit, sed hendrerit augue consectetur. Vivamus pulvinar vestibulum metus sit amet mattis. Donec sodales commodo mi, id maximus dolor venenatis eget.</p>
        </div>
    </div>
</section>

<%--============= Service =================--%>
<section id="boxes">
    <div class="container">
        <div class="box">
            <div class="card">
                <img class="card-img-top" src="<c:url value="resources/images/slide1.jpg"/>" alt="Card image" style="width:100%">
                <div class="card-body">
                    <h4 class="card-title">Education</h4>
                    <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
                    <a href="#" class="btn btn-primary">Read More</a>
                </div>
            </div>
        </div>
        <div class="box">
            <div class="card">
                <img class="card-img-top" src="<c:url value="resources/images/slide1.jpg"/>" alt="Card image" style="width:100%">
                <div class="card-body">
                    <h4 class="card-title">Learning</h4>
                    <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
                    <a href="#" class="btn btn-primary">Read More</a>
                </div>
            </div>
        </div>
        <div class="box">
            <div class="card">
                <img class="card-img-top" src="<c:url value="resources/images/slide1.jpg"/>" alt="Card image" style="width:100%">
                <div class="card-body">
                    <h4 class="card-title">Innovation</h4>
                    <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
                    <a href="#" class="btn btn-primary">Read More</a>
                </div>
            </div>
        </div>
        <div class="box">
            <div class="card">
                <img class="card-img-top" src="<c:url value="resources/images/slide1.jpg"/>" alt="Card image" style="width:100%">
                <div class="card-body">
                    <h4 class="card-title">Grow</h4>
                    <p class="card-text">Some example text some example text. John Doe is an architect and engineer</p>
                    <a href="#" class="btn btn-primary">Read More</a>
                </div>
            </div>
        </div>    
    </div>
</section>
<div class="container-fluid p-3 bg-dark text-white">
    <div class="container">
        <h1>Online Education</h1>
        <p>This container has a dark background color and a white text, and some extra padding and margins.</p>
    </div>
</div>

<%--============= Footer =================--%>
<%@ include file="footer.jsp" %>
