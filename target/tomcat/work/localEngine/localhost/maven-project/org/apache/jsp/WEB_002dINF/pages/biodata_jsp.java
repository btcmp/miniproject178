package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class biodata_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/img/apple-icon.png\" />\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/img/favicon.png\" />\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\t<title>Material Dashboard by Creative Tim</title>\n");
      out.write("\t<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("\t<meta name=\"_csrf\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\n");
      out.write("\t<!-- default header name is X-CSRF-TOKEN -->\n");
      out.write("\t<meta name=\"_csrf_header\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.headerName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap core CSS     -->\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\t<!--  Material Dashboard CSS    -->\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/css/material-dashboard.css?v=1.2.0\"\trel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\t<!--  CSS for Demo Purpose, don't include it in your project     -->\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/datepicker/dist/datepicker.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\t<!--     Fonts and icons     -->\n");
      out.write("\t<link href=\"https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("\t<style> input.parsley-error { color: #B94A48 !important; background-color: #F2DEDE !important; border: 1px solid #EED3D7 !important; }</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"wrapper\">\n");
      out.write("\t\t<div class=\"sidebar\" data-color=\"purple\" data-image=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/img/sidebar-1.jpg\">\n");
      out.write("\t\t\n");
      out.write("\t\t<!--\n");
      out.write("        Tip 1: You can change the color of the sidebar using: data-color=\"purple | blue | green | orange | red\"\n");
      out.write("\n");
      out.write("        Tip 2: you can also add an image using data-image tag\n");
      out.write("    \t-->\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<a href=\"http://www.creative-tim.com\" class=\"simple-text\"> Batch 178 </a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"sidebar-wrapper\">\n");
      out.write("\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t\t<li><a href=\"dashboard.html\"> \n");
      out.write("\t\t\t\t\t\t<i class=\"material-icons\">dashboard</i>\n");
      out.write("\t\t\t\t\t\t<p>Dashboard</p>\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/department\">\n");
      out.write("\t\t\t\t\t\t<i class=\"material-icons\">library_books</i>\n");
      out.write("\t\t\t\t\t\t<p>Department</p>\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/employee\">\n");
      out.write("\t\t\t\t\t\t<i class=\"material-icons\">bubble_chart</i>\n");
      out.write("\t\t\t\t\t\t<p>Employee</p>\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/account\">\n");
      out.write("\t\t\t\t\t\t<i class=\"material-icons\">person</i>\n");
      out.write("\t\t\t\t\t\t<p>User Account</p>\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/biodata\"> \n");
      out.write("\t\t\t\t\t\t<i class=\"material-icons\">person</i>\n");
      out.write("\t\t\t\t\t\t<p>Biodata</p>\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/office\">\n");
      out.write("                            <i class=\"material-icons\">work</i>\n");
      out.write("                            <p>Office</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/question\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"material-icons\">library_books</i>\n");
      out.write("\t\t\t\t\t\t\t<p>Questions</p>\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/technology\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"material-icons\">library_books</i>\n");
      out.write("\t\t\t\t\t\t\t<p>Technology</p>\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" id=\"logout\"> <i class=\"material-icons\">block</i>\n");
      out.write("\t\t\t\t\t\t\t<p>Logout</p>\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logoutUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\" id=\"logoutForm\">\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"main-panel\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-primary navbar-absolute\">\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span> \n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"#\"> BIODATA TABLE </a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-12 col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-header\" data-background-color=\"orange\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"title\">List Biodata</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"category\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t                           \t<div class=\"card-content table-responsive\">\n");
      out.write("\t                           \t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/biodata\">\n");
      out.write("\t                           \t\t\t<input type=\"search\" id=\"search\" placeholder=\"Search by Name\"/>\n");
      out.write("\t                           \t\t\t<button type=\"button\" id=\"tambahBiodata\" class=\"btn btn-sm btn-primary\"> + </button>\n");
      out.write("                       \t\t\t\t</form>\n");
      out.write("\t                     \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-content table-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table id=\"table-user\" class=\"table table-hover\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead class=\"text-warning\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>NAME</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>MAJORS</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>GPA</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>ACTION</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<footer class=\"footer\">\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t\t<nav class=\"pull-left\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Home </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Company </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Portfolio </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"> Blog </a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t<p class=\"copyright pull-right\">\n");
      out.write("\t\t\t\t\t\t&copy;\n");
      out.write("\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\tdocument.write(new Date().getFullYear())\n");
      out.write("\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\t<a href=\"http://www.creative-tim.com\">Creative Tim</a>, made with\n");
      out.write("\t\t\t\t\t\tlove for a better web\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</footer>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- Modal -->\n");
      out.write("\t<div class=\"modal fade\" id=\"addBiodata\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header text-center\">\n");
      out.write("\t\t\t\t\t<h3 class=\"modal-title w-100 font-weight-bold\">Add Biodata</h3>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t     \t\n");
      out.write("\t\t     \t<div class=\"modal-body\">\n");
      out.write("\t\t     \t\t\n");
      out.write("\t\t     \t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/biodata/save\" method=\"POST\">\n");
      out.write("\t\t\t\t      \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"name\" class=\"form-control\" placeholder=\"Name\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"lastEducation\" class=\"form-control\" placeholder=\"Last Education\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"educationalLevel\" class=\"form-control\" placeholder=\"Educational Level\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"majors\" class=\"form-control\" placeholder=\"Majors\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"gpa\" class=\"form-control\" placeholder=\"GPA\" />\n");
      out.write("\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" id=\"saving\" class=\"btn btn-primary\">Save</button>\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" id=\"canceling\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t     \t </div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!--   Core JS Files   -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/material.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!--  Charts Plugin -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/chartist.min.js\"></script>\n");
      out.write("\n");
      out.write("<!--  Dynamic Elements plugin -->\n");
      out.write("<script\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/arrive.min.js\"></script>\n");
      out.write("\n");
      out.write("<!--  PerfectScrollbar Library -->\n");
      out.write("<script\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("<script\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/datepicker/dist/datepicker.js\"></script>\n");
      out.write("\n");
      out.write("<!--  Notifications Plugin    -->\n");
      out.write("<script\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/bootstrap-notify.js\"></script>\n");
      out.write("<script\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Material Dashboard javascript methods -->\n");
      out.write("<script\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/material-dashboard.js?v=1.2.0\"></script>\n");
      out.write("<script\tsrc=\"https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js\" />\n");
      out.write("<script\tsrc=\"https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js\" />\n");
      out.write("\n");
      out.write("<!-- Material Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("<script\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/demo.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\tvar button=jQuery('#saving').click(function(event){\n");
      out.write("\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar name=jQuery('#name').val();\n");
      out.write("\t\t\tvar lasted=jQuery('#lastEducation').val();\n");
      out.write("\t\t\tvar edlev=jQuery('#educationalLevel').val();\n");
      out.write("\t\t\tvar majors=jQuery('#majors').val();\n");
      out.write("\t\t\tvar gpa=jQuery('#gpa').val();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar biodata={\n");
      out.write("\t\t\t\t\tname:name,\n");
      out.write("\t\t\t\t\tlasted:lasted,\n");
      out.write("\t\t\t\t\tedlev:edlev,\n");
      out.write("\t\t\t\t\tmajors:majors,\n");
      out.write("\t\t\t\t\tgpa:gpa\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tjQuery.ajax({\n");
      out.write("\t\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/biodata/save',\n");
      out.write("\t\t\t\ttype:'POST',\n");
      out.write("\t\t\t\tbeforeSend: function(){\n");
      out.write("\t\t\t\t\tconsole.log(biodata);\n");
      out.write("\t\t\t\t\tconsole.log('contact server');\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tcontentType:'application/json',\n");
      out.write("\t\t\t\tdata:JSON.stringify(biodata),\n");
      out.write("\t\t\t\tsuccess: function(data){\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\twindow.location='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/biodata'\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t})\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//setting up datepicker\n");
      out.write("\t\t$('#birthDate123').datepicker();\n");
      out.write("\t\tfunction ajaxSetUp() {\n");
      out.write("\t\t\tvar token = $(\"meta[name='_csrf']\").attr(\"content\");\n");
      out.write("\t\t\tvar header = $(\"meta[name='_csrf_header']\").attr(\"content\");\n");
      out.write("\t\t\t$(document).ajaxSend(function(e, xhr, options) {\n");
      out.write("\t\t\t\txhr.setRequestHeader(header, token);\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t$('#table-user').DataTable();\n");
      out.write("\n");
      out.write("\t\t$('.btn-hapus').on('click',\tfunction() {\n");
      out.write("\t\t\tvar conf = confirm(\"Are you sure delete this data ?\");\n");
      out.write("\t\t\tif (conf == true) {\n");
      out.write("\t\t\t\tvar id = $(this).attr(\"id\");\n");
      out.write("\t\t\t\tajaxSetUp();\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/department/delete/'+ id,\n");
      out.write("\t\t\t\t\ttype : 'DELETE',\n");
      out.write("\t\t\t\t\tsuccess : function(data) {window.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/department\";},\n");
      out.write("\t\t\t\t\terror : function() {alert('delete data failed..!!');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\treturn false;\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t//logout event button\n");
      out.write("\t$('#logout').click(function(event) {\n");
      out.write("\t\tevent.preventDefault();\n");
      out.write("\t\t$('#logoutForm').submit();\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t//modal\n");
      out.write("\t$('#tambahBiodata').click(function(event) {\n");
      out.write("\t\tevent.preventDefault();\n");
      out.write("\t\t$('#addBiodata').modal();\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/pages/biodata.jsp(5,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/j_spring_security_logout");
    // /WEB-INF/pages/biodata.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("logoutUrl");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/pages/biodata.jsp(139,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("biodata");
    // /WEB-INF/pages/biodata.jsp(139,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/biodata.jsp(139,11) '${biodatas }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${biodatas }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><a id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dept.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" href=\"#\" class=\"btn-hapus btn btn-danger btn-sm\">Delete</a></td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/pages/biodata.jsp(141,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${biodata.name }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/pages/biodata.jsp(142,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${biodata.majors }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/pages/biodata.jsp(143,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${biodata.gpa }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }
}
