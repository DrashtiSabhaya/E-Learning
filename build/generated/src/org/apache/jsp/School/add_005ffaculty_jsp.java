package org.apache.jsp.School;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005ffaculty_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/School/school_header.jsp");
    _jspx_dependants.add("/School/school_footer.jsp");
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
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("        <title>Learn</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, intial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\">   \n");
      out.write("        <script src=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("        <script src=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready( function () {\n");
      out.write("                $('#myTable').DataTable();\n");
      out.write("            } );\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            ");
      out.write("  \n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      out.write("  \n");
      out.write("            <div class=\"\">\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <img src=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <nav class=\"navbar navbar-expand-md font justify-content-center\">\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"\" id=\"collapsibleNavbar\">\n");
      out.write("                        <ul class=\"navbar-nav ml-auto justify-content-center\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"school_home\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">Standards</a>\n");
      out.write("                                <div class=\"dropdown-menu\">\n");
      out.write("                                    <a class=\"dropdown-item font\" href=\"add_standard\">Add Standard</a>\n");
      out.write("                                    <a class=\"dropdown-item font\" href=\"view_standard\">View Standards</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">Subjects</a>\n");
      out.write("                                <div class=\"dropdown-menu\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"add_subject\">Add Subjects</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"view_subjects\">View Subjects</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">Faculty</a>\n");
      out.write("                                <div class=\"dropdown-menu\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"add_faculty\">Add Faculty</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"view_faculty\">View Faculty</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"assign_faculty\">Assign Faculty</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"view_assign_faculty\">View Assigned Faculty</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">Students</a>\n");
      out.write("                                <div class=\"dropdown-menu\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"add_student\">Add Students</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"view_students\">View Students</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"logout\"><button type=\"button\" class=\"btn btn-danger\">LOG OUT</button></a>\n");
      out.write("                            </li> \n");
      out.write("                        </ul>\n");
      out.write("                    </div>  \n");
      out.write("                </nav>\n");
      out.write("            </div>\t\n");
      out.write("        </header>\n");
      out.write("        ");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"signin\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"heading\">\n");
      out.write("            <h1><span>ADD</span> Faculty</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"page-card\">\n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <form action=\"savefaculty\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                <input type=\"hidden\" name=\"school_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">       \n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-user-circle\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"fname\" placeholder=\"First Name\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-user-circle-o\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"mname\" placeholder=\"Middle Name\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-user-o\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"lname\" placeholder=\"Last Name\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-envelope\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email Address\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-phone\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"tel\" class=\"form-control\" name=\"contactno\" pattern=\"[0-9]{10}\" placeholder=\"Contact Number\" title=\"Contact No must be of 10 digits\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-users\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    <select name=\"gender\" required=\"\">\n");
      out.write("                        <option selected=\"\" disabled=\"\">Select Gender</option>\n");
      out.write("                        <option value=\"Male\">Male</option>\n");
      out.write("                        <option value=\"Female\">Female</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-id-badge\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"experience\" placeholder=\"Experience\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-star\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"subject\" placeholder=\"Enter Subjects\" required=\"\">\n");
      out.write("                </div>      \n");
      out.write("                <div class=\"custom-file mb-3\">\n");
      out.write("                    <input type=\"file\" class=\"custom-file-input\" id=\"customFile\" size=\"50\" accept=\".jpg,.jpeg,.png\" name=\"file\" required=\"\">\n");
      out.write("                    <label class=\"custom-file-label\" for=\"customFile\">Choose Photo</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-user\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Enter Username\" pattern=\"(?=.*\\d)(?=.*[a-z]).{4,}\" title=\"Username must contain atleast 4 Alpha numeric Characters\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-key\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Enter Password\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}\" title=\"Password Must Contain atleast 6 Alpha numeric Characters\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"submit\" value=\"Save\" class=\"btn login_btn\">\n");
      out.write("                </div>  \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(\".custom-file-input\").on(\"change\", function() {\n");
      out.write("        var fileName = $(this).val().split(\"\\\\\").pop();\n");
      out.write("        $(this).siblings(\".custom-file-label\").addClass(\"selected\").html(fileName);\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("<footer>\n");
      out.write("    <img src=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("         <div class=\"footer-icons\">\n");
      out.write("        <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("        <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("        <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("        <a href=\"#\"><i class=\"fa fa-google\"></i></a>\n");
      out.write("    </div>      \n");
      out.write("    <p>Learn &copy; 2020 - All rights reserved.</p>\n");
      out.write("</footer>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
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
        out.write("\n");
        out.write("                <script type=\"text/javascript\">\n");
        out.write("                    alert(\"Please Login first!\");\n");
        out.write("                    window.location.href='../login';\n");
        out.write("                </script> \n");
        out.write("            ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty message}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div class=\"alert alert-success\">\n");
        out.write("                    <strong>Success !</strong> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                </div>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div class=\"alert alert-danger\">\n");
        out.write("                    <strong>Failed !</strong> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                </div>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
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
