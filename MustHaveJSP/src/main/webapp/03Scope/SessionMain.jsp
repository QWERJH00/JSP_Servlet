<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
/*
	session ���� : Ŭ���̾�Ʈ�� �� �������� ���ʷ� �� �� ���������� ��û�Ǵ�
	��� �������� session������ ������ �� �ִ�.�� ����(Session)�̶� Ŭ���̾�Ʈ��
	������ ������ �ִ� ���� Ȥ�� ������ ���Ѵ�.
*/
ArrayList<String> lists = new ArrayList<String>();
lists.add("����Ʈ");
lists.add("�÷���");
session.setAttribute("lists", lists);
%>
<html>
<head>
<meta charset="EUC-KR">
<title>session ����</title>
</head>
<body>
	<h2>������ �̵� �� session ������ �Ӽ� �б�</h2>
	<a href="SessionLocation.jsp">SessionLocation.jsp �ٷΰ���</a>
</body>
</html>