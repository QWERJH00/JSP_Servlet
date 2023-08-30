/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-24 08:22:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.PJBoard.NoBoard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import noticeboard.NoBoardDAO;
import noticeboard.NoBoardDTO;
import java.net.URLEncoder;

public final class View2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("noticeboard.NoBoardDTO");
    _jspx_imports_classes.add("noticeboard.NoBoardDAO");
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
	목록에서 제목을 클릭하면 게시물의 일련번호를 ?num=99 와 같이 받아온다.
	따라서 내용보기를 위해 해당 파라미터를 받아온다.
*/
String num = request.getParameter("num"); 
// DAO 객체 생성을 통해 오라클에 연결한다.
NoBoardDAO dao = new NoBoardDAO(application);
// 게시물 조회수 증가
dao.updateVisitCount(num);
// 게시물의 내용을 인출하여 DTO로 반환받는다.
NoBoardDTO dto = dao.selectView(num);
//자원해제
dao.close();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>회원제 게시판</title>\r\n");
      out.write("<script>\r\n");
      out.write("// 게시물 삭제를 위한 JS 함수\r\n");
      out.write("function deletePost() {\r\n");
      out.write("	// confirm()함수는 대화창에서 \"예\"를 누를 때 true가 반환딘다.\r\n");
      out.write("    var confirmed = confirm(\"정말로 삭제하겠습니까?\"); \r\n");
      out.write("    if (confirmed) {\r\n");
      out.write("    	// <form>의 name속성을 통해 DOM을 가져온다.\r\n");
      out.write("        var form = document.writeFrm;\r\n");
      out.write("    	// 전송방식과 폼값을 전송할 URL을 설정한다.\r\n");
      out.write("        form.method = \"post\"; \r\n");
      out.write("        form.action = \"DeleteProcess2.jsp\"; \r\n");
      out.write("        // submit() 함수를 통해 폼값을 전송한다.\r\n");
      out.write("        form.submit();         \r\n");
      out.write("        // <form>태그 하위의 hidden박스에 설정된 일련번호가 전송된다.\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Common2/Link.jsp", out, false);
      out.write("\r\n");
      out.write("	<h2>회원제 게시판 - 상세 보기(View)</h2>\r\n");
      out.write("	<form name=\"writeFrm\">\r\n");
      out.write("	<!-- \r\n");
      out.write("		게시물 삭제를 위해 hidden타입의 input상자를 하나 추가한다.\r\n");
      out.write("		삭제 버튼 클릭시 서버로 전송할 예정이다.\r\n");
      out.write("	 -->\r\n");
      out.write("	<input type=\"h-idden\" name=\"num\" value=\"");
      out.print( num );
      out.write("\" />  \r\n");
      out.write("	    <table border=\"1\" width=\"90%\">\r\n");
      out.write("	        <tr>\r\n");
      out.write("	            <td>번호</td>\r\n");
      out.write("	            <td>");
      out.print( dto.getNum() );
      out.write("</td>\r\n");
      out.write("	            <td>작성자</td>\r\n");
      out.write("	            <td>");
      out.print( dto.getId() );
      out.write("</td>\r\n");
      out.write("	            \r\n");
      out.write("	        </tr>\r\n");
      out.write("	        <tr>\r\n");
      out.write("	            <td>작성일</td>\r\n");
      out.write("	            <td>");
      out.print( dto.getPostdate() );
      out.write("</td>\r\n");
      out.write("	            <td>조회수</td>\r\n");
      out.write("	            <td>");
      out.print( dto.getVisitcount() );
      out.write("</td>\r\n");
      out.write("	        </tr>\r\n");
      out.write("	        <tr>\r\n");
      out.write("	            <td>제목</td>\r\n");
      out.write("	            <td>");
      out.print( dto.getTitle() );
      out.write("</td>\r\n");
      out.write("	            <td>다운로드 수</td>\r\n");
      out.write("	            <td>");
      out.print( dto.getDowncount());
      out.write("</td>\r\n");
      out.write("	        </tr>\r\n");
      out.write("	        <tr>\r\n");
      out.write("	            <td>내용</td>\r\n");
      out.write("	            <td colspan=\"3\" height=\"100\">\r\n");
      out.write("	            <!-- \r\n");
      out.write("	            	입력시 줄바꿈을 위한 엔터는 \\r\\n으로 입력된다.\r\n");
      out.write("	            	따라서 웹브라우저에 출력시에는 <br> 테그로 \r\n");
      out.write("	            	변경해야 한다.\r\n");
      out.write("	             -->\r\n");
      out.write("	                ");
      out.print( dto.getContent().replace("\r\n", "<br/>") );
      out.write("\r\n");
      out.write("	                <img src=\"./Uploads/");
      out.print( dto.getSfile());
      out.write("\" width=\"100\" />\r\n");
      out.write("	            </td> \r\n");
      out.write("	        </tr>\r\n");
      out.write("	        <tr>\r\n");
      out.write("	        	<td>첨부파일</td>\r\n");
      out.write("	        	<td><a href=\"Download2.jsp?oName=");
      out.print( URLEncoder.encode(dto.getOfile(),"UTF-8") );
      out.write("&sName=");
      out.print( URLEncoder.encode(dto.getSfile(),"UTF-8") );
      out.write("\">[다운로드]</a></td>\r\n");
      out.write("	        </tr>\r\n");
      out.write("	        <tr>\r\n");
      out.write("	            <td colspan=\"4\" align=\"center\">\r\n");
      out.write("					");

					/*
						로그인이 된 상태에서, 세션영역에 저장된 아이디가 해당 
						게시물을 작성한 아이디와 일치하면 수정, 삭제 버튼을 
						보이게 처리한다. 즉, 작성자 본인이 해당 게시물을 조회
						했을때만 수정, 삭제 버튼이 보이게 처리한다.
					*/
					if (session.getAttribute("UserId") != null 
						&& session.getAttribute("UserId").toString().equals(dto.getId()))
					{
					
      out.write("\r\n");
      out.write("						<button type=\"button\"\r\n");
      out.write("						        onclick=\"location.href='Edit2.jsp?num=");
      out.print( dto.getNum() );
      out.write("';\">\r\n");
      out.write("						    수정하기</button>\r\n");
      out.write("						<button type=\"button\" onclick=\"deletePost();\">삭제하기</button> \r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("	                <button type=\"button\" onclick=\"location.href='AdList.jsp';\">\r\n");
      out.write("	                    목록 보기\r\n");
      out.write("	                </button>\r\n");
      out.write("	            </td>\r\n");
      out.write("	        </tr>\r\n");
      out.write("	    </table>\r\n");
      out.write("	</form>\r\n");
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
