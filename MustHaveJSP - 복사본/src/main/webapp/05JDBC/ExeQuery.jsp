<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>ȸ�� ��� ���� �׽�Ʈ(excuteQuery()���)</h2>
	<%
	JDBConnect jdbc = new JDBConnect();
	
	// ���Ķ���Ͱ� ���� ���� �������� �ۼ��Ѵ�.
	String sql = "SELECT id, pass, name, regidate FROM member";
	// �������� ������ ���� statement��ü�� �����Ѵ�.
	Statement stmt = jdbc.con.createStatement();
	// �࿡ ������ ���� select�迭�� �������� excuteQuery()�޼��带 ���� ����.
	// �̶� ��ȯŸ���� ResultSet�̴�.
	ResultSet rs = stmt.executeQuery(sql);
	// ��ȯ���� ����� ������ŭ �ݺ��Ͽ� ����Ѵ�.
	while (rs.next()){
		// �� �÷��� ���ٽ� 1���� �����ϴ� �ε����� �÷��� �Ѵ� ����� �� �ִ�.
		String id = rs.getString(1);
		String pw = rs.getString(2);
		String name = rs.getString("name");
		java.sql.Date regidate = rs.getDate("regidate");
		
		out.println(String.format("%s %s %s %s", id, pw, name, regidate) + "<br/>");
	}
	// �ڿ�����
	jdbc.close();
	%>
</body>
</html>