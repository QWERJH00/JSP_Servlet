<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" trimDirectiveWhitespaces="true"%>
<%
/*
	trimDirectiveWhitespaces : ���þ� �Ӽ� �� ����� ���ʿ��� ������ �����Ѵ�.
	�ݹ鵥���ʹ� �ش��������� ��µǴ� ��� �ҽ��ڵ带 ��ȯ�ϰ� �Ǵµ�,
	���鵵 �ϳ��� �����̹Ƿ� �ʿ���� ��� �����ϴ� ���� ����.
*/

// �Ϸ絿�� ���� ���� üũ�ڽ��� üũ�� �� �ݱ� ��ư�� ������ ��1�� �Ķ���ͷ�
// ���޵ȴ�.
String chkVal = request.getParameter("inactiveToday");

// �Ķ������ ���� null�� �ƴ� ���ÿ� 1�̶�� ��Ű�� �Ʒ��� ���� �����Ѵ�. 
if (chkVal != null && chkVal.equals("1")){
	// ��Ű�� �����ڸ� ���ؼ��� ������ �� �ִ�. PopupClose��� ��Ű��
	// �����Ѵ�.
	Cookie cookie = new Cookie("PopupClose", "off");
	//��Ű�� ���� ��θ� �����Ѵ�.
	cookie.setPath(request.getContextPath());
	// ��Ű�� �����ð� ����(1��=>86400��)
	cookie.setMaxAge(60*60*24);
	// �����쵢�� ��Ű�� �Ǿ Ŭ���̾�Ʈ�� �����Ѵ�.
	response.addCookie(cookie);
	// �ݹ� �����ͷ� ����Ѵ�.
	out.println("��Ű : �Ϸ絿�� ��������");
}
%>
