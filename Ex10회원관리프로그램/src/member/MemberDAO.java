package member;  //요리사이고 main이 점원임/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	// DB에 연결 및 사용 하는 것을 담당하는 클래스
	// DAO클래스가 모든 JDBC 기능 수행
	public int join(String id, String pw, String nick) {
//////회원가입
		// 예외처리 필요 : 오타가 있거나 파일이 존재하지 않을 때 클래스를 못찾는 예외사항 발생 -> try , catch!
		// try에 예외사항이 발생할 만한 코드를 작성
		// catch 해당 예외사항이 발생하면 오류를 감지 및 포착
		// 0. 드라이버 파일을 프로젝트 안에 넣어주기

		int cnt = 0;
		Connection conn = null;
		PreparedStatement psmt = null;// try밖에서도 쓰려고 try밖에서 선언함.

		try {
			// 1. 드라이버 설치(동적로딩)
			// 왜 동적로딩인가
			// - 컴파일러는 아래의 코드를 만나기 전까지 어떠한 DBMS에 드라이버를 사용하는지 모르고 아래의 코드를 만나는 순간
			// 해당 드라이버를 찾아서 설치를 한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.커넥션 열기
			// -> DB가 존재하는 URL, DB 아이디, DB비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소값
			String db_id = "shopping";
			String db_pw = "12345";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);

			if (conn != null) {
				System.out.println("DB연결 성공!");
			} else {
				System.out.println("DB연결 실패..");
			}
			// 3.SQL문 실행
			// => SQL문을 실행하기 위해서는 조건이 있다.
			// 1) SQL문장이 이상없는지 검토를 받아야한다.
			String sql = "INSERT INTO MEMBER VALUES(?,?,?)";// 물음표가 1번 물음표,2번,3번..
			psmt = conn.prepareStatement(sql);
			// PreparedStatement psmt = conn.prepareStatement(SQL); //검토요청
			// psmt객체가 sql문을 완성하고 실행할 수 있는 객체이다.
			psmt.setString(1, id); // 첫번째 값을 id로 받겠다.
			psmt.setString(2, pw); // 두번째 값은 string이고 PW로 받겠다.
			psmt.setString(3, nick); // 세번째 값은 string이고 nick으로 받겠다.
			cnt = psmt.executeUpdate(); // 테이블 안에 값이 들어가는 거임.
			// executeUpdate()는 실행한 문장의 개수를 INT형태로 반환.

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) { // 예외처리 한 거임. 하나라도 틀릴 경우에
			e.printStackTrace();
		} finally {
			// try 잘 실행되거나 or 중간에 catch로 넘어가더라도
			// finally에는 마지막에 반드시 넘어온다.
			// 4. 연결 끊기
			// -> 연결을 끊을 때는 역순으로 끊음.
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}//// 회원탈퇴

	public int delete(String id, String pw) {
		int cnt = 0;
		Connection conn = null;
		PreparedStatement psmt = null;
		// Query
		// 1) DB연결
		try {
			// 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소값
			String db_id = "shopping";
			String db_pw = "12345";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			// SQL문 준비
			String sql = "delete from member where id = ? and pw=?";
			psmt = conn.prepareStatement(sql);
			// ? 인자를 채워주자
			psmt.setString(1, id);
			psmt.setString(2, pw);
			// SQL문 실행
			cnt = psmt.executeUpdate();
			// 영향을 받은 행이 있는지 없는지에 대한 결과값
		} catch (ClassNotFoundException | SQLException e) {
			// oracleDriver라는 클래스가 없거나 ----> ojdbc.jar
			// 대소문자
			// id, PW
			System.out.println("데이터 베이스 연결 실패");
			e.printStackTrace();
		} finally {
			// 예외상황이 발생하더라도 꼭 한번은 실행되는 코드들
			// 사용한 적이 있으면 conn, psmt를 close하자
			try {
				if (conn != null) {
					conn.close();
				}
				if (psmt != null) {
					psmt.close();
				}
			} catch (SQLException e) {
				System.out.println("자원 반납 오류");
				e.printStackTrace();
			}
		}
		return cnt;
	}

	public int update(String id, String pw) {
		int cnt =0;
		Connection conn = null;
		PreparedStatement psmt = null;
		// Query
		// Update 테이블명 set 컬럼명 조건문(= 사용자가 입력한 아이디에 해당하는 비밀번호를 변경)
		// 1) DB연결
		try {
			// 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소값
			String db_id = "shopping";
			String db_pw = "12345";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			// SQL문 준비
			String sql = "update member set pw=? where id = ?";
			psmt = conn.prepareStatement(sql);
			// ? 인자를 채워주자
			psmt.setString(1, pw);
			psmt.setString(2, id);
			// SQL문 실행
			cnt = psmt.executeUpdate();
			// 영향을 받은 행이 있는지 없는지에 대한 결과값
		}catch (ClassNotFoundException | SQLException e) {
			// oracleDriver라는 클래스가 없거나 ----> ojdbc.jar
			// 대소문자
			// id, PW
			System.out.println("데이터 베이스 연결 실패");
			e.printStackTrace();
		} finally {
			// 예외상황이 발생하더라도 꼭 한번은 실행되는 코드들
			// 사용한 적이 있으면 conn, psmt를 close하자

			try {
				if (conn != null) {
					conn.close();
				}
				if (psmt != null) {
					psmt.close();
				}
			} catch (SQLException e) {
				System.out.println("자원 반납 오류");
				e.printStackTrace();
			}
		} return cnt;
		


}

	public MemberVO login(String id, String pw) {
		MemberVO info = null;
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소값
			String db_id = "shopping";
			String db_pw = "12345";
			// 권한 가져오기
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			String sql = "select * from member where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			// ResultSet : sql select 문을 실행시 db로부터 리턴되는 테이블 형태를 담는 객체
			rs = psmt.executeQuery();
			// rs.next()는 커서를 한칸씩 이동하면서 데이터 유무에 대한 결과값을 true,false로 받는 메서드
			// : 커서를 한칸 내림과 동시에 값有 -> true, 값無 -> false
			if (rs.next()) {
				String login_id = rs.getString("ID");
				String login_pw = rs.getString("PW");
				String nick = rs.getString("NICK"); // 인덱스1 -> id , 인덱스2-> pw, 인덱스3-> nick
				info = new MemberVO(login_id,login_pw, nick);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// 역순으로 자원 반납
			// ResultSet
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return info;
	} public  void select(){
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소값
			String db_id = "shopping";
			String db_pw = "12345";
			// 권한 가져오기
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			String sql = "select * from member";
			psmt = conn.prepareStatement(sql);
			// ResultSet : sql select 문을 실행시 db로부터 리턴되는 테이블 형태를 담는 객체
			rs = psmt.executeQuery();
			System.out.println("ID  \t  PW  \t nickname");
			System.out.println("==============================");
			// rs.next()는 커서를 한칸씩 이동하면서 데이터 유무에 대한 결과값을 true,false로 받는 메서드
			while (rs.next()) {
				String id = rs.getString(1);// 1번컬럼을 가져오겠다.
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				System.out.println(id + "\t" + pw + "\t" + nick);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// 역순으로 자원 반납
			// ResultSet
			try {
				if (rs != null) // 위의 rs부분에서 오류가 나서 내려온 경우에 실행 되는걸 막기 위해서 (= null point exception )
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// PreparedStatement
		}
	}
	
}
