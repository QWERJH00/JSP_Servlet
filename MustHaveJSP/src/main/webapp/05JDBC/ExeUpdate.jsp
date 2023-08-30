<%@page import="java.sql.PreparedStatement"%>
<%@page import="common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JDBC</title>
</head>
<body>
	<h2>ȸ�� �߰� �׽�Ʈ(executeUpdate()���)</h2>
	<%
	// JDBC�� ���� DB����
	JDBConnect jdbc = new JDBConnect();
	
	// �Է��� ȸ�������� �غ�(�ϵ��ڵ�)
	String id = "text1";
	String pass = "1111";
	String name = "�׽�Ʈ1ȸ��";
	
	// ���Ķ���Ͱ� �ִ� ������������ �غ��Ѵ�.
	String sql = "INSERT INTO member VALUES(?, ?, ?, sysdate)";
	//���������� ������ ���� prepared��ü ����
	PreparedStatement psmt = jdbc.con.prepareStatement(sql);
	// ���Ķ���� ������ �ε����� 1���� �����Ѵ�.
	psmt.setString(1, id);
	psmt.setString(2, pass);
	psmt.setString(3, name);
	
	// �࿡ ��ȭ�� �ִ� update, delete, insert�������� excuteupdate()
	// �޼��带 ���� �����Ѵ�.
	int inResult = psmt.executeUpdate();
	out.println(inResult + "���� �ԷµǾ����ϴ�.");
	
	// �ڿ� ����(��ü�Ҹ�)
	jdbc.close();
	%>
</body>
</html>