package org.apache.jsp.jspparts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "jsInclude.jsp", out, false);
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/jquery.min.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&noCompress=true\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/prettify.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/angular/angular.min.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&noCompress=true\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/js/jquery-ui-1.10.0.custom.min.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&noCompress=true\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap-transition.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap-alert.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap-modal.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap-dropdown.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap-scrollspy.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap-tab.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap-tooltip.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap-popover.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap-button.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap-collapse.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap-carousel.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/js/bootstrap-typeahead.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/scripts/modernizr-2.6.1.min.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/scripts/html2canvas.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/js/jquery.blueimp-gallery.min.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></script>\n");
      out.write("<!-- The Iframe Transport is required for browsers without support for XHR file uploads -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/js/jquery.iframe-transport.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></script>\n");
      out.write("<!-- The basic File Upload plugin -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/js/jquery.fileupload.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></script>\n");
      out.write("<!-- The File Upload processing plugin -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/js/jquery.fileupload-process.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></script>\n");
      out.write("<!-- The File Upload validation plugin -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/js/jquery.fileupload-validate.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></script>\n");
      out.write("<!-- The File Upload Angular JS module -->\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/js/jquery.fileupload-jquery-ui.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/js/jquery.fileupload-angular.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/client/hero.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/client/heroServices.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                              `\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/client/hero.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/angular/angular-resource.min.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jqgrid/js/grid.locale-ro.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/ui/datepicker-ro.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jqgrid/js/jquery.jqGrid.min.js");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resourcePrefix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&noCompress=true\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).on('click', 'input', function () {$(\".ui-jqgrid\").removeClass(\"grid-focus\");});$(document).on('click', '.ui-jqgrid', function () {idGrid = this.id.replace(\"gview_\", \"\");$(\".ui-jqgrid\").removeClass(\"grid-focus\");$(this).toggleClass(\"grid-focus\");});</script>\n");
      out.write("<div id=\"spinner\" style=\"display: none\">\n");
      out.write("    <img src=\"jquery/css/images/loading.gif\" alt=\"Loading\" />\n");
      out.write("</div>");
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
