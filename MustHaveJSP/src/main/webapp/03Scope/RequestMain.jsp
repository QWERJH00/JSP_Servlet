<%@page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
/*
	request���� : Ŭ���̾�Ʈ�� ��û�� �Ҷ����� ���ο� request���԰�
	�����Ǿ� ���� ��û�� ó���ϴµ� ���Ǵ� ��� JSP��������
	������ �����Ѵ�. �� request������ ����� ������ ������������
	������(Forward)�� ���������� �����ȴ�.
*/
request.setAttribute("requestString", "request ������ ���ڿ�");
request.setAttribute("requestPerson", new Person("���߱�",31));
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>request ������ �Ӽ��� �����ϱ�</h2>
	<%
	// request������ ����Ǿ� �����Ƿ� ���������� �����ȴ�.
		request.removeAttribute("requestString");
	// ���� �Ӽ��̹Ƿ� �������� �ʴ´�. ���� ������ �߻����� �ʴ´�.
		request.removeAttribute("requestInteger");
	%>
	<h2>request ������ �Ӽ��� �б�</h2>
	<%
	// ���� ���������� ����� �����̹Ƿ� ���������� ��µȴ�.
	Person rPerson = (Person)(request.getAttribute("requestPerson"));
	%>
	<ul>
	<!--  �տ��� �����Ǿ����Ƿ� null�� ��µȴ�. -->
		<li>String ��ü : <%= request.getAttribute("requestString")%></li>
		<!-- ���������� ��µȴ�. -->
		<li>Person ��ü : <%= rPerson.getName() %>,<%= rPerson.getAge() %></li>
	</ul>
	<h2>������� ���������� request ���� �Ӽ��� �б�</h2>
	<%
	/*
		������ : ���� �������� ���� ��û�� ���� �������� ������ ����� ���Ѵ�.
		�� �ϳ��� ��û�� �� �̻��� �������� ������ �� �ִ�. ������ ����� ������
		�������� ��� ������ ���ۿ��� �����ǰ�, ������� �������� ���븸 ȭ�鿡
		����ϴ� Ư¡�� ���´�. �� ������� ���� �������� ���� ��û��
		�ٸ� ������������ ������ �� �ֵ��� �����ϴ� ���� ���Ѵ�.
	*/
	request
	.getRequestDispatcher("RequestForward.jsp?paramHan=�ѱ�&paramEng=English")
	.forward(request, response);
	%>
</body>
</html>