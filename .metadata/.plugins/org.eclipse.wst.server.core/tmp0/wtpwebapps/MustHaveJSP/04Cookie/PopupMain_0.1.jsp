<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
String popupMode = "on"; // 레이어 팝업창 띄울지 여부를 확인
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>쿠키를 이용한 팝업 관리 ver 0.1</title>
<style>
	/*CSS로 레이어 팝업창의 위치를 지정*/
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
	// 팝업창 닫기 버튼을 누르면 숨김처리 한다.
    $('#closeBtn').click(function() {
		$('#popup').hide();
	});
});
</script>

</head>
<body>
<h2>팝업 메인 페이지</h2>
<%
    for (int i = 1; i <= 10; i++) {
        out.println("현재 팝업창은 " + popupMode + " 상태입니다.<br/>");
    }
    if (popupMode.equals("on")) { // popupMode 값이 on일때만 팝업창 표시
%>
    <div id="popup">
        <h2 align="center">공지사항 팝업입니다.</h2>
        <div align="right"><form name="popFrm">
            <input type="checkbox" id="inactiveToday" value="1" /> <!-- 체크박스 -->
            하루 동안 열지 않음
            <input type="button" value="닫기" id="closeBtn" /> <!-- 닫기 버튼 -->
        </form></div>
    </div>
<%
    }
%>

</body>
</html>