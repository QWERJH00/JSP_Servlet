<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Cookie</title>
</head>
<body>
	<!-- 
		��Ű : Ŭ���̾�Ʈ�� ���� ������ �����ϱ� ���� ����� Ŭ���̾�Ʈ��
		PC�� �������·� ����ȴ�. ��Ű�ϳ��� ũ��� 4KB�̰�, 3000������
		���� �� �ִ�.
	 -->
	<h2>1. ��Ű(Cookie) ����</h2>
	<%
	/*
		��Ű�� �����ڸ� ���ؼ��� ������ �� �ִ�. setName()�̶� �޼��尡 �����Ƿ�
		��Ű�� ������ �� ��Ű���� �����ϴ� ���� �Ұ����ϴ�.
	*/
	Cookie cookie = new Cookie("myCookie", "��Ű������"); // ��Ű����
	/*
		��Ű�� ��� ����. ���ؽ�Ʈ��Ʈ ��η� �����ϹǷ� �����ø����̼�
		��ü���� ����� �� �ְ� �ȴ�.
	*/
	cookie.setPath(request.getContextPath()); // ��θ� ���ؽ�Ʈ ��Ʈ�� ����
	cookie.setMaxAge(3600); // �����ð��� 1�ð����� ����
	// ��������� ��Ű�� �߰��Ͽ� Ŭ���̾�Ʈ ������ �����Ѵ�.
	response.addCookie(cookie);  // ��������� ��Ű �߰�
	/*
		��������� �ڵ带 ���� Ŭ���̾�Ʈ ���� ��Ű�� �����ȴ�.
	*/
	%>
	
	<h2>2. ��Ű ���� ���� ��Ű�� Ȯ���ϱ�</h2>
	<%
	/*
		request���尴ü�� getCookies()�� ���� ���� ������ ��� ��Ű��
		�迭�� ���·� �����´�.
	*/
	Cookie[] cookies = request.getCookies(); // ��û ����� ��� ��Ű ���
	// ������ ��Ű�� �ִٸ� ������ŭ �ݺ��Ѵ�.
	if (cookies!=null) {
		// ������ for���� ���� ��Ű�� �о..
		for (Cookie c : cookies) {
			// ��Ű��� ��Ű���� ���������� ����Ѵ�.
			String cookieName = c.getName(); // �̸� ���
			String cookieValue = c.getValue(); // �� ���
			// ȭ�鿡 ���
			out.println(String.format("%s : %s<br/>", cookieName, cookieValue));
		}
	}
	/*
		��Ű�� ������ ���Ŀ��� ��Ű���� ������ ����. Ŭ���̾�Ʈ ���� �ִ�
		��Ű�� ������ �ٽ� �����ϱ� ���� ����¡�̵��� �ϰų� ���ΰ�ħ��
		�Ͽ� ���ο� ��û�� �����߸� ���� �� �ִ�.
	*/
	%>
	<h2>3. ������ �̵� �� ��Ű�� Ȯ���ϱ�</h2>
	<a href="CookieResult.jsp">
	���� ���������� ��Ű�� Ȯ���ϱ�
	</a>
</body>
</html>