package org.apache.jsp.WEB_002dINF.public_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>网上图书登陆页面</title>\r\n");
      out.write(" \t<!-- <script language=\"javascript\" type=\"text/javascript\">window.location.href=\"register.jsp?backurl=\"+window.location.href;</script> -->\r\n");
      out.write(" \t<script type=\"text/javascript\">\r\n");
      out.write("\tfunction jumpAndUpdate(pageName){\r\n");
      out.write("\t\twindow.open(pageName);//打开新页面\r\n");
      out.write("\t\twindow.location.reload();//重新加载本页面\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\t\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write(" \t<div>\r\n");
      out.write("\t\t<form method=\"post\" action=\"/library/login.do?flag=login\"><!-- -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t姓名：<input type=\"text\" name=\"username\"/><br>\r\n");
      out.write("\t\t\t\t密码：<input type=\"password\" name=\"password\" /><br><br>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" onclick=\"\" name=\"submit\" value=\"登录\" />\r\n");
      out.write("\t\t\t\t<input type=\"reset\" onclick=\"\" name=\"reset\" value=\"重置\"/>\t\t\r\n");
      out.write("\t\t</form> \r\n");
      out.write("\t</div>\r\n");
      out.write(" \t\r\n");
      out.write("\t<input type=\"button\" onclick=\"jumpAndUpdate('/library/jsp/register.jsp')\" value=\"注册\"/>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
}
