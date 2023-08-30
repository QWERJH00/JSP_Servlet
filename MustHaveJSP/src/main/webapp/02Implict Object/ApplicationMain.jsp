<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ��ü - application</title>
</head>
<body>
	<h2>web.xml�� ������ ���� �о����</h2>
	<!--  web.xml�� <context-param>���� ������ ���� ���尴ü�� ����
	�о�� �� �ִ�. -->
	�ʱ�ȭ �Ű����� : <%= application.getInitParameter("INIT_PARAM") %>
	
	<!--  
		��Ŭ���������� �츮�� ���� �ۼ��� ������ �������� �ʰ� .metadata
		���丮 ������ ������Ʈ�� ������ ���� ȯ���� ���� ���纻
		������ �����Ѵ�. ���� �Ʒ��� ������ ��δ� .matadata������ ��ΰ�
		��µȴ�.
	 -->
	<h2>������ ������ ��� ������</h2>
	application ���� ��ü : <%= application.getRealPath("/02ImplicitObject") %>
	
	<h2>����ο��� application ���� ��ü ����ϱ�</h2>
	<%!
	/*
		����ο��� ���尴ü�� �ٷ� ����ϴ°� �Ұ����ϴ�.
		���尴ü�� _jspService() �޼��峻���� ������ ���������̹Ƿ�
		�� ���� ������ ����ο��� ����Ϸ��� �Ű������� ���޹޾ƾ� �Ѵ�.
	*/
	public String useImplicitObject(){
		/*
			���1 : getServletContext() �޼��带 ���� ����ο��� 
			application ���尴ü�� ���� �� �ִ�.
		*/
		return this.getServletContext().getRealPath("/02ImplicitObject");
	}
	public String useImplicitObject(ServletContext app) {
		/*
			���2 : ��Ʈ��Ʈ������ �޼��带 ȣ���Ҷ� application ���尴ü��
			�Ű������� �����ؼ� ����Ѵ�.
		*/
		return app.getRealPath("/02ImplicitObject");
	}
	%>
	<ul>
		<li>this ��� : <%= useImplicitObject() %></li>
		<li>���� ��ü�� �μ��� ���� : <%= useImplicitObject(application) %></li>
	</ul>
</body>
</html>