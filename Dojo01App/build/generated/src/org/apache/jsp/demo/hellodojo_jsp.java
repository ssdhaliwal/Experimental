package org.apache.jsp.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hellodojo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Tutorial: Hello Dojo!</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1 id=\"greeting\">Hello</h1>\n");
      out.write("    <!-- configure Dojo -->\n");
      out.write("    <script>\n");
      out.write("        // Instead of using data-dojo-config, we're creating a dojoConfig\n");
      out.write("        // object *before* we load dojo.js; they're functionally identical,\n");
      out.write("        // it's just easier to read this approach with a larger configuration.\n");
      out.write("        var dojoConfig = {\n");
      out.write("            parseOnLoad: true,\n");
      out.write("            async: true,\n");
      out.write("            // This code registers the correct location of the \"demo\"\n");
      out.write("            // package so we can load Dojo from the CDN whilst still\n");
      out.write("            // being able to load local modules\n");
      out.write("            packages: [{\n");
      out.write("                name: \"demo\",\n");
      out.write("                location: '/Dojo01App/demo'\n");
      out.write("            }]\n");
      out.write("        };\n");
      out.write("    </script>\n");
      out.write("    <!-- load Dojo -->\n");
      out.write("    <script src=\"//ajax.googleapis.com/ajax/libs/dojo/1.10.4/dojo/dojo.js\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        require([\n");
      out.write("            'demo/myModule'\n");
      out.write("        ], function (myModule) {\n");
      out.write("            myModule.setText('greeting', 'Hello Dojo!');\n");
      out.write("\n");
      out.write("            setTimeout(function () {\n");
      out.write("                myModule.restoreText('greeting');\n");
      out.write("            }, 3000);\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
