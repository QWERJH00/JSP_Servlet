<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>session ����</title>
</head>
<body>
	<h2>������ �̵� �� session ������ �Ӽ� �б�</h2>
	<!--  
		��� ����â(��������)�� ���� �� �ش� �������� �ܵ����� �����ϸ�
		NullPointerException�� �߻��ȴ�. ���ǿ����� �� �������� ������
		�Ҹ�ȴ�.
	 -->
	<%
	ArrayList<String> lists = (ArrayList<String>)session.getAttribute("lists");
	for (String str : lists)
		out.print(str + "<br/>");
	%>
</body>
</html>