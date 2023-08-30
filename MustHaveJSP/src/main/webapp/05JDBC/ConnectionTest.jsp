<%@page import="common.DBConnPool"%>
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
	<h2>JDBC �׽�Ʈ1</h2>
	<%
	JDBConnect jdbc1 = new JDBConnect();
	jdbc1.close();
	%>
	
	<h2>JDBC �׽�Ʈ2</h2>
	<%
	// application ���尴ü�� ���� ���ؽ�Ʈ �ʱ�ȭ. �Ķ���͸� ���´�.
	String driver = application.getInitParameter("OracleDriver");
	String url = application.getInitParameter("OracleURL");
	String id = application.getInitParameter("OracleId");
	String pwd = application.getInitParameter("OraclePwd");
	// ���� ���� ���� DB������ ���� �����ڸ� ȣ���Ѵ�.
	JDBConnect jdbc2 = new JDBConnect(driver, url, id, pwd);
	jdbc2.close();
	%>
	
	<h2>JDBC �׽�Ʈ3</h2>
	<%
	// JSP���� application���尴ü�� �μ��� �����Ѵ�.
	JDBConnect jdbc3 = new JDBConnect(application);
	jdbc3.close();
	%>
	
	<h2>Ŀ�ؼ� Ǯ �׽�Ʈ</h2>
	<%
	DBConnPool pool = new DBConnPool();
	pool.close();
	%>
</body>
</html>