<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title></title>
</head>
<body>
	<%
	// out ��ü�� ���� print()�޼��带 ȣ���ϸ� �μ��� ���޵� ������
	// �ζ������ ��� ��µ����� �ʰ� ���ۿ� ����ȴ�.
	
	// ���۳��� �����ϱ�
	out.print("��µ��� �ʴ� �ؽ�Ʈ"); // ���ۿ� ����
	// ���ۿ� ����� ������ �����Ѵ�. �׷��� �ش� ������ ��µ��� �ʴ´�.
	out.clearBuffer(); // ���۸� ���(������ ��� ��� �����)
	
	out.print("<h2>out ���� ��ü</h2>");
	// ����ũ�� ���� Ȯ��
	out.print("��� ������ ũ�� : " + out.getBufferSize() + "<br>");
	out.print("���� ������ ũ�� : " + out.getRemaining() + "<br>");
	
	// ���ۿ� ����� ������ �÷���(���) �Ѵ�.
	out.flush();  // ���� ���� ���
	// ������ ��� ������ ��µǹǷ� ũ��� ���󺹱� �ȴ�.
	out.print("flush �� ������ ũ�� : " + out.getRemaining() + "<br>");
	
	// Ÿ�Կ� ������� �پ��� ���� ����� �� �ֵ��� �����ε� �Ǿ��ִ�.
	out.print(1);
	out.print(false);
	out.print('��');
	/*
		print()�� println()�� ���̴� ��°��ڿ� \n�ϳ��� �߰��ϴ� �����̴�.
		�������������� �ٹٲ��� ���� <br>�±װ� �ʿ��ϹǷ� �θ޼�����
		���̴� �����̽� ��ĭ�� ���� �����̴�.
	*/
	
	%>
	
</body>
</html>