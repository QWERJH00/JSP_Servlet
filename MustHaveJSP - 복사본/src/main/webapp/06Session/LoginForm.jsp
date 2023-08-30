<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		�׼� �±׸� ���� ���븵ũ�� ����� �������� ��Ŭ����Ͽ� �ش繮����
		���Խ�Ų��.
	 -->
	<jsp:include page = "../Common/Link.jsp" />
	
	<h2>�α��� ������</h2>
	<!-- 
		���׿����ڸ� ���� request������ ����� �Ӽ����� �ִ� ��쿡��
		���� �޼����� ȭ�鿡 ����Ѵ�.
		�ش� �Ӽ����� �α��� ó�� ���������� ȸ�������� DB���� ã�� ���� ���
		request������ �Ӽ����� �����ϰ� �ȴ�.
	 -->
	<span style="color: red; font-size: 1.2em;">
		<%= request.getAttribute("LoginErrMsg") == null ?
			"" : request.getAttribute("LoginErrMsg")%>
	</span>
	<%
	/*
		���ǿ����� UserId��� �Ӽ����� ���� ���, �� �α��� ó���� ���� ����
		���¿����� �α������� ������ ���� JS�� ���������� ����Ѵ�.
	*/
	if (session.getAttribute("UserId") == null){  // �α��� ���� Ȯ��
		
		//�α׾ƿ� ����
		
	%>
	<!-- �α��� ���� �Է°��� �����ϱ� ���� �Լ��� �������� Ȯ���Ѵ�. -->
	<script>
	function validateForm(form) {
		/*
			<form>�±� ������ �� input �±׿� �Է°��� �ִ��� Ȯ���Ͽ� ����
			���̶�� ���â, ��Ŀ�� �̵�, �������� ��� ó���� �Ѵ�.
		*/
		if(!form.user_id.value){
			alert("���̵� �Է��ϼ���.");
			return false;
			
		}
		if(form.user_pw.value == ""){
			alert("�н����带 �Է��ϼ���.");
			return false;
		}
			
	}
	</script>
	<!-- 
		���� ������ ����<form>�±׷� ������ �� URL, ���۹��, ���� �̸�,
		submit�̺�Ʈ �����ʷ� �����Ѵ�. Ư�� ���������� ���� validateForm()
		�Լ� ȣ��� <form>�±��� DOM�� �μ��� �����Ѵ�.
	 -->
	<form action="LoginProcess.jsp" method="post" name="loginFrm"
		onsubmit="return validateForm(this);">
		���̵� : <input type="text" name="user_id" /> <br/>
		�н����� : <input type="password" name="user_pw" /><br/>
		<input type="submit" value="�α����ϱ�" />
	</form>
	<%
	} else{ // �α��� ����
		/*
			session������ ����� �Ӽ����� �ִٸ� �α��ε� �����̹Ƿ� ȸ������
			�� �α׾ƿ� ��ư�� ȭ�鿡 ����Ѵ�.
		*/
	%>
		<%= session.getAttribute("UserName") %> ȸ����,�α����ϼ̽��ϴ�.<br/>
		<a href="Logout.jsp">[�α׾ƿ�]</a>
	<%
	}
	%>
</body>
</html>