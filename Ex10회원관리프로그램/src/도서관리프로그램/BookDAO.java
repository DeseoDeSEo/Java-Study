package 도서관리프로그램;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {
	public int insert(BookVO vo) {
		//DB에 접근해서 도서등록에 필요한 데이터들을 저장
		int row =0;
		Connection conn = null;
		PreparedStatement psmt = null;
		try {//jdbc 방식: 1)드라이버 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소값
			String db_id = "shopping";
			String db_pw = "12345";
			conn = DriverManager.getConnection(db_url, db_id, db_pw); 
			//2)sql문 준비
			String sql = "insert into book values(?,?,?,?)" ;
			psmt = conn.prepareStatement(sql);
			//?인자 채우기
			psmt.setString(1, vo.getTitle());
			psmt.setString(2,  vo.getName());
			psmt.setInt(3, vo.getPrice());
			psmt.setString(4, vo.getNum());
			
			row =psmt.executeUpdate();//영향을 받은 행이 있는지 결과값
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터 베이스 연결 실패");
			e.printStackTrace();
		}finally {
			try {
				if(psmt != null)
					psmt.close();
				if(conn != null)
					conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}	
			// 3) 결과값처리
	       //  4) 자원반납
		}
		return row;} //데이터 베이스 저장 성공여부결과 처리는 Controller로 보냄.
	
		public ArrayList<BookVO> select() {
			ArrayList<BookVO> bookList = new ArrayList<>();
			Connection con = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;
			try { //동적로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String db_url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소값
				String db_id = "shopping";
				String db_pw = "12345";
				
				con = DriverManager.getConnection(db_url,db_id, db_pw);
				String sql = "Select * from book";
				psmt = con.prepareStatement(sql);
				rs=psmt.executeQuery(); //select 문: 테이블 형태의 데이터를 받아주는 db객체
				System.out.println("title \t  name \t price \t num");
				System.out.println("=================================");
				
				while(rs.next()) {
					String title = rs.getString(1);
					String name = rs.getString(2);
					int price= rs.getInt(3);
					String num = rs.getString(4);
					BookVO vo = new BookVO(title, name, price, num);
					bookList.add(vo);
					
					//System.out.println(title + "\t"+ name + "\t" + price + "\t"+ num);
				}
			} catch( ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			} 
				return bookList; // arraylist타입이고 이걸 컨트롤러로 리턴 시킴.
			}		
		public BookVO selectOne(BookVO vo){
			Connection conn = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;
			
			ArrayList <BookVO> bookList = new ArrayList<>();
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String db_url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소값
				String db_id = "shopping";
				String db_pw = "12345";
				// 권한 가져오기
				conn = DriverManager.getConnection(db_url, db_id, db_pw);
				String sql = "select * from book where title = ?";
				
				
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, vo.getTitle());
				rs= psmt.executeQuery();
				if(rs.next()) { //만약에 해당하는 내용이 있으면 true반환 아니면 false반환
					String title = rs.getString(1);
					String name =rs.getString(2);
					int price = rs.getInt(3);
					String num = rs.getString(4);
					vo = new BookVO(title, name, price, num);
					bookList.add(vo);
			
			} }
				catch(ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				return vo;
			
			
			
			
			
			
			}
			
		}
		
