<%@page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>request ����</title>
</head>
<body>
	<h2>������� ���޵� ������</h2>
	<h4>RequestMain ������ ������Ʈ ���� �Ӽ� �б�</h4>
	<%
	/*
		�� ���������� ������ �� �������̹Ƿ� request������ �����Ǿ�
		�Ʒ� �Ӽ����� �������� ����� �� �ִ�.
	*/
	Person pPerson = (Person)(request.getAttribute("requestPerson"));
	%>
	<ul>
		<!-- �տ��� remove�Ǿ����Ƿ� null�� ��µȴ�. -->
		<li>String ��ü : <%= request.getAttribute("requestString")%></li>
		<li>Person ��ü : <%= pPerson.getName() %>,<%= pPerson.getAge()%></li>
	</ul>
	
	<h4>�Ű������� ���޵� �� ����ϱ�</h4>
	<%
		// �Ķ���ͷ� ���޵Ǵ� ���� ���������� ����� �� �ִ�.
		request.setCharacterEncoding("UTF-8");
		out.println(request.getParameter("paramHan"));
		out.println(request.getParameter("paramEng"));
	%>
</body>
</html>