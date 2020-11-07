<%--============= Header =================--%>
<%@ include file="student_header.jsp" %>

<%--============= Carousel =================--%>
<div id="demo" class="carousel slide" data-ride="carousel">
    <ul class="carousel-indicators">
        <li data-target="#demo" data-slide-to="0" class="active"></li>
        <li data-target="#demo" data-slide-to="1"></li>
        <li data-target="#demo" data-slide-to="2"></li>
    </ul>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="<c:url value="../resources/images/4.jpg"/>" alt="Slide1" width="1100" height="500">
            <div class="carousel-caption">
                
            </div>   
        </div>
        <div class="carousel-item">
            <img src="<c:url value="../resources/images/Second.jpg"/>" alt="Slide2" width="1100" height="500">
            <div class="carousel-caption">
                
            </div>   
        </div>
        <div class="carousel-item">
            <img src="<c:url value="../resources/images/First.jpg"/>" alt="Slide3" width="1100" height="500">
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

<section id="newsletter">
    <div class="container">
        <h3>Submit your Query</h3>
        <form>
            <input type="email" name="news" placeholder="Enter Query..">
            <button type="submit" class="btn btn-danger">Submit</button>
        </form>
    </div>
</section>

<%--============= About Us =================--%>
<section>
    <div class="jumbotron jumbotron-fluid">
        <div class="container">
            <h1>Learn With Us</h1>
            <p>The main aim of Learn Portal is to provide digital space for
                School and Students. This web application will provide e-learning
                platform to Students and schools to continue their educational
                learning. This web application is supported to eliminate and reduce the hardships
                faced by schools and students and provide virtual interaction between students
                and teachers.</p>
            <p>
                Learn allows Schools and teacher to manage student's classes,
                assignment and quiz-test. It will allow remotely access to the students, students
                can access their digital class space anytime.  
            </p>
        </div>
    </div>
</section>

<%--============= Service =================--%>
<section id="boxes">
    <div class="container">
        <div class="box">
            <div class="card">
                <img class="card-img-top" src="<c:url value="../resources/images/slide1.jpg"/>" alt="Card image" style="width:100%">
                <div class="card-body">
                    <h4 class="card-title">Education</h4>
                    <p class="card-text">Learn Provide remote educational platform which make learning easy.</p>
                    <a href="#" class="btn btn-primary">Read More</a>
                </div>
            </div>
        </div>
        <div class="box">
            <div class="card">
                <img class="card-img-top" src="<c:url value="../resources/images/slide1.jpg"/>" alt="Card image" style="width:100%">
                <div class="card-body">
                    <h4 class="card-title">Learning</h4>
                    <p class="card-text">Learn Platform Share new Learning experience in Easy way with it's Users</p>
                    <a href="#" class="btn btn-primary">Read More</a>
                </div>
            </div>
        </div>
        <div class="box">
            <div class="card">
                <img class="card-img-top" src="<c:url value="../resources/images/slide1.jpg"/>" alt="Card image" style="width:100%">
                <div class="card-body">
                    <h4 class="card-title">Innovation</h4>
                    <p class="card-text">One of the Best Platform to bring out Student's Innovation in Unique</p>
                    <a href="#" class="btn btn-primary">Read More</a>
                </div>
            </div>
        </div>
        <div class="box">
            <div class="card">
                <img class="card-img-top" src="<c:url value="../resources/images/slide1.jpg"/>" alt="Card image" style="width:100%">
                <div class="card-body">
                    <h4 class="card-title">Grow</h4>
                    <p class="card-text">Learn provide Educational Knowledge and Growth of Children in Unique way</p>
                    <a href="#" class="btn btn-primary">Read More</a>
                </div>
            </div>
        </div>    
    </div>
</section>
<div class="container-fluid p-3 bg-dark text-white">
    <div class="container">
        <h1>Online Education</h1>
        <p>Connect and Learn with Us. Learn is one of the best platform for Online Eduction.</p>
    </div>
</div>

<%--============= Footer =================--%>
<%@ include file="student_footer.jsp" %>

