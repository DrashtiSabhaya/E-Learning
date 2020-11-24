package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write('\r');
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("        <script src=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("        <script src=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            ");
      out.write("  \n");
      out.write("            <div>\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <img src=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <nav class=\"navbar navbar-expand-md\">\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("                        <ul class=\"navbar-nav\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"index\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"about\">About Us</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"contact\">Contact</a>\n");
      out.write("                            </li> \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"login\"><button type=\"button\" class=\"btn btn-danger\">LOG IN</button></a>\n");
      out.write("                            </li> \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"signup\"><button type=\"button\" class=\"btn btn-light\">SIGN UP</button></a>\n");
      out.write("                            </li>  \n");
      out.write("                        </ul>\n");
      out.write("                    </div>  \n");
      out.write("                </nav>\n");
      out.write("            </div>\t\n");
      out.write("        </header>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("    <ul class=\"carousel-indicators\">\r\n");
      out.write("        <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("        <li data-target=\"#demo\" data-slide-to=\"1\"></li>\r\n");
      out.write("        <li data-target=\"#demo\" data-slide-to=\"2\"></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"carousel-inner\">\r\n");
      out.write("        <div class=\"carousel-item active\">\r\n");
      out.write("            <img src=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\" alt=\"Slide1\" width=\"1100\" height=\"500\">\r\n");
      out.write("            <div class=\"carousel-caption\">\r\n");
      out.write("                \r\n");
      out.write("            </div>   \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img src=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\" alt=\"Slide2\" width=\"1100\" height=\"500\">\r\n");
      out.write("            <div class=\"carousel-caption\">\r\n");
      out.write("                \r\n");
      out.write("            </div>   \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img src=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\" alt=\"Slide3\" width=\"1100\" height=\"500\">\r\n");
      out.write("            <div class=\"carousel-caption\">\r\n");
      out.write("            </div>   \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\r\n");
      out.write("        <span class=\"carousel-control-prev-icon\"></span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\r\n");
      out.write("        <span class=\"carousel-control-next-icon\"></span>\r\n");
      out.write("    </a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section id=\"newsletter\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h3>Subscribe to our Newsletter</h3>\r\n");
      out.write("        <form>\r\n");
      out.write("            <input type=\"email\" name=\"news\" placeholder=\"Enter Email..\">\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-danger\">Subscribe</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("    <div class=\"jumbotron jumbotron-fluid\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>Learn With Us</h1>\r\n");
      out.write("            <p>The main aim of Learn Portal is to provide digital space for\r\n");
      out.write("                School and Students. This web application will provide e-learning\r\n");
      out.write("                platform to Students and schools to continue their educational\r\n");
      out.write("                learning. This web application is supported to eliminate and reduce the hardships\r\n");
      out.write("                faced by schools and students and provide virtual interaction between students\r\n");
      out.write("                and teachers.</p>\r\n");
      out.write("            <p>\r\n");
      out.write("                Learn allows Schools and teacher to manage student's classes,\r\n");
      out.write("                assignment and quiz-test. It will allow remotely access to the students, students\r\n");
      out.write("                can access their digital class space anytime.  \r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section id=\"boxes\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img class=\"card-img-top\" src=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\" alt=\"Card image\" style=\"width:100%\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h4 class=\"card-title\">Education</h4>\r\n");
      out.write("                    <p class=\"card-text\">Learn Provide remote educational platform which make learning easy.</p>\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Read More</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img class=\"card-img-top\" src=\"");
      if (_jspx_meth_c_url_10(_jspx_page_context))
        return;
      out.write("\" alt=\"Card image\" style=\"width:100%\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h4 class=\"card-title\">Learning</h4>\r\n");
      out.write("                    <p class=\"card-text\">Learn Platform Share new Learning experience in Easy way with it's Users</p>\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Read More</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img class=\"card-img-top\" src=\"");
      if (_jspx_meth_c_url_11(_jspx_page_context))
        return;
      out.write("\" alt=\"Card image\" style=\"width:100%\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h4 class=\"card-title\">Innovation</h4>\r\n");
      out.write("                    <p class=\"card-text\">One of the Best Platform to bring out Student's Innovation in Unique</p>\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Read More</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img class=\"card-img-top\" src=\"");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write("\" alt=\"Card image\" style=\"width:100%\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h4 class=\"card-title\">Grow</h4>\r\n");
      out.write("                    <p class=\"card-text\">Learn provide Educational Knowledge and Growth of Children in Unique way</p>\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Read More</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>    \r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("<div class=\"container-fluid p-3 bg-dark text-white\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1>Online Education</h1>\r\n");
      out.write("        <p>Connect and Learn with Us. Learn is one of the best platform for Online Eduction.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("<script>\n");
      out.write("    $(\".custom-file-input\").on(\"change\", function() {\n");
      out.write("        var fileName = $(this).val().split(\"\\\\\").pop();\n");
      out.write("        $(this).siblings(\".custom-file-label\").addClass(\"selected\").html(fileName);\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <img src=\"");
      if (_jspx_meth_c_url_13(_jspx_page_context))
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
      out.write("</body>\n");
      out.write("</html>");
      out.write('\r');
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
    _jspx_th_c_url_0.setValue("resources/images/logo-2.png");
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
    _jspx_th_c_url_1.setValue("resources/css/style.css");
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
    _jspx_th_c_url_2.setValue("resources/js/jquery.js");
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
    _jspx_th_c_url_3.setValue("resources/js/popper.js");
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
    _jspx_th_c_url_4.setValue("resources/js/bootstrap.min.js");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
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
    _jspx_th_c_url_5.setValue("/resources/images/logo.png");
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
    _jspx_th_c_url_6.setValue("resources/images/4.jpg");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("resources/images/Second.jpg");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }

  private boolean _jspx_meth_c_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_8.setPageContext(_jspx_page_context);
    _jspx_th_c_url_8.setParent(null);
    _jspx_th_c_url_8.setValue("resources/images/First.jpg");
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
    return false;
  }

  private boolean _jspx_meth_c_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_9.setPageContext(_jspx_page_context);
    _jspx_th_c_url_9.setParent(null);
    _jspx_th_c_url_9.setValue("resources/images/slide1.jpg");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }

  private boolean _jspx_meth_c_url_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_10.setPageContext(_jspx_page_context);
    _jspx_th_c_url_10.setParent(null);
    _jspx_th_c_url_10.setValue("resources/images/slide1.jpg");
    int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
    if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
    return false;
  }

  private boolean _jspx_meth_c_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_11.setPageContext(_jspx_page_context);
    _jspx_th_c_url_11.setParent(null);
    _jspx_th_c_url_11.setValue("resources/images/slide1.jpg");
    int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
    if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
    return false;
  }

  private boolean _jspx_meth_c_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_12.setPageContext(_jspx_page_context);
    _jspx_th_c_url_12.setParent(null);
    _jspx_th_c_url_12.setValue("resources/images/slide1.jpg");
    int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
    if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
    return false;
  }

  private boolean _jspx_meth_c_url_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_13.setPageContext(_jspx_page_context);
    _jspx_th_c_url_13.setParent(null);
    _jspx_th_c_url_13.setValue("/resources/images/logo_footer.png");
    int _jspx_eval_c_url_13 = _jspx_th_c_url_13.doStartTag();
    if (_jspx_th_c_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
    return false;
  }
}
