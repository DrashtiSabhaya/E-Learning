<%@ include file="Student/student_header.jsp" %>
<br>
<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="shortcut icon" href="Image/logo-2.png">
        <title>Learn</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/dt.css">
        <link rel="stylesheet" href="style.css">
        <script src="js/jquery.js"></script>
        <script src="js/dt.js"></script>
        <link rel="stylesheet" href="font/css/fontawesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        
        <script src="js/popper.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script type="text/javascript">
            $(document).ready( function () {
                $('#myTable').DataTable();
            } );
        </script>
    </head>
    <body>
        
        
        <div class="col-lg-12">
            
            <table id="myTable" class="display">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Subject</th>
                        <th>Chapter</th>            
                        <th>Download</th>            
                    </tr>
                </thead>
                <tbody>
                    
                </tbody>
            </table>
        </div>
        
    </div>
    
</body>
</html>

