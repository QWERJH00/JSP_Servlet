<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>외부파일1</h2>
	<%
	String newVar1 = "고구려 세운 동명왕";
	%>
	<ul>
		<!-- 2개의 영역의 속성값을 읽어서 출력한다. -->
		<li>page 영역 속성 : <%=pageContext.getAttribute("pAttr") %></li>
		<li>request 영역 속성 : <%=request.getAttribute("rAttr") %></li>
	</ul>
</body>
</html>