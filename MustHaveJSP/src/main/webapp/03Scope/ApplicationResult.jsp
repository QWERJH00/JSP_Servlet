<%@page import="java.util.Set"%>
<%@page import="common.Person"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Application ����</title>
</head>
<body>
	<h2>Application ������ �Ӽ� �б�</h2>
	<%
	// Object�� ����� �Ӽ����� MapŸ������ ����ȯ�Ѵ�.
	Map<String, Person> maps
		= (Map<String, Person>)application.getAttribute("maps");
	/*
		Map�÷����� key�� ���� value�� �����ϹǷ� �ݺ����� key�� ����
		���;� �Ѵ�. keySet()�� ���� ���� key�� ����� ���� �ݺ��ϰ�
		get()�� ���� value�� ���� ����Ѵ�.
	*/
	Set<String> keys = maps.keySet();
	for (String key : keys) {
		Person person = maps.get(key);
		out.print(String.format("�̸� : %s, ���� : %d<br/>",
				person.getName(), person.getAge()));
	}
	%>
</body>
</html>