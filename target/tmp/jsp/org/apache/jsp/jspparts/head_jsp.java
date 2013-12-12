package org.apache.jsp.jspparts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("<head>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "jsDef.jsp", out, false);
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Hero</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<link type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/css/jquery.fileupload-ui.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("<link type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/css/blueimp-gallery.min.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("<link type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/css/jquery-ui-1.10.0.custom.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("<link type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/fonts/font-awesome.min.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jqgrid/css/ui.jqgrid.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/bootstrap.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/bootstrap-ext.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/bootstrap-responsive.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/docs.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/prettify.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/bootmetro.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/bootmetro-tiles.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/bootmetro-charms.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/metro-ui-light.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/css/icomoon.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/app.css");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".ui-jqgrid td {\n");
      out.write("font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n");
      out.write("font-size: 13px;\n");
      out.write("}\n");
      out.write(".ui-jqgrid .ui-pg-input {\n");
      out.write("width: 24px;\n");
      out.write("height: 22px;\n");
      out.write("font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n");
      out.write("font-size: 12px;\n");
      out.write("}\n");
      out.write(".ui-jqgrid .ui-pg-selbox {\n");
      out.write("width: 50px;\n");
      out.write("height: 22px;\n");
      out.write("font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n");
      out.write("font-size: 12px;\n");
      out.write("}\n");
      out.write(".ui-jqgrid select {\n");
      out.write("width: 50px;\n");
      out.write("padding: 0;\n");
      out.write("height: 22px;\n");
      out.write("}\n");
      out.write(".page-header h1 {\n");
      out.write("font-size: 24px;\n");
      out.write("}\n");
      out.write(".spacer {\n");
      out.write("margin-top: 40px;\n");
      out.write("}\n");
      out.write("input[type=radio] {\n");
      out.write("opacity: 1;\n");
      out.write("margin-top:-7px;\n");
      out.write("margin-left: -5px;\n");
      out.write("}\n");
      out.write(".cbox{\n");
      out.write("width: 13px;\n");
      out.write("height: 13px;\n");
      out.write("position: relative;\n");
      out.write("}\n");
      out.write("#detaliiPaginaPrime h3{\n");
      out.write("height:30px;\n");
      out.write("padding-left:30px;\n");
      out.write("padding-top:10px;\n");
      out.write("padding-bottom:10px;\n");
      out.write("font-size: 1.6em;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>");
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
}
