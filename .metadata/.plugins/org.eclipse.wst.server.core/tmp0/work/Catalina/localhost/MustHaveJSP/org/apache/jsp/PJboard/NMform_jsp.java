/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-29 00:41:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.PJBoard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NMform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("	table {\r\n");
      out.write("    margin-left:auto; \r\n");
      out.write("    margin-right:auto;\r\n");
      out.write("		}	\r\n");
      out.write("		*{ margin:0; padding: 0;}\r\n");
      out.write("        body{background-color: #F5F6F7;}\r\n");
      out.write("        form{margin-top: 60px;margin-left: 38%;}\r\n");
      out.write("        ul,li{ list-style: none; margin-left: auto; margin-right: auto;}\r\n");
      out.write("        li{margin-bottom: 20px; text-align: left;}\r\n");
      out.write("        .box{width: 450px; height: 50px; border: 1px solid #666; padding: 10px;}\r\n");
      out.write("        .pbox{width: 120px; height: 50px; border: 1px solid #666; padding: 10px;}\r\n");
      out.write("       .necessary{font-size: small; color:red;}\r\n");
      out.write("   		button{background:#00C850; color:white; width: 450px; border: 1px solid #666; height:50px; font-size: x-large; }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./Common2/Link.jsp", out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("	function validateForm(form) {\r\n");
      out.write("		/*\r\n");
      out.write("			<form>태그 하위의 각 input 태그에 입력값이 있는지 확인하여 만약\r\n");
      out.write("			빈값이라면 경고창, 포커스 이동, 폼값전송 취소 처리를 한다.\r\n");
      out.write("		*/\r\n");
      out.write("		if(!form.id.value){\r\n");
      out.write("			alert(\"아이디를 입력하세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		if(form.pass.value == \"\"){\r\n");
      out.write("			alert(\"패스워드를 입력하세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		if(form.name.value == \"\"){\r\n");
      out.write("			alert(\"이름를 입력하세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		if(form.phone.value == \"\"){\r\n");
      out.write("			alert(\"핸드폰 번호를 입력하세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		if(form.email.value == \"\"){\r\n");
      out.write("			alert(\"이메일를 입력하세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		if(form.gender.value == \"\"){\r\n");
      out.write("			alert(\"성별를 골라주세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("			\r\n");
      out.write("	}\r\n");
      out.write("	</script>\r\n");
      out.write("	<script>\r\n");
      out.write("		 const hypenTel = (target) => {\r\n");
      out.write("		 target.value = target.value\r\n");
      out.write("		   .replace(/[^0-9]/g, '')\r\n");
      out.write("		   .replace(/^(\\d{2,3})(\\d{3,4})(\\d{4})$/, `$1-$2-$3`);\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("	<h2 align=\"center\">회원가입 페이지</h2>\r\n");
      out.write("	<form action=\"NMprocess.jsp\" method=\"post\" onsubmit=\"return validateForm(this);\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><span >아이디</span><br><input type = \"text\" name=\"id\" placeholder = \"아이디를 입력하세요\" class = 'box'/>\r\n");
      out.write("                <br><span class = 'necessary' >필수 정보입니다.</span></li>\r\n");
      out.write("               		\r\n");
      out.write("                <li><span >패스워드</span><br><input type = \"password\" name=\"pass\" placeholder = \"패스워드를 입력하세요\" class = 'box'/>\r\n");
      out.write("                    <br><span class = 'necessary' >필수 정보입니다.</span></li>\r\n");
      out.write("    			       	\r\n");
      out.write("           		<li><span >이름</span><br><input type = \"text\" name=\"name\" placeholder = \"이름을 입력하세요\" class = 'box'/>\r\n");
      out.write("                <br><span class = 'necessary' >필수 정보입니다.</span></li>\r\n");
      out.write("           	\r\n");
      out.write("                 <li><span >이메일</span><br><input type = \"text\" name=\"email\" placeholder = \"이메일을 입력하세요\" class = 'box'/>\r\n");
      out.write("                <br><span class = 'necessary' >필수 정보입니다.</span></li>\r\n");
      out.write("                \r\n");
      out.write("                 <li><span >전화번호 </span><br><input type = \"text\" name=\"phone\" \r\n");
      out.write("                 placeholder = \"전화번호를 입력하세요\" class = 'box' oninput=\"hypenTel(this)\" maxlength=\"13\"/>\r\n");
      out.write("                <br><span class = 'necessary' >필수 정보입니다.</span></li>\r\n");
      out.write("                \r\n");
      out.write("                <li><span >성별</span><br> \r\n");
      out.write("                남자<input type =\"radio\" name=\"gender\" value=\"m\"/>\r\n");
      out.write("                여자<input type=\"radio\" name=\"gender\" value=\"f\" />\r\n");
      out.write("                <br><span class = 'necessary' >필수 정보입니다.</span> </li>\r\n");
      out.write("                 <li><input type=\"submit\" value=\"가입\" style=\"background:#00C850; color:white; width: 450px; border: 1px solid #666; height:50px; font-size: x-large;\" /></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        </form>\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}