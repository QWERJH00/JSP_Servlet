<%@page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
/*
	page ���� : �ϳ��� ������������ ������ �����ǰ� ������ �̵�, ������ ��
	������������ ������ �Ҹ�Ǿ� �������� �ʴ´�. �� �ش� ������������ 
	����� �� �ִ� �����̴�. JSP������ ������ �����͸� �����ϴ� ��������
	�޸𸮶�� �����ϸ� �ȴ�.
*/
// ������ ������
pageContext.setAttribute("pageInteger", 1000);
// ���忭 ������
pageContext.setAttribute("pageString", "������ ������ ���ڿ�");
// �Ϲ����� Ŭ������ ���� ������ ��ü
pageContext.setAttribute("pagePerson", new Person("�Ѽ���",99));
/*
	page������ ������ 4���� �������� ��� ������(��ü)�� ������ �� �ִ�.
	Object�� ������� ����ǹǷ� ���� ���� �������� �ش� Ÿ������ ����ȯ
	�ؾ��Ѵ�.
*/
%>
<html>
<head>
<meta charset="EUC-KR">
<title>page ����</title>
</head>
<body>
	<h2>page ������ �Ӽ��� �ϱ�</h2>
	<%
	// ���� �����͸� �������� IntegerŬ������ ���� �ڵ� ��ڽ��Ѵ�.
	int pInteger = (Integer)(pageContext.getAttribute("pageInteger"));
	// ���ڿ� �����ʹ� toString()�� ���� ���ڿ� ���·� ��ȯ�Ѵ�.
	String pString = pageContext.getAttribute("pageString").toString();
	// person�� ���� �����ڰ� ������ Ŭ������ ������ Ÿ������ ����ȯ�Ѵ�.
	Person pPerson = (Person)(pageContext.getAttribute("pagePerson"));
	%>
	<ul>
		<!-- Java�� �⺻Ŭ������ ��� ������ ó������ ��� ������ ����� �� �ִ�. -->
		<li>Integer ��ü : <%= pInteger %></li>
		<li>String ��ü : <%= pString %></li>
		<!-- Person Ŭ������ getter()�� ���� ����Ѵ�. -->
		<li>Person ��ü : <%= pPerson.getName() %>, <%=pPerson.getAge() %></li>
	</ul>
	
	<!-- 
		���þ ���� include�� ���Խ�ų �������� �����ҽ��� �״�� ���� ������
		���Խ�Ų �� �������� �����Ѵ�. ���� ������ �������� ��޵ǹǷ� 
		page������ �״�� �����ȴ�.
		��, include�� �������� ������ ���������� ��µȴ�.
	 -->
	<h2>include�� ���Ͽ��� page ���� �о����</h2>
	<%@ include file = "PageInclude.jsp" %>
	
	<h2>������ �̵� �� page ���� �о����</h2>
	<!-- 
		������ �̵��� ���ο� �������� �������� ��û�ϴ� ���̹Ƿ� page������
		�������� �ʴ´�. ��, �Ʒ��� ��ũ�� ���� �̵��� ������������ �ƹ���
		������ ��µ����ʴ´�.
	 -->
	<a href="PageLocation.jsp">PageLocation.jsp�ٷΰ���</a>
</body>
</html>