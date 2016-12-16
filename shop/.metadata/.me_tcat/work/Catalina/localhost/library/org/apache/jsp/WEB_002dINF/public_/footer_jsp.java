package org.apache.jsp.WEB_002dINF.public_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"/library/css/foot.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/library/css/common.css\" type=\"text/css\" />\r\n");
      out.write("<div class=\"foot\">\r\n");
      out.write("\t<span style=\"float: left\">isunday © 2008 </span>\r\n");
      out.write("\t<ul class=\"navi2\">\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"font1\">个人主页</a></li> |&nbsp;&nbsp;\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"font1\">关于</a></li> |&nbsp;&nbsp;\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"font1\">开放平台</a></li> |&nbsp;&nbsp;\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"font1\">招聘</a></li> |&nbsp;&nbsp;\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"font1\">客服</a></li> |&nbsp;&nbsp;\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"font1\">帮助</a></li> |&nbsp;&nbsp;\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"font1\">隐私声明</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<div style=\"clear: right;\">\r\n");
      out.write("\t\t<img src=\"/library/images/index/footer.jpg\"\r\n");
      out.write("\t\t\tstyle=\"width: 50px; height: 50px; float: left\" />\r\n");
      out.write("\t\t <img src=\"/library/images/index/footer2.jpg\"\r\n");
      out.write("\t\t\tstyle=\"width: 50px; height: 50px; float: left\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
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
