<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<%
// �˾�â ���� ���� �Ǵ��� ���� ����
String popupMode = "on"; 

// ��Ű�� �迭�� ���� �� ��� ��Ű�� �д´�.
Cookie[] cookies = request.getCookies();
if (cookies != null) {
    for (Cookie c : cookies) {
        String cookieName = c.getName();
        String cookieValue = c.getValue();
        // ���� ��Ű���� �Ʒ��� ��ġ�Ѵٸ� ��Ű���� �о� ������ �����Ѵ�.
        if (cookieName.equals("PopupClose")) {
            popupMode = cookieValue; 
        }
    }
} 
%>

<title>��Ű�� �̿��� �˾� ����</title>
<style>
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
// jQuery�� ��Ʈ�� ����Ʈ(������)
$(function() {
	// �˾�â �ݱ��ư�� ������ �Ʒ��ڵ带 �����Ѵ�.
	 $('#closeBtn').click(function() {
		 // ���̾� �˾�â�� ����ó���Ѵ�.
			$('#popup').hide();
		 // �Ϸ絿�� ���� ���� üũ�ڽ��� üũ�� ��� value�� ���ͼ�
		 // ������ �����Ѵ�.
			var chkVal = $("input:checkbox[id=inactiveToday]:checked").val();
			// jQuery�� ajax()�Լ��� ���� ��û���� �����Ѵ�.
		 	$.ajax({
		 		// ��û�� ������ URL(���)
				url : './PopupCookie.jsp',
				// ���۹��
				type : 'get',
				// ��û�� ������ �Ķ����. ���⼭�� üũ�ڽ��� ���� �����Ѵ�.
				// �� üũ�� �ߴٸ� 1�� �����ϰ�, �ƴϸ� �ƹ����� �������� �ʴ´�.
				data : {inactiveToday : chkVal},
				// �ݹ鵥������ Ÿ���� text�������� �����Ѵ�.
				dataType : "text",
				// ������ �ڵ�ȣ��� �ݹ��Լ�
				success : function(resData) {
					// �ݹ鵥���ʹ� �Ű����� resData�� �޴´�.
					if(resData){
						console.log('�ִ�');
					}
					else{
						console.log('����');
					}
					// �ݹ鵥���Ͱ� �ִٸ� ȭ���� ���ΰ�ħ�Ѵ�. f5�� �����Ͱ� ����.
					if(resData != '') location.reload();
					
				}
			});
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
// popupMode�� on�� ��쿡�� ���̾� �˾�â�� �����ش�.
    if (popupMode.equals("on")) {
%>
    <div id="popup">
        <h2 align="center">�������� �˾��Դϴ�.</h2>
        <div align="right"><form name="popFrm">
            <input type="checkbox" id="inactiveToday" value="1" />
            �Ϸ� ���� ���� ����
            <input type="button" value="�ݱ�" id="closeBtn" />
        </form></div>
    </div>
<%
    }
%>

</body>
</html>