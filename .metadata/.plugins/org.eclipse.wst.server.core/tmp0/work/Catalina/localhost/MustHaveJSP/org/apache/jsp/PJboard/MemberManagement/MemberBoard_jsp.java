/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-28 09:32:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.PJBoard.MemberManagement;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utils.BoardPage;
import java.util.*;
import pjboard.PJBoardDTO;
import java.util.List;
import java.util.Map;
import pjboard.PJBoardDAO;
import java.net.URLEncoder;

public final class MemberBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("pjboard.PJBoardDAO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("pjboard.PJBoardDTO");
    _jspx_imports_classes.add("utils.BoardPage");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");

// DB연결 및 CRUD작업을 위한 DAO객체를 생성한다.
PJBoardDAO dao = new PJBoardDAO(application);
String boardid = request.getParameter("id");
System.out.println(boardid);
/*
	검색어가 있는 경우 클라이언트가 선택한 필드명과 검색어를 저장할
	Map컬렉션을 생성한다.
*/
Map<String, Object> param = new HashMap<String,Object>();
/*
	검색폼에서 입력한 검색어와 필드명을 파라미터로 받아온다.
	해당 <form>의 전송방식은 get, action속성은 없는 상태이므로
	현재페이지로 폼값이 전송된다.
*/
String searchField = request.getParameter("searchField");
String searchWord = request.getParameter("searchWord");
// 사용자가 입력한 검색어가 있다면...
if (searchWord != null){
	/* Map컬렉션에 컬럼명과 검색어를 추가한다. */
	param.put("searchField", searchField);
	param.put("searchWord", searchWord);
// 	param.put("boardid", boardid);
}

// Map컬렉션을 인수로 게시물의 갯수를 카운트한다.
param.put("boardid",boardid);
int totalCount = dao.selectCount2(param);

// 페이징 기능
// int pageSize = 
// Integer.parseInt(application.getInitParameter("POSTS_PER_PAGE"));
// int blockPage = 
// Integer.parseInt(application.getInitParameter("PAGES_PER_BLOCK"));

// int totalPage = (int)Math.ceil((double)totalCount / pageSize);


// int pageNum = 1; 
// String pageTemp = request.getParameter("pageNum");
// if (pageTemp != null && !pageTemp.equals(""))
// 	pageNum = Integer.parseInt(pageTemp);

// int start = (pageNum - 1) * pageSize + 1;
// int end = pageNum * pageSize;


// param.put("start", start);
// param.put("end", end);
// 목록에 출력할 게시물을 추출하여 반환받는다.
List<PJBoardDTO> boardLists = dao.selectList2(param);
// System.out.println(boardid);

// 자원해제
dao.close();

      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\"> -->\r\n");
      out.write("<style>\r\n");
      out.write("h2 {text-align: center; }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- 공통링크 -->\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Common2/Link.jsp", out, false);
      out.write(" \r\n");
      out.write("\r\n");
      out.write("    <h2>게시판 관리</h2>\r\n");
      out.write("    <!-- 검색 폼 -->\r\n");
      out.write("    <form method=\"get\">  \r\n");
      out.write("    <table class=\"container text-center\" border=\"0\" style=\"width:300px;\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"center\">\r\n");
      out.write("        	<th style=\"width:20%\">\r\n");
      out.write("            <select style=\"width:85px;height:35px;\" name=\"searchField\" size=\"1\" class=\"form-select\" aria-label=\"Default select example\"> \r\n");
      out.write("                <option value=\"title\">제목</option> \r\n");
      out.write("                <option value=\"content\">내용</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            </th>\r\n");
      out.write("            <th style=\"width:60%\">\r\n");
      out.write("            <input class=\"form-control\" list=\"datalistOptions\" id=\"exampleDataList\" placeholder=\"search\" style=\"width:150px;height:35px;\" type=\"text\" name=\"searchWord\" />\r\n");
      out.write("            </th>\r\n");
      out.write("            <th style=\"width:20%\">\r\n");
      out.write("            <input class=\"btn btn-primary\" style=\"width:85px;height:35px;\" type=\"submit\" value=\"검색하기\" />\r\n");
      out.write("        	</th>\r\n");
      out.write("    </tr>   \r\n");
      out.write("    </table>\r\n");
      out.write("    </form>\r\n");
      out.write("    &nbsp;&nbsp;&nbsp;\r\n");
      out.write("    <!-- 게시물 목록 테이블(표) -->\r\n");
      out.write("    <table class=\"table table-striped\" border=\"1\" width=\"90%\">\r\n");
      out.write("        <tr align=\"center\">\r\n");
      out.write("            <th width=\"10%\">번호</th>\r\n");
      out.write("            <th width=\"50%\">제목</th>\r\n");
      out.write("            <th width=\"15%\">작성자</th>\r\n");
      out.write("            <th width=\"10%\">조회수</th>\r\n");
      out.write("            <th width=\"15%\">작성일</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("        <!-- 목록의 내용이 나온다. -->\r\n");

if (boardLists.isEmpty()) {

      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td colspan=\"5\" align=\"center\">\r\n");
      out.write("                등록된 게시물이 없습니다^^*\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");

}
else {
	// 출력할 게시물이 있는 경우에는 확장 for문으로 List컬렉션에
	// 저장된 데이텅의 갯수만큼 반복하여 출력한다.
    int virtualNum = 0; 
	
	int countNum = 0;
	
    for (PJBoardDTO dto : boardLists)
    {
    	// 현재 출력할 게시물의 갯수에 따라 출력번호는 달라지므로 
    	// totalCount를 사용하여 가상번호를 부여한다.
        virtualNum = totalCount--; 

      out.write("\r\n");
      out.write("        <tr align=\"center\">\r\n");
      out.write("        	<!-- 게시물의 가상번호 -->\r\n");
      out.write("            <td>");
      out.print( virtualNum );
      out.write("</td>\r\n");
      out.write("            <!-- 제목 -->  \r\n");
      out.write("            <td align=\"left\"> \r\n");
      out.write("                <a class=\"nav-link active\" aria-current=\"page\"  href=\"View3.jsp?num=");
      out.print( dto.getNum() );
      out.write('"');
      out.write('>');
      out.print( dto.getTitle() );
      out.write("</a> \r\n");
      out.write("</a>\r\n");
      out.write("            </td>\r\n");
      out.write("            <!-- 작성자 아이디 -->\r\n");
      out.write("            <td align=\"center\">");
      out.print( dto.getId() );
      out.write("</td>\r\n");
      out.write("            <!-- 조회수 -->           \r\n");
      out.write("            <td align=\"center\">");
      out.print( dto.getVisitcount() );
      out.write("</td>   \r\n");
      out.write("            <!-- 작성일 -->\r\n");
      out.write("            <td align=\"center\">");
      out.print( dto.getPostdate() );
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<!-- 			[다운로드]</a></td>     -->\r\n");
      out.write("        </tr>\r\n");

    }
}

      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("   \r\n");
      out.write("    <table class=\"table table-borderless\" border=\"0\" width=\"90%\" class=\"btn-group me-2\" role=\"group\" aria-label=\"Second group\">\r\n");
      out.write("        <tr align=\"right\">\r\n");
      out.write("        	<td align=\"right\" style=\"padding-left: 42px;\">\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("        	</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
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
