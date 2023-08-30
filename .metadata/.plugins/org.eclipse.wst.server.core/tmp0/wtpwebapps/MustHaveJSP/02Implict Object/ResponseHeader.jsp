<%@page import="java.util.Collection"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
/*
	get������� ���۵� ������ ��¥������ ���� Ÿ�ӽ������� �����Ѵ�.
	getTime() : ��¥�� 1970����� ���ݱ����� �귯�� �ð��� �ʴ����� ��ȯ�ؼ�
	��ȯ���ش�.
	
	��������� ��¥�� �����ϴ� ��� ���ѹα��� ����ǥ�ؽ� + 09 �� 9�ð���
	�����Ƿ� 9�ð��� ������� �������� ���ڰ� ��µȴ�. ���� 9�� ������
	�ð����� �����Ǹ� ������¥�� ��µȴ�.
*/
SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm");
long add_date = s.parse(request.getParameter("add_date")).getTime();
System.out.println("add_date="+add_date);
// ������������ ���۵� ���� ������ ��ȯ�Ѵ�.
int add_int = Integer.parseInt(request.getParameter("add_int"));
// �������� �״�� ����ϸ� �ȴ�. ������ ���۵� �Ķ���ʹ� ��� String
// Ÿ�����θ� ���� �� �ִ�.
String add_str = request.getParameter("add_str");


/*
	addDateHeader(�����, longŸ���� Ÿ�ӽ�����) : ��������� ��¥������
	�߰��ϴ� ��� longŸ���� Ÿ�ӽ������� ��ȯ�� �� �߰��ؾ� �Ѵ�.
*/
// ��¥������ ������� �߰�
response.addDateHeader("myBirthday", add_date);
// ���������� ������� �߰�(������ ��������� 2���� �߰���)
response.addIntHeader("myNumber", add_int);
response.addIntHeader("myNumber", 1004);
// ���ڿ������� ������� �߰�
response.addHeader("myName", add_str);
// ������ ��������� '���߱�'���� �����Ѵ�.  
response.setHeader("myName", "���߱�");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>���� ��� ���� ����ϱ�</h2>
	<%
	// getHeaderNames()�� ���� ��������� ��ü�� ���´�.
	Collection<String> headerNames = response.getHeaderNames();
	// Ȯ�� for������ �ݺ��Ѵ�.
	for (String hName : headerNames){
		// ������� ���� ������� ���ͼ� ����Ѵ�.
		String hValue = response.getHeader(hName);
	%>
		<li><%= hName %> : <%= hValue %></li>
	<%
	}
	
	%>
	<%
	/*
		ù��° ��°������ myNumber��� ������� 2�� ��µǴµ� �̶�
		������ �� 8282�� ��µȴ�. �̰��� getHeader() �޼����� Ư������
		ó�� �Է��� ������� ����ϰ� �ȴ�.
	*/
	%>
	<h2>myNumber�� ����ϱ�</h2>
	<%
	/*
		myNumber��� ��������� 2���� ���� �߰������Ƿ� �Ʒ������� ������
		���� ���������� ��µȴ�. �� add�迭�� �޼���� ������� �����ϰ�
		����ϴ��� ������� ���������� ��µȴ�.
	*/
	Collection<String> myNumber = response.getHeaders("myNumber");
	for (String myNum : myNumber) {
	%>
		<li>myNumber : <%= myNum %></li>
	<%
	}
	/*
		��ó�� ����������� �����ڰ� ���ϴ� ���� �߰��� �� �����Ƿ� ���α׷���
		�������� ���·� ������ �� �ִ�.
	*/
	%>
</body>
</html>