<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ��ü - Response</title>
</head>
<body>
<%
// request ���尴ü�� ���� ���۵� ������ �޴´�.name���� ������...
String id = request.getParameter("user_id");
String pwd = request.getParameter("user_pwd");
// ���ڿ��� ���� �ܼ� �񱳷� �α��� ������ Ȯ���Ѵ�.
// ���� ������ ��ġ�Ѵٸ� Welcome�������� �̵��Ѵ�.
if(id.equalsIgnoreCase("must")&& pwd.equalsIgnoreCase("1234")){
	// JS�� location.href�� ��������� ������ ������ �޼���� �μ��� �־���
	// ��η� �̵��ϰ� �ȴ�.
	response.sendRedirect("ResponsWelcome.jsp");
}

else {
	/*
		������ ������ ��� ������������ �������Ѵ�.
		������� ������ �̵����� �ٸ��������� �帧�� �����ϰ��� �Ҷ� ����Ѵ�.
		���������� �ּ��ٿ��� ResponseLogin.jsp�� ���������� ���� ��µǴ�
		������ ResponseMain.jsp�� ��µȴ�.
	*/
	request.getRequestDispatcher("ResponseMain.jsp?loginErr=1")
	.forward(request, response);
}
%>
</body>
</html>