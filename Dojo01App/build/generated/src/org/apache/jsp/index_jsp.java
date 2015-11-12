package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/dojo-release-1.10.4-src/dijit/themes/claro/claro.css\" media=\"screen\">\n");
      out.write("    </head>\n");
      out.write("    <script src=\"//ajax.googleapis.com/ajax/libs/dojo/1.10.4/dojo/dojo.js\" \n");
      out.write("    data-dojo-config=\"async: true\"></script>\n");
      out.write("    <body>\n");
      out.write("        <h1 id=\"greeting\">Hello</h1>\n");
      out.write("        <script>\n");
      out.write("            require([\n");
      out.write("                'dojo/dom',\n");
      out.write("                'dojo/fx',\n");
      out.write("                'dojo/dom-construct',\n");
      out.write("                'dojo/domReady!'\n");
      out.write("            ], function (dom, fx, domConstruct) {\n");
      out.write("                var greetingNode = dom.byId('greeting');\n");
      out.write("                domConstruct.place('<em> Dojo!</em>', greetingNode);\n");
      out.write("\n");
      out.write("                // ...but now, with an animation!\n");
      out.write("                fx.slideTo({\n");
      out.write("                    node: greeting,\n");
      out.write("                    top: 100,\n");
      out.write("                    left: 200\n");
      out.write("                }).play();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
