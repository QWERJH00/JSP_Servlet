<%@page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>�̵� �� page ������ �Ӽ��� �б�</h2>
    <%
    /*
    	pageContextMain.jsp���� page������ ����� �Ӽ������� �̵��� ����������
    	������ ��� �����Ͱ� �Ҹ�ǹǷ� �Ʒ������� null���� ��µȴ�. 
    */
    Object pInteger = pageContext.getAttribute("pageInteger");
    Object pString = pageContext.getAttribute("pageString");
    Object pPerson = pageContext.getAttribute("pagePerson"); 
    %>
    <ul>
        <li>Integer ��ü : <%= (pInteger == null) ? "�� ����" : pInteger %></li>
        <li>String ��ü : <%= (pString == null) ? "�� ����" : pString %></li>
        <li>Person ��ü : <%= (pPerson == null) ? "�� ����" : ((Person)pPerson).getName() %></li>
    </ul>
	
</body>
</html>