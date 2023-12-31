package pjmember;

import javax.servlet.ServletContext;

import common.JDBConnect;
import membership.PJMemberDTO;

public class PJMemberDAO extends JDBConnect {
	public PJMemberDAO(String drv, String url, String id, String pw) {
		super(drv, url, id, pw);
	}
	// application 내장객체만 매개변수로 전달한 후 DB에 연결한다.
	public PJMemberDAO(ServletContext application) {
		super(application);
	}
	
	/*
	  	사용자가 입력한 아이디,패스워드를 통해 회원테이블을 select한 후
	  	존재하는 정보인 경우 DTO객체에 그 정보를 담아 반환한다.
	*/
	public PJMemberDTO getPJMemberDTO(String uid, String upass) {
		// 로그인을 위한 쿼리문을 실행한 후 회원정보를 저장하기위해 생성
		PJMemberDTO dto = new PJMemberDTO();
		// 로그인을 위해 인파라미터가 있는 동적 쿼리문 작성
		String query = "SELECT * FROM pjmember WHERE id=? AND pass=?";
		
		try {
			// 쿼리문 실행을 위한 prepared객체 생성 및 인파라미터 설정
			psmt = con.prepareStatement(query);
			psmt.setString(1, uid);
			psmt.setString(2, upass);
			// select 쿼리문을 실행한 후 ResultSet으로 반환받는다.
			rs = psmt.executeQuery();
			
			// 반환된 ResultSet객체를 통해 회원정보가 있는지 확인한다.
			if(rs.next()) {
				// 정보가 있다면 DTD객체에 회원정보를 저장한다.
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString(3));
				dto.setRegidate(rs.getString(4));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		// 호출한 지점으로 DTO객체를 반환한다. 
		return dto;
	}
}
