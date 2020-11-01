<%@ include file="student_header.jsp" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<section id="boxes">
    <div class="container">
        <c:forEach var="subject" items="${list}">   
            <div class="box">
                <div class="card">
                    <img class="card-img-top p-md-5" src="<c:url value="../resources/images/${fn:toLowerCase(subject.name)}.png"/>" alt="Card image" style="width:100%">
                    <div class="card-body">
                        <h4 class="card-title">${subject.name}</h4>
                        <p class="card-text">
                            Medium : ${subject.medium}<br>
                            Standard : ${subject.standard}<br>
                            Faculty : ${subject.name}</p>
                        <a href="view_subject_content?id=${subject.id}&name=${subject.name}" class="btn btn-primary">View</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>

<%@ include file="student_footer.jsp" %>
