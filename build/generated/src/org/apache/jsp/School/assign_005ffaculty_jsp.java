package org.apache.jsp.School;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class assign_005ffaculty_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/School/school_header.jsp");
    _jspx_dependants.add("/School/school_footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_select_required_path_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_option_value_label_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_options_items_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_option_value_label_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_select_required_path_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_option_value_label_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_options_items_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_option_value_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_select_required_path_name.release();
    _jspx_tagPool_form_option_value_label_disabled_nobody.release();
    _jspx_tagPool_form_options_items_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_form_option_value_label_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("        <script src=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("        <script src=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("        <script src=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
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
      if (_jspx_meth_c_url_6(_jspx_page_context))
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
      out.write("<section class=\"login\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"heading\">\n");
      out.write("            <h1><span>Assign </span>Subject</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"page-card\">\n");
      out.write("            ");
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
          out.write("                    <strong>Done !</strong> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                    ");
session.removeAttribute("message"); 
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
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      out.write("\n");
      out.write("            <form action=\"assignsubject\" method=\"POST\">\n");
      out.write("                <input type=\"hidden\" name=\"school_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-users\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      //  form:select
      org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_required_path_name.get(org.springframework.web.servlet.tags.form.SelectTag.class);
      _jspx_th_form_select_0.setPageContext(_jspx_page_context);
      _jspx_th_form_select_0.setParent(null);
      _jspx_th_form_select_0.setDynamicAttribute(null, "name", new String("standard"));
      _jspx_th_form_select_0.setPath("standard");
      _jspx_th_form_select_0.setDynamicAttribute(null, "required", new String(""));
      int[] _jspx_push_body_count_form_select_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_select_0 = _jspx_th_form_select_0.doStartTag();
        if (_jspx_eval_form_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                        ");
            //  form:option
            org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_0 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
            _jspx_th_form_option_0.setPageContext(_jspx_page_context);
            _jspx_th_form_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
            _jspx_th_form_option_0.setValue(new String("NONE"));
            _jspx_th_form_option_0.setLabel("Select Standard");
            int[] _jspx_push_body_count_form_option_0 = new int[] { 0 };
            try {
              int _jspx_eval_form_option_0 = _jspx_th_form_option_0.doStartTag();
              if (_jspx_th_form_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_option_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_option_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_option_0.doFinally();
              _jspx_tagPool_form_option_value_label_nobody.reuse(_jspx_th_form_option_0);
            }
            out.write("\n");
            out.write("                        ");
            if (_jspx_meth_form_options_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_0, _jspx_page_context, _jspx_push_body_count_form_select_0))
              return;
            out.write("\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_form_select_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_select_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_select_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_select_0.doFinally();
        _jspx_tagPool_form_select_required_path_name.reuse(_jspx_th_form_select_0);
      }
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-tasks\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      //  form:select
      org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_1 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_required_path_name.get(org.springframework.web.servlet.tags.form.SelectTag.class);
      _jspx_th_form_select_1.setPageContext(_jspx_page_context);
      _jspx_th_form_select_1.setParent(null);
      _jspx_th_form_select_1.setDynamicAttribute(null, "name", new String("medium"));
      _jspx_th_form_select_1.setPath("medium");
      _jspx_th_form_select_1.setDynamicAttribute(null, "required", new String(""));
      int[] _jspx_push_body_count_form_select_1 = new int[] { 0 };
      try {
        int _jspx_eval_form_select_1 = _jspx_th_form_select_1.doStartTag();
        if (_jspx_eval_form_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                        ");
            //  form:option
            org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_1 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_disabled_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
            _jspx_th_form_option_1.setPageContext(_jspx_page_context);
            _jspx_th_form_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_1);
            _jspx_th_form_option_1.setValue(new String("NONE"));
            _jspx_th_form_option_1.setLabel("Select Medium");
            _jspx_th_form_option_1.setDisabled(false);
            int[] _jspx_push_body_count_form_option_1 = new int[] { 0 };
            try {
              int _jspx_eval_form_option_1 = _jspx_th_form_option_1.doStartTag();
              if (_jspx_th_form_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_option_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_option_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_option_1.doFinally();
              _jspx_tagPool_form_option_value_label_disabled_nobody.reuse(_jspx_th_form_option_1);
            }
            out.write("\n");
            out.write("                        ");
            if (_jspx_meth_form_options_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_1, _jspx_page_context, _jspx_push_body_count_form_select_1))
              return;
            out.write("\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_form_select_1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_select_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_select_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_select_1.doFinally();
        _jspx_tagPool_form_select_required_path_name.reuse(_jspx_th_form_select_1);
      }
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-asterisk\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      //  form:select
      org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_2 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_required_path_name.get(org.springframework.web.servlet.tags.form.SelectTag.class);
      _jspx_th_form_select_2.setPageContext(_jspx_page_context);
      _jspx_th_form_select_2.setParent(null);
      _jspx_th_form_select_2.setDynamicAttribute(null, "name", new String("subject"));
      _jspx_th_form_select_2.setPath("subject");
      _jspx_th_form_select_2.setDynamicAttribute(null, "required", new String(""));
      int[] _jspx_push_body_count_form_select_2 = new int[] { 0 };
      try {
        int _jspx_eval_form_select_2 = _jspx_th_form_select_2.doStartTag();
        if (_jspx_eval_form_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                        ");
            //  form:option
            org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_2 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_disabled_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
            _jspx_th_form_option_2.setPageContext(_jspx_page_context);
            _jspx_th_form_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_2);
            _jspx_th_form_option_2.setValue(new String("NONE"));
            _jspx_th_form_option_2.setLabel("Select Subject");
            _jspx_th_form_option_2.setDisabled(false);
            int[] _jspx_push_body_count_form_option_2 = new int[] { 0 };
            try {
              int _jspx_eval_form_option_2 = _jspx_th_form_option_2.doStartTag();
              if (_jspx_th_form_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_option_2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_option_2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_option_2.doFinally();
              _jspx_tagPool_form_option_value_label_disabled_nobody.reuse(_jspx_th_form_option_2);
            }
            out.write("\n");
            out.write("                        ");
            if (_jspx_meth_form_options_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_2, _jspx_page_context, _jspx_push_body_count_form_select_2))
              return;
            out.write("\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_form_select_2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_select_2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_select_2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_select_2.doFinally();
        _jspx_tagPool_form_select_required_path_name.reuse(_jspx_th_form_select_2);
      }
      out.write("\n");
      out.write("                </div>                   \n");
      out.write("                <div class=\"input-group form-group\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                        <span class=\"input-group-text\"><i class=\"fa fa-users\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      //  form:select
      org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_3 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_required_path_name.get(org.springframework.web.servlet.tags.form.SelectTag.class);
      _jspx_th_form_select_3.setPageContext(_jspx_page_context);
      _jspx_th_form_select_3.setParent(null);
      _jspx_th_form_select_3.setDynamicAttribute(null, "name", new String("faculty_id"));
      _jspx_th_form_select_3.setPath("faculty");
      _jspx_th_form_select_3.setDynamicAttribute(null, "required", new String(""));
      int[] _jspx_push_body_count_form_select_3 = new int[] { 0 };
      try {
        int _jspx_eval_form_select_3 = _jspx_th_form_select_3.doStartTag();
        if (_jspx_eval_form_select_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                        ");
            //  form:option
            org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_3 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_disabled_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
            _jspx_th_form_option_3.setPageContext(_jspx_page_context);
            _jspx_th_form_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_3);
            _jspx_th_form_option_3.setValue(new String("NONE"));
            _jspx_th_form_option_3.setLabel("Select Faculty Member");
            _jspx_th_form_option_3.setDisabled(false);
            int[] _jspx_push_body_count_form_option_3 = new int[] { 0 };
            try {
              int _jspx_eval_form_option_3 = _jspx_th_form_option_3.doStartTag();
              if (_jspx_th_form_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_option_3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_option_3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_option_3.doFinally();
              _jspx_tagPool_form_option_value_label_disabled_nobody.reuse(_jspx_th_form_option_3);
            }
            out.write("\n");
            out.write("                        ");
            if (_jspx_meth_form_options_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_3, _jspx_page_context, _jspx_push_body_count_form_select_3))
              return;
            out.write("\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_form_select_3.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_select_3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_select_3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_select_3.doFinally();
        _jspx_tagPool_form_select_required_path_name.reuse(_jspx_th_form_select_3);
      }
      out.write("\n");
      out.write("                </div>                                 \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"submit\" value=\"Save\" class=\"btn login_btn\"> \n");
      out.write("                </div> \n");
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
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <img src=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
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
      out.write("\n");
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
    _jspx_th_c_url_3.setValue("../resources/js/jquery.js");
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
    _jspx_th_c_url_4.setValue("../resources/js/dt.js");
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
    _jspx_th_c_url_5.setValue("../resources/js/popper.js");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
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

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("../resources/images/logo.png");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_form_options_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_0 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_0.setPageContext(_jspx_page_context);
    _jspx_th_form_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
    _jspx_th_form_options_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${school_standard}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_form_options_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_0 = _jspx_th_form_options_0.doStartTag();
      if (_jspx_th_form_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_0.doFinally();
      _jspx_tagPool_form_options_items_nobody.reuse(_jspx_th_form_options_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_options_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_1 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_1.setPageContext(_jspx_page_context);
    _jspx_th_form_options_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_1);
    _jspx_th_form_options_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medium}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_form_options_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_1 = _jspx_th_form_options_1.doStartTag();
      if (_jspx_th_form_options_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_1.doFinally();
      _jspx_tagPool_form_options_items_nobody.reuse(_jspx_th_form_options_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_options_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_2 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_2.setPageContext(_jspx_page_context);
    _jspx_th_form_options_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_2);
    _jspx_th_form_options_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_form_options_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_2 = _jspx_th_form_options_2.doStartTag();
      if (_jspx_th_form_options_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_2.doFinally();
      _jspx_tagPool_form_options_items_nobody.reuse(_jspx_th_form_options_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_options_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_3 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_3.setPageContext(_jspx_page_context);
    _jspx_th_form_options_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_3);
    _jspx_th_form_options_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${faculty}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_form_options_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_3 = _jspx_th_form_options_3.doStartTag();
      if (_jspx_th_form_options_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_3.doFinally();
      _jspx_tagPool_form_options_items_nobody.reuse(_jspx_th_form_options_3);
    }
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
    _jspx_th_c_url_7.setValue("../resources/images/logo_footer.png");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }
}
