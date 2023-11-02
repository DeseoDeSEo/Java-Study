package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex01Select {
	public static void main(String[] args) {
  //  데이터 베이스 동적로딩
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소값
			String db_id = "shopping";
			String db_pw = "12345";
			//권한 가져오기
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			String sql = "select *from member";
			psmt =conn.prepareStatement(sql);
			//ResultSet : sql select 문을 실행시 db로부터 리턴되는 테이블 형태를 담는 객체
			rs =psmt.executeQuery();
			//rs.next()는 커서를 한칸씩 이동하면서 데이터 유무에 대한 결과값을 true,false로 받는 메서드
			while(rs.next()) {
				String id = rs.getString(1);// 1번컬럼을 가져오겠다.
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				System.out.println(id + "\t" + pw + "\t" + nick);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			//역순으로 자원 반납
			//ResultSet
			try {
				if(rs!= null)
					rs.close();
				if(psmt != null)
					psmt.close();
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//PreparedStatement
		}

	}

}
