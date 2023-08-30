/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-28 07:32:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.PJBoard.MemberManagement;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pjboard.PJBoardDAO;
import pjboard.PJBoardDTO;
import utils.JSFunction;

public final class DeleteProcess3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/PJBoard/MemberManagement/../IsLoggedIn.jsp", Long.valueOf(1692768231169L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("utils.JSFunction");
    _jspx_imports_classes.add("pjboard.PJBoardDAO");
    _jspx_imports_classes.add("pjboard.PJBoardDTO");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

/*
	로그인 체크를 위한 파일로 섹션영역에 UserId라는 속성값이 없으면
	경고창을 띄운 후 로그인페이지로 이동합니다.
	로그인이 필요한 모든 페이지 상단에 include지시어를 통해 포함시킬
	예정이다.
*/
if(session.getAttribute("UserId") == null){
	JSFunction.alertLocation("로그인 후 이용해주십시오.",
			"./Login/LoginForm.jsp", out);
	
	return;
}

// else if(session.getAttribute("UserId") != ("admin")){
// 	JSFunction.alertLocation("관리자가 아닙니다.", 
// 			"./List.jsp", out);
// 	return;
// }

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

// 폼값 받기
String num = request.getParameter("num");

PJBoardDTO dto = new PJBoardDTO();
PJBoardDAO dao = new PJBoardDAO(application);
// 본인 확인을 위해 기존 게시물을 인출한다.
dto = dao.selectView(num);

/*
	session영역에 저장된 회원정보를 얻어온 후 String으로 변환한다.
	영역에는 모든 값(객체)를 저장할 수 있도록 Object타입을 사용하므로
	사용시 기존의 값으로 형변환해야 한다.
*/
String sessionId = session.getAttribute("UserId").toString();

int delResult = 0;

// 세션의 아이디와 게시물의 아이디가 일치하면 작성자 본인이므로...
if (sessionId != null && sessionId.equals("admin")) {
	// 게시물을 삭제한다.
	dto.setNum(num);
	delResult = dao.deletePost(dto);
	// 자원 해제
	dao.close();
	
	if (delResult == 1){
		/*
			게시물이 삭제되면 내용보기는 의미가 없으므로 목록(리스트)로
			이동하면 된다.
		*/
		JSFunction.alertLocation("삭제되었습니다.", "MemberBoard.jsp", out);
	}
	else {
		// 실패한 경우는 뒤로 이동한다.
		JSFunction.alertBack("삭제에 실패하였습니다.", out);
	}
}
else{
	// 작성자 본인이 아니면 삭제할 수 없다..
	
	JSFunction.alertBack("본인만 삭제할 수 있습니다.", out);
	return;
}

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
