package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class digitLayout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"demo.css\" media=\"screen\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" media=\"screen\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"//ajax.googleapis.com/ajax/libs/dojo/1.10.4/dijit/themes/claro/claro.css\" media=\"screen\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            html, body {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <!-- configure Dojo -->\n");
      out.write("        <script>\n");
      out.write("            var dojoConfig = {\n");
      out.write("                has: {\n");
      out.write("                    'dojo-firebug': false,\n");
      out.write("                    'dojo-debug-messages': true\n");
      out.write("                },\n");
      out.write("                parseOnLoad: true,\n");
      out.write("                async: true,\n");
      out.write("                baseUrl: '.',\n");
      out.write("                waitSeconds: 5,\n");
      out.write("                packages: [\n");
      out.write("                    {name: 'dojo'}, {name: 'dijit'},\n");
      out.write("                    {name: 'dojox'},\n");
      out.write("                    {name: 'demo', location: '/Dojo01App/demo'}],\n");
      out.write("                map: {\n");
      out.write("                    // Instead of having to type \"dojo/domReady!\", we just want \"ready!\" instead\n");
      out.write("                    \"*\": {\n");
      out.write("                        ready: \"dojo/domReady\"\n");
      out.write("                    }\n");
      out.write("                }};\n");
      out.write("        </script>\n");
      out.write("    <h1>Hello World!</h1>\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("</head>\n");
      out.write("<body class=\"claro\">\n");
      out.write("    <div id=\"appLayout\" class=\"demoLayout\" \n");
      out.write("         data-dojo-type=\"dijit/layout/BorderContainer\" \n");
      out.write("         data-dojo-props=\"design: 'headline'\">\n");
      out.write("        <div class=\"centerPanel\" \n");
      out.write("             data-dojo-type=\"dijit/layout/ContentPane\" \n");
      out.write("             data-dojo-props=\"region: 'center'\">\n");
      out.write("            <div>\n");
      out.write("                <h4>Group 1 Content</h4>\n");
      out.write("                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <h4>Group 2 Content</h4>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <h4>Group 3 Content</h4>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"edgePanel\" \n");
      out.write("             data-dojo-type=\"dijit/layout/ContentPane\" \n");
      out.write("             data-dojo-props=\"region: 'top'\">Header content (top)</div>\n");
      out.write("        <div id=\"leftCol\" class=\"edgePanel\" \n");
      out.write("             data-dojo-type=\"dijit/layout/ContentPane\" \n");
      out.write("             data-dojo-props=\"region: 'left', splitter: true\">Sidebar content (left)</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- load Dojo -->\n");
      out.write("    <script src=\"//ajax.googleapis.com/ajax/libs/dojo/1.10.4/dojo/dojo.js\"></script>\n");
      out.write("    <script>\n");
      out.write("            require([\"dojo/parser\", \"dijit/layout/BorderContainer\", \"dijit/layout/TabContainer\", \"dijit/layout/ContentPane\", \"dojo/domReady!\"], function (parser) {\n");
      out.write("                parser.parse();\n");
      out.write("            });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
