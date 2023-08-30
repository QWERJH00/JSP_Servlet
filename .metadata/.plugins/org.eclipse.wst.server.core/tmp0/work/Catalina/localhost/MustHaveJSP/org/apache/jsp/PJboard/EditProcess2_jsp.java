/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-24 02:50:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.PJBoard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.oreilly.servlet.MultipartRequest;
import pjboard.PJBoardDAO;
import pjboard.PJBoardDTO;
import utils.JSFunction;

public final class EditProcess2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/PJBoard/./IsLoggedIn.jsp", Long.valueOf(1692768231169L));
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
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("pjboard.PJBoardDTO");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("com.oreilly.servlet.MultipartRequest");
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
      out.write("    ");
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

String saveDirectory = application.getRealPath("/Uploads");
//업로드할 파일의 최대용량제한(1MB)로 지정한다.
int maxPostSize = 1024 * 1000;
//인코딩 방식 지정
String encoding = "UTF-8";
/*
앞에서 준비한 3개의 인수와 request내장객체까지를 이용해서
MultipartRequest객체를 생성한다. 해당객체가 정상적으로 생성되면
파일업로드는 완료된다.
*/
try{
MultipartRequest mr = new MultipartRequest(request, saveDirectory,
										maxPostSize, encoding);

// mr객체를 통해 서버에 저장된 파일명을 가져온다.
String fileName = mr.getFilesystemName("attachedFile");
/*
파일명에서 앞의 .(닷)을 찾아 인덱스를 확인한 후 확장자를 잘라낸다.
확장자는 파일의 용도를 나타내는 부분이므로 중요하다.
파일명에 .(닷)을 여러개 사용할 수 있으므로 끝에서부터 찾는다.
*/
String ext = fileName.substring(fileName.lastIndexOf("."));
// 현재날짜와 시간 및 밀리세컨즈까지 이용해서 파일명으로 사용할 문자열을
// 만든다.
String now = new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
// 확장자와 파일명을 합쳐서 서버에 저장할 파일명을 만들어준다.
String newFileName = now + ext;

File oldFile = new File(saveDirectory + File.separator + fileName);
File newFile = new File(saveDirectory + File.separator + newFileName);
oldFile.renameTo(newFile);

// 수정폼에서 입력한 내용을 파라미터로 받는다.
String num = mr.getParameter("num");
String title = mr.getParameter("title");
String content = mr.getParameter("content");
String ofile = mr.getParameter("ofile");
String sfile = mr.getParameter("sfile");


// DTO객체에 수정할 내용을 셋팅한다.
PJBoardDTO dto = new PJBoardDTO();
dto.setNum(num);
dto.setTitle(title);
dto.setContent(content);
dto.setOfile(ofile);
dto.setSfile(sfile);

// DAO객체 생성을 통해 오라클에 연결한다.
PJBoardDAO dao = new PJBoardDAO(application);
// update 쿼리문을 실행하여 게시물을 수정한다.
int affected = dao.updateEdit(dto);
// 자원해제
dao.close();

if (affected == 1){
	/*
		수정이 완료되었으면 수정된 내용을 확인하기 위해 주로 내용보기
		페이지로 이동한다.
	*/
	response.sendRedirect("View2.jsp?num=" + dto.getNum());
}
else {
	// 수정에 실패하면 뒤로 이동한다.
	JSFunction.alertBack("수정하기에 실패하였습니다.", out);
}
}catch(Exception e){
	e.printStackTrace();
	System.out.println("수정 예외발생");
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
