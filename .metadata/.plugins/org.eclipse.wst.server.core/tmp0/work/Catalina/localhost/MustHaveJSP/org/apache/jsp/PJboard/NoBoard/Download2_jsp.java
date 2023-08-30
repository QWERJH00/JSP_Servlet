/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-24 08:12:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.PJBoard.NoBoard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utils.JSFunction;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.InputStream;

public final class Download2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.io.OutputStream");
    _jspx_imports_classes.add("java.io.FileInputStream");
    _jspx_imports_classes.add("java.io.FileNotFoundException");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.io.InputStream");
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

//파일이 저장된 디렉토리의 물리적경로를 얻어온다.
String saveDirectory = application.getRealPath("/Uploads");
//서버에 저장된 파일명과 원본파일명을 파라미터로 받아온다.
String saveFilename = request.getParameter("sName");
String originalFilename = request.getParameter("oName");

try {
    //물리적경로와 파일명을 통해 File객체 생성
    File file = new File(saveDirectory, saveFilename);
    //파일의 내용을 읽어오기 위한 입력스트림 생성
    InputStream inStream = new FileInputStream(file);
    
    //사용자의 웹브라우저 종류를 알아내기 위해 요청헤더를 얻어온다.
    String client = request.getHeader("User-Agent");
    if (client.indexOf("WOW64") == -1) {
    	//인터넷 익스플로러가 아닌경우 한글파일명 인코딩
        originalFilename = new String(originalFilename.getBytes("UTF-8"), "ISO-8859-1");
    }
    else {
    	//인터넷 익스플로러 일때 한글파일명 인코딩
        originalFilename = new String(originalFilename.getBytes("KSC5601"), "ISO-8859-1");
    }
    /*
    	위 처리를 통해 원본파일명이 한글인 경우 깨짐을 방지할수 있다. 
    	getBytes() : String객체를 byte형의 배열로 반환해준다. 
    */
   
    /*
    파일 다운로드를 위한 응답 헤더 설정
    1. 응답헤더 초기화
    2. 웹브라우저가 인식하지 못하는 컨텐츠 타입을 설정하여 다운로드 창을
    	강제로 띄우게 함.
    3. 파일명을 변경하기 위한 응답헤더를 설정하고 파일사이즈도 설정한다. 
    */
    response.reset();
    response.setContentType("application/octet-stream");
    response.setHeader("Content-Disposition", 
                       "attachment; filename=\"" + originalFilename + "\"");
    response.setHeader("Content-Length", "" + file.length() );
       
    //새로운 출력스트림을 생성하기 위해 초기화
    out.clear();  
    //새로운 출력스트림을 생성해서 파일을 내보낸다.
    OutputStream outStream = response.getOutputStream();  
    byte b[] = new byte[(int)file.length()];
    int readBuffer = 0;    
    while ( (readBuffer = inStream.read(b)) > 0 ) {
        outStream.write(b, 0, readBuffer);
    }
	//입출력 스트림을 닫아준다.(자원해제)
    inStream.close(); 
    outStream.close();
}
catch (FileNotFoundException e) {
    JSFunction.alertBack("파일을 찾을 수 없습니다.", out);
}
catch (Exception e) {
    JSFunction.alertBack("예외가 발생하였습니다.", out);
}

      out.write('\r');
      out.write('\n');
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
