<%@page import="utils.CookieManager"%>
<%@page import="utils.JSFunction"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    // ���۵� ������ �޴´�.
    String user_id = request.getParameter("user_id");
    String user_pw = request.getParameter("user_pw");
    /*
    	üũ�ڽ��� ��� �� �̻��� ���̶�� getParameterValues()�� ����
    	������ �޾ƾ� ������ �׸��� �Ѱ���� getParameter()�Լ��� ����ؼ�
    	���� �� �ִ�.
    */
    String save_check = request.getParameter("save_check");
    // ���̵�, �н������� ��ġ���θ� ���� �α��� ����, ���и� �Ǵ��Ѵ�.
    if("must".equals(user_id) && "1234".equals(user_pw)){
    	// �α��ο� �����ϰ� ...
    	if(save_check != null && save_check.equals("Y")){
    		// ���̵� �����ϱ⿡ üũ�� ����� ��Ű�� �����Ѵ�.
    		// �α����� ���̵� ��ȿ�Ⱓ 1�Ϸ� �����Ѵ�.
    		CookieManager.makeCookie(response, "loginId", user_id, 86400);
    	}
    	else{
    		// üũ���� ���� ��� ��Ű�� �����Ѵ�.
    		CookieManager.deleteCookie(response, "loginId");
    	}
    	
//     	JSFunction.alertLocation("�α��ο� �����߽��ϴ�.", "IdSaveMain.jsp", out);
%>
	<script>
	alert("�α��ο� �����߽��ϴ�.");
	location.href="IdSaveMain.jsp";
	</script>
<%	
    }
    
    else{
//     	JSFunction.alertBack("�α��ο� �����Ͽ����ϴ�.", out);
    	String script = ""
    			+"<script>"
    			+"alert('�α��ν���');"
    			+"history.go(-1);"
    			+"history.back();"
    			+"</script>";
    	out.println(script);
    }
    %>