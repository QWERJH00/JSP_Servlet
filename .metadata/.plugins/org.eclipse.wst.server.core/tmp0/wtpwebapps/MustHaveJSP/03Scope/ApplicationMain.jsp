<%@page import="java.util.*"%>
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
	<h2>Application ������ ����</h2>
	<%
	/*
		Application���� : �����ø����̼��� �� �ϳ��� application��ü�� �����ϰ�
		Ŭ���̾�Ʈ�� ��û�ϴ� ��� �������� application��ü�� �����ϰ� �ȴ�.
		�ش� ������ ����� �Ӽ��� �������� �˴ٿ�(����off) �ɶ����� �����ȴ�.
		�� ���������� �ݾҴٰ� ���Ӱ� �����ϴ��� ����� ������ �����ȴ�.
	*/
	// MapĿ���ǿ� 2���� Person��ü�� �����Ѵ�.
	Map<String, Person> maps = new HashMap<>();
	maps.put("actor1", new Person("�̼���",30));
	maps.put("actor2", new Person("�ɼ���",28));
	application.setAttribute("maps", maps);
	%>
	application ������ �Ӽ��� ����Ǿ����ϴ�.
</body>
</html>