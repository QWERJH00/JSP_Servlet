/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-23 07:51:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.PJBoard.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utils.JSFunction;

public final class LoginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("utils.JSFunction");
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
      response.setContentType("text/html; charset=EUC-KR");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("		*{ margin:0; padding: 0;}\r\n");
      out.write("        body{background-color: #F5F6F7;}\r\n");
      out.write("        form{margin-top: 60px;margin-left: 38%;}\r\n");
      out.write("        ul,li{ list-style: none;}\r\n");
      out.write("        li{margin-bottom: 20px; text-align: left;}\r\n");
      out.write("        .box{width: 450px; height: 50px; border: 1px solid #666; padding: 10px;}\r\n");
      out.write("        .pbox{width: 120px; height: 50px; border: 1px solid #666; padding: 10px;}\r\n");
      out.write("       .necessary{font-size: small; color:red;}\r\n");
      out.write("       placeholder{\r\n");
      out.write("       font-size: 20px;\r\n");
      out.write("       }\r\n");
      out.write("   		\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- \r\n");
      out.write("		액션 태그를 통해 공통링크로 사용할 페이지를 인클루드하여 해당문서에\r\n");
      out.write("		포함시킨다.\r\n");
      out.write("	 -->\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Common2/Link.jsp", out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<h2>로그인 페이지</h2>\r\n");
      out.write("	<!-- \r\n");
      out.write("		삼항연산자를 통해 request영역에 저장된 속성값이 있는 경우에만\r\n");
      out.write("		에러 메세지를 화면에 출력한다.\r\n");
      out.write("		해당 속성값은 로그인 처리 페이지에서 회원정보를 DB에서 찾지 못한 경우\r\n");
      out.write("		request영역에 속성값을 저장하게 된다.\r\n");
      out.write("	 -->\r\n");
      out.write("	<span style=\"color: red; font-size: 1.2em;\">\r\n");
      out.write("		");
      out.print( request.getAttribute("LoginErrMsg") == null ?
			"" : request.getAttribute("LoginErrMsg"));
      out.write("\r\n");
      out.write("	</span>\r\n");
      out.write("	");

	/*
		세션영역에 UserId라는 속성값이 없는 경우, 즉 로그인 처리가 되지 않은
		상태에서는 로그인폼과 검증을 위한 JS를 웹브라우저에 출력한다.
	*/
	if (session.getAttribute("UserId") == null){  // 로그인 상태 확인
		
		//로그아웃 상태
		
	
      out.write("\r\n");
      out.write("	<!-- 로그인 폼의 입력값을 검증하기 위한 함수로 빈값인지를 확인한다. -->\r\n");
      out.write("	<script>\r\n");
      out.write("	function validateForm(form) {\r\n");
      out.write("		/*\r\n");
      out.write("			<form>태그 하위의 각 input 태그에 입력값이 있는지 확인하여 만약\r\n");
      out.write("			빈값이라면 경고창, 포커스 이동, 폼값전송 취소 처리를 한다.\r\n");
      out.write("		*/\r\n");
      out.write("		if(!form.user_id.value){\r\n");
      out.write("			alert(\"아이디를 입력하세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("			\r\n");
      out.write("		}\r\n");
      out.write("		if(form.user_pw.value == \"\"){\r\n");
      out.write("			alert(\"패스워드를 입력하세요.\");\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("			\r\n");
      out.write("	}\r\n");
      out.write("	</script>\r\n");
      out.write("	<!-- \r\n");
      out.write("		폼값 전송을 위한<form>태그로 전송할 때 URL, 전송방식, 폼의 이름,\r\n");
      out.write("		submit이벤트 리스너로 구성한다. 특히 폼값검증을 위한 validateForm()\r\n");
      out.write("		함수 호출시 <form>태그의 DOM을 인수로 전달한다.\r\n");
      out.write("	 -->\r\n");
      out.write("	<form action=\"./LoginProcess.jsp\" method=\"post\" name=\"loginFrm\"\r\n");
      out.write("		onsubmit=\"return validateForm(this);\">\r\n");
      out.write("		<span >아이디</span><br><input type = \"text\" name=\"user_id\" placeholder = \"id\" class = 'box'/> <br/>\r\n");
      out.write("		<span >비밀번호</span><br><input type = \"password\" name=\"user_pw\" placeholder = \"pw\" class = 'box'/><br/>\r\n");
      out.write("		<input type=\"submit\" value=\"로그인하기\"\r\n");
      out.write("		style=\"background:#00C850; color:white; width: 450px; border: 1px solid #666; height:50px; font-size: x-large;\" />\r\n");
      out.write("	</form>\r\n");
      out.write("	");

	} else{ // 로그인 상태
		/*
			session영역에 저장된 속성값이 있다면 로그인된 상태이므로 회원정보
			및 로그아웃 버튼을 화면에 출력한다.
		*/
	
      out.write("\r\n");
      out.write("		");
 JSFunction.alertLocation("로그인 성공", "../List.jsp", out); 
      out.write('\r');
      out.write('\n');
      out.write('	');

	}
	
      out.write("\r\n");
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
