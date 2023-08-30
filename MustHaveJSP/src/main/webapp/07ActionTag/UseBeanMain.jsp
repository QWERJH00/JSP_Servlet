<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>useBean �׼� �±�</h2>
	<h3>�ڹٺ��� �����ϱ�</h3>
	<%--
		useBean�׼��±׸� JSP�� ǥ���ϸ� ������ ����.
		import = "common.Person";
		Person person = new Person(); ��ü����
		request.setAttribute("person",person);
	 --%>
	 <!-- 
	 	id="�����̸�(����������)" class="��Ű���� ������ Ŭ������"
	 	scope="������ ������"
	  -->
	<jsp:useBean id="person" class="common.Person" scope="request" />
	
	<h3>setProperty �׼� �±׷� �ڹٺ��� �Ӽ� �����ϱ�</h3>
	<!-- DTO��ü�� setter() �޼��带 �̿��ؼ� ���� �����Ѵ�. -->
	<!-- 
		JSP�� ǥ���ϸ�
		person.setName("�Ӳ���");
		person.setAge(41); �� ���� ���� �����Ѵ�.
	 -->
	<jsp:setProperty name="person" property="name" value="�Ӳ���" />
	<jsp:setProperty name="person" property="age" value="41" />
	
	<h3>getProperty �׼� �±׷� �ڹٺ��� �Ӽ� �б�</h3>
	<!-- DTO��ü�� getter()�� ���� ���� ����Ѵ�. -->
	<!-- 
		person.getName();
		person.getAge(); �� ���� ���� ��µȴ�.
	 -->
	<ul>
		<li>�̸� : <jsp:getProperty name="person" property="name" /></li>
		<li>���� : <jsp:getProperty name="person" property="age" /></li>
	</ul>
</body>
</html>