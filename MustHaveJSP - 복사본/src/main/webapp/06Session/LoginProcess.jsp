<%@page import="membership.MemberDTO"%>
<%@page import="membership.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<%
// �α��� ������ �Է��� ���̵�, �н����带 �޴´�.
String userId = request.getParameter("user_id");
String userPwd = request.getParameter("user_pw");

// web.xml�� �Է��� ���ؽ�Ʈ �ʱ�ȭ �Ķ���͸� �о�´�.
// �ش� ������ ����Ŭ�� �����ϱ� ���� ������ �����Ǿ� �ִ�.
String oracleDriver = application.getInitParameter("OracleDriver");
String oracleURL = application.getInitParameter("OracleURL");
String oracleId = application.getInitParameter("OracleId");
String oraclePwd = application.getInitParameter("OraclePwd");

// �� ������ ���� DAO��ü�� �����ϰ� �̶� ����Ŭ�� ����ȴ�.
MemberDAO dao = new MemberDAO(oracleDriver, oracleURL, oracleId, oraclePwd);
// �������� ���� ���̵�, �н����带 �μ��� �����Ͽ� �α���ó���� ���� ������
// �����Ѵ�.
MemberDTO memberDTO = dao.getMemberDTO(userId, userPwd);
// �ڿ� ����
dao.close();

if(memberDTO.getId() != null){
	// �α��ο� ������ �����...
	// ���� ������ ȸ�����̵�� �̸��� �����Ѵ�.
	session.setAttribute("UserId", memberDTO.getId());
	session.setAttribute("UserName", memberDTO.getName());
	// �α����������� �̵��Ѵ�.
	response.sendRedirect("LoginForm.jsp");
}
else {
	// �α��ο� ������ �����...
	// ������Ʈ������ �����޼����� �����Ѵ�.
	request.setAttribute("LoginErrMsg", "�α��� �����Դϴ�.");
	// �׸��� �α����������� '������'�Ѵ�. 
	request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
}
%>
<title>Insert title here</title>
</head>
<body>

</body>
</html>