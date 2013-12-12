package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\">\n");
      out.write("<!--[if IE 7 ]><html lang=\"en\" class=\"no-js ie7\"> <![endif]-->\n");
      out.write("<!--[if IE 8 ]><html lang=\"en\" class=\"no-js ie8\"> <![endif]-->\n");
      out.write("<!--[if IE 9 ]><html lang=\"en\" class=\"no-js ie9\"> <![endif]-->\n");
      out.write("<!--[if (gt IE 9)|!(IE)]><!-->\n");
      out.write("<html lang=\"en\" class=\"no-js\" ng-app=\"hero\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "jspparts/head.jsp", out, false);
      out.write("\n");
      out.write("<body ata-spy=\"scroll\" data-target=\".bs-docs-sidebar\" data-twttr-rendered=\"true\">\n");
      out.write("\n");
      out.write("<div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("    <div class=\"navbar-inner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"nav-collapse collapse\">\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a style=\"width: 170px\"\n");
      out.write("                           href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/#/account\"\n");
      out.write("                           class=\"dropdown-toggle top-info-block\"><h3>Account</h3></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a style=\"width: 170px\"\n");
      out.write("                           href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/#/account/new\"\n");
      out.write("                           class=\"dropdown-toggle top-info-block\"><h3>New account</h3></a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div id=\"top-info\" class=\"pull-right\">\n");
      out.write("                    <div class=\"top-info-block\">\n");
      out.write("                        <h3 style=\"color:silver\">Version</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <hr class=\"separator pull-left\"/>\n");
      out.write("                    <div class=\"top-info-block\">\n");
      out.write("                        <h3 style=\"color:silver\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${partialExpireToken}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<header class=\"jumbotron subhead\" id=\"overview\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h3 id=\"submenu\" align=\"left\"></h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container align-center\">\n");
      out.write("        <p>To Hero</p>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("<div class=\"container\" style=\"padding-left: 35px\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"container\" ng-view>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "jspparts/footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
