<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
String popupMode = "on"; // ���̾� �˾�â ����� ���θ� Ȯ��
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��Ű�� �̿��� �˾� ���� ver 0.1</title>
<style>
	/*CSS�� ���̾� �˾�â�� ��ġ�� ����*/
    div#popup{ 
        position: absolute; top:100px; left:100px; color:yellow;  
        width:300px; height:100px; background-color:gray;
    }
	div#popup>div{
        position: relative; background-color:#ffffff; top:0px;
        border:1px solid gray; padding:10px; color:black;
    }
</style>
<script src="http://code.jquery.com/jquery.js"></script>
<script>
$(function() {
	// �˾�â �ݱ� ��ư�� ������ ����ó�� �Ѵ�.
    $('#closeBtn').click(function() {
		$('#popup').hide();
	});
});
</script>

</head>
<body>
<h2>�˾� ���� ������</h2>
<%
    for (int i = 1; i <= 10; i++) {
        out.println("���� �˾�â�� " + popupMode + " �����Դϴ�.<br/>");
    }
    if (popupMode.equals("on")) { // popupMode ���� on�϶��� �˾�â ǥ��
%>
    <div id="popup">
        <h2 align="center">�������� �˾��Դϴ�.</h2>
        <div align="right"><form name="popFrm">
            <input type="checkbox" id="inactiveToday" value="1" /> <!-- üũ�ڽ� -->
            �Ϸ� ���� ���� ����
            <input type="button" value="�ݱ�" id="closeBtn" /> <!-- �ݱ� ��ư -->
        </form></div>
    </div>
<%
    }
%>

</body>
</html>