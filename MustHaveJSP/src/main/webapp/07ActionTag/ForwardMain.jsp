<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
pageContext.setAttribute("pAttr", "������");
request.setAttribute("rAttr", "���");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>sendRedirect�� ���� ������ �̵�</h3>
	<!-- 
		������ �̵��� ��� ���ο� �������� ���� ��û�� �߻��ϰ� �ǹǷ�
		������ ���� �ٸ� �������� �ǹ��Ѵ�. ���� page����, request����
		��� �������� �ʴ´�. 
	 -->
	 
<%-- 	 <% --%>
<!-- // 	 	response.sendRedirect("ForwardSub.jsp"); -->
<%-- 	 %> --%>
	 
	 <!-- 
	 		������� ������������ request������ �����ȴ�. �ּ�ǥ���ٿ��� ����
	 		��û�� �������� ��ΰ� ���������� ����ڴ� ������� �������� ������
	 		���Եȴ�. �� �ϳ��� ��û�� �ΰ��� �������� �����ϴ� �����̴�.
	  -->
	 <h2>�׼� �ױ׸� �̿��� ������</h2>
	
	<jsp:forward page = "/07ActionTag/ForwardSub.jsp" />
	<%
	/*
		�׼� �ױ׸� ����ϸ� JSP�ڵ庸�� �ξ� �����ϰ� �ڵ带 ǥ���� �� �ִ�.
	*/
		request.getRequestDispatcher("ForwardSub.jsp").forward(request, response);
	%>
</body>
</html>