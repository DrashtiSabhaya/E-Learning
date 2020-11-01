<script>
    $(".custom-file-input").on("change", function() {
        var fileName = $(this).val().split("\\").pop();
        $(this).siblings(".custom-file-label").addClass("selected").html(fileName);
    });
</script>
<%--================ Footer ===================--%>
<footer>
    <img src="<c:url value="../resources/images/logo_footer.png" />">
         <div class="footer-icons">
        <a href="#"><i class="fa fa-facebook"></i></a>
        <a href="#"><i class="fa fa-twitter"></i></a>
        <a href="#"><i class="fa fa-linkedin"></i></a>
        <a href="#"><i class="fa fa-google"></i></a>
    </div>      
    <p>Learn &copy; 2020 - All rights reserved.</p>
</footer>
</body>
</html>
