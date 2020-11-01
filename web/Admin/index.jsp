<%--================ Header ===================--%>
<%@ include file="header.jsp" %>
    
<%--============== Schools Summary/Reports ===============--%>
<div class="label pt-3 text-center ">
    <a href="downloadPdf" class="btn btn-danger"><i class="fa fa-file-pdf-o"></i> Download PDF</a>
    <a href="downloadXLS" class="btn btn-success"><i class="fa fa-file-excel-o"></i> Download Excel</a>
</div>
<section>
    <div class="container-fluid row">
        <div class="chart-card col-6 ml-5 m-3">
            <div class="card p-3">
                <h4><center><b>School Requests</b></center></h4> 
                <div id="piechart"></div> 
            </div>
        </div>
        <div class="chart-card col-5 m-3">
            <div class="card p-3">
                <h4><center><b>School Requests</b></center></h4>
                <div class="container mt-5">
                    <table class="table table-dark table-hover">
                        <thead>
                            <tr>
                                <th>Total School Requests</th>
                                <th>${accepted +rejected +pending}</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Accepted Requests</td>
                                <td id="accepted">${accepted}</td>
                            </tr>
                            <tr>
                                <td>Rejected Requests</td>
                                <td id="rejected">${rejected}</td>
                            </tr>
                            <tr>
                                <td>Pending Requests</td>
                                <td id="pending">${pending}</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class="container-fluid row">
        <div class="chart-card col-6 ml-5 m-3">
            <div class="card p-3">
                <h4><center><b>Number of Schools</b></center></h4> 
                <div id="barchart"></div> 
            </div>
        </div>
        <div class="chart-card col-5 m-3">
            <div class="card p-3">
                <h4><center><b>Number of School</b></center></h4> 
                <div class="container mt-3">
                    <table class="table table-dark table-hover">
                        <thead>
                            <tr>
                                <th>Joining Year</th>
                                <th>No of Schools</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="school" items="${ylist}">   
                                <tr>
                                    <td>${school.criteria}</td>
                                    <td>${school.count}</td>
                                </tr>
                            </c:forEach> 
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <c:forEach var="school" items="${mlist}">   
        <input type="hidden" id="${school.criteria}" value="${school.count}">
    </c:forEach>
</section>
    
<%--============== Create Schools Summary/Reports ===============--%>
<script type="text/javascript">
    var d = new Date();
    google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawPieChart);
    google.charts.setOnLoadCallback(drawBarChart);
    
    function drawPieChart() {
        var accepted = parseInt(document.getElementById("accepted").innerHTML);
        var rejected = parseInt(document.getElementById("rejected").innerHTML);
        var pending = parseInt(document.getElementById("pending").innerHTML);
        var data = google.visualization.arrayToDataTable([
            ['Requests', 'No. of Requests'],
            ['Accepted', accepted],
            ['Rejected', rejected],
            ['Pending', pending]    
        ]);
        
        var options = {'title':'Schools Request', 'width':550, 'height':450};
        
        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
        chart.draw(data, options);
    }
    function drawBarChart() {
        var jan = document.getElementById("1") ?parseInt(document.getElementById("1").value):0;
        var feb = document.getElementById("2") ?parseInt(document.getElementById("2").value):0;
        var mar = document.getElementById("3") ?parseInt(document.getElementById("3").value):0;
        var apr = document.getElementById("4") ?parseInt(document.getElementById("4").value):0;
        var may = document.getElementById("5") ?parseInt(document.getElementById("5").value):0;
        var jun = document.getElementById("6") ?parseInt(document.getElementById("6").value):0;
        var jul = document.getElementById("7") ?parseInt(document.getElementById("7").value):0;
        var aug = document.getElementById("8") ?parseInt(document.getElementById("8").value):0;
        var sep = document.getElementById("9") ?parseInt(document.getElementById("9").value):0;
        var oct = document.getElementById("10") ?parseInt(document.getElementById("10").value):0;
        var nov = document.getElementById("11") ?parseInt(document.getElementById("11").value):0;
        var dec = document.getElementById("12") ?parseInt(document.getElementById("12").value):0;
        
        var data = google.visualization.arrayToDataTable([
            ['Months', 'No. of Schools'],
            ['January', jan],
            ['February', feb],
            ['March', mar],
            ['April', apr],
            ['May', may],
            ['June', jun],
            ['July', jul],
            ['August', aug],
            ['September', sep],
            ['October', oct],
            ['November', nov],
            ['December', dec]
        ]);
        
        var options = {'title':'Year : '+d.getFullYear(), 'width':600, 'height':400};
        var chart = new google.visualization.ColumnChart(document.getElementById('barchart'));
        chart.draw(data, options);
    }
</script>
    
<%--================ Footer ===================--%>
<%@ include file="footer.jsp" %>  