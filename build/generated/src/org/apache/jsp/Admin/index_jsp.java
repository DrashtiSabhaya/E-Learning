package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Admin/header.jsp");
    _jspx_dependants.add("/Admin/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_url_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("    <title>Learn</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, intial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\">   \r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready( function () {\r\n");
      out.write("        $('#myTable').DataTable();\r\n");
      out.write("        } );\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("  \r\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write("  \r\n");
      out.write("<div>\r\n");
      out.write("    <div id=\"logo\">\r\n");
      out.write("    <img src=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("    </div>\r\n");
      out.write("<nav class=\"navbar navbar-expand-md\">\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\r\n");
      out.write("    <ul class=\"navbar-nav\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link active\" href=\"index\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">School Request</a>\r\n");
      out.write("        <div class=\"dropdown-menu\">\r\n");
      out.write("          <a class=\"dropdown-item font\" href=\"view_request\">New Request</a>\r\n");
      out.write("          <a class=\"dropdown-item font\" href=\"view_rejected_request\">Rejected Request</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"list_school\">List School</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"mailinfo\">Sent Mails</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"feedback\">Feedback</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("        <a href=\"logout\"><button type=\"button\" class=\"btn btn-danger\">LOG OUT</button></a>\r\n");
      out.write("        </li> \r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>  \r\n");
      out.write("</nav>\r\n");
      out.write("</div>\t\r\n");
      out.write("</header>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<section>\n");
      out.write("<div class=\"container-fluid row\">\n");
      out.write("    <div class=\"card col-6 ml-5 m-3\">\n");
      out.write("        <div class=\"card-container\">\n");
      out.write("          <h4><center><b>School Requests</b></center></h4> \n");
      out.write("            <div id=\"piechart1\"></div> \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card col-5 m-3\">\n");
      out.write("        <div class=\"card-container\">\n");
      out.write("          <h4><center><b>School Requests</b></center></h4>  \n");
      out.write("            <div class=\"container mt-5\">\n");
      out.write("            <table class=\"table table-dark table-hover\">\n");
      out.write("            <thead>\n");
      out.write("              <tr>\n");
      out.write("                <th>Total School Requests</th>\n");
      out.write("                <th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accepted +rejected+pending}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("              </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("              <tr>\n");
      out.write("                <td>Accepted Requests</td>\n");
      out.write("                <td id=\"accepted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${accepted}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Rejected Requests</td>\n");
      out.write("                <td id=\"rejected\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rejected}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Pending Requests</td>\n");
      out.write("                <td id=\"pending\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pending}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("            </tbody>\n");
      out.write("          </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    <div class=\"container-fluid row\">\n");
      out.write("        <div class=\"card col-6 ml-5 m-3\">\n");
      out.write("          <div class=\"card-container\">\n");
      out.write("              <h4><center><b>Number of Schools</b></center></h4> \n");
      out.write("            <div id=\"piechart\"></div> \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    <div class=\"card col-5 m-3\">\n");
      out.write("      <div class=\"card-container\">\n");
      out.write("        <h4><center><b>Number of School</b></center></h4> \n");
      out.write("        <div class=\"container mt-3\">\n");
      out.write("        <table class=\"table table-dark table-hover\">\n");
      out.write("        <thead>\n");
      out.write("          <tr>\n");
      out.write("            <th>Joining Year</th>\n");
      out.write("            <th>No of Schools</th>\n");
      out.write("          </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("          <tr>\n");
      out.write("            <td>2018</td>\n");
      out.write("            <td>7</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>2019</td>\n");
      out.write("            <td>1</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>2020</td>\n");
      out.write("            <td>2</td>\n");
      out.write("          </tr>\n");
      out.write("         </tbody>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("     </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("google.charts.load('current', {'packages':['corechart']});\n");
      out.write("google.charts.setOnLoadCallback(drawPieChart);\n");
      out.write("google.charts.setOnLoadCallback(drawBarChart);\n");
      out.write("\n");
      out.write("function drawPieChart() {\n");
      out.write("    var accepted = document.getElementById(\"accepted\");\n");
      out.write("    var rejected = document.getElementById(\"rejected\");\n");
      out.write("    var pending = document.getElementById(\"pending\");\n");
      out.write("    var data = google.visualization.arrayToDataTable([\n");
      out.write("    ['Requests', 'No. of Requests'],\n");
      out.write("    ['Accepted', accepted],\n");
      out.write("    ['Rejected', rejected],\n");
      out.write("    ['Pending', pending]    \n");
      out.write("]);\n");
      out.write("\n");
      out.write("  var options = {'title':'Schools Request', 'width':550, 'height':450};\n");
      out.write("\n");
      out.write("  var chart = new google.visualization.PieChart(document.getElementById('piechart1'));\n");
      out.write("  chart.draw(data, options);\n");
      out.write("}\n");
      out.write("function drawBarChart() {\n");
      out.write("  var data = google.visualization.arrayToDataTable([\n");
      out.write("  ['Months', 'No. of Schools'],\n");
      out.write("  ['January', 8],\n");
      out.write("  ['February', 2],\n");
      out.write("  ['March', 4],\n");
      out.write("  ['April', 3],\n");
      out.write("  ['May', 9],\n");
      out.write("  ['June',2],\n");
      out.write("  ['July',1],\n");
      out.write("  ['August',10],\n");
      out.write("  ['September',12],\n");
      out.write("  ['October',23],\n");
      out.write("  ['November',5],\n");
      out.write("  ['December',3]\n");
      out.write("]);\n");
      out.write("\n");
      out.write("    var options = {'title':'Year : 2020', 'width':600, 'height':400};\n");
      out.write("    var chart = new google.visualization.ColumnChart(document.getElementById('piechart'));\n");
      out.write("    chart.draw(data, options);\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write('\n');
      out.write("<script>\r\n");
      out.write("$(\".custom-file-input\").on(\"change\", function() {\r\n");
      out.write("  var fileName = $(this).val().split(\"\\\\\").pop();\r\n");
      out.write("  $(this).siblings(\".custom-file-label\").addClass(\"selected\").html(fileName);\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("  <img src=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("    <div class=\"footer-icons\">\r\n");
      out.write("      <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("      <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("      <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\r\n");
      out.write("      <a href=\"#\"><i class=\"fa fa-google\"></i></a>\r\n");
      out.write("    </div>      \r\n");
      out.write("  <p>Learn &copy; 2020 - All rights reserved.</p>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write(' ');
      out.write(' ');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("../resources/images/logo-2.png");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("../resources/css/style.css");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("../resources/css/dt.css");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("../resources/js/dt.js");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("../resources/js/popper.js");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope.username}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<script type=\"text/javascript\">\r\n");
        out.write("alert(\"Please Login first!\");\r\n");
        out.write("window.location.href='./login';\r\n");
        out.write("</script> \r\n");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("../resources/images/logo.png");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("../resources/images/logo_footer.png");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }
}
