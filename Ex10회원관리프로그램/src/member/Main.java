package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	// DAO클래스 안에 있는 메소드를 사용하기 위해 객체생성 (DAO -> 프론트엔드)

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		// CRUD -> 어떠한 프로그램이든 기본적으로 존재해야하는 기능들
		while (true) {
			System.out.print("1.회원가입 2. 로그인 3.회원목록 4. 회원정보수정 5.회원탈퇴");
			int menu = sc.nextInt();
//////////////회원가입 
			if (menu == 1) {
				System.out.println("=======회원가입======");
				// 아이디,비밀번호, 닉네임
				System.out.print("아이디입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력: ");
				String pw = sc.next();
				System.out.print("닉네임 입력: ");
				String nick = sc.next();

				int cnt = dao.join(id, pw, nick);
				if (cnt > 0) {// **실행되었다*/
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패..");
				}
			} else if (menu == 2) {
				// 로그인
//사용자한테 ID랑 PW입력받아서 테이블에 해당 데이터 있으면 "닉네임님 로그인성공"
				System.out.print("아이디입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력: ");
				String pw = sc.next();
				
				MemberVO info = dao.login(id,pw); //1번의 리턴으로 3개를 가져올 수 있음
				//로그인 성공실패 판단
				if(info != null) {
					System.out.println(info.getNick()+"님 환영합니다!");
				} else {
					System.out.println("로그인 실패..");
				}
			}
			// PreparedStatement
			else if (menu == 3) {
				// 회원 목록
				dao.select();
			
			} else if (menu == 4) {
				// 회원정보수정
				// 사용자로부터 아이디를 입력받아서 비밀번호를 바꾼다.
				System.out.println("비밀번호를 바꾸고 싶은 아이디 입력 >> ");
				String id = sc.next();
				System.out.println("변경할 비밀번호 입력>> ");
				String pw = sc.next();
				
				int cnt = dao.update(id,pw);
				
				if (cnt > 0) {
					System.out.println("비밀번호 변경 성공");
				} else {
					System.out.println("비밀번호 변경 실패");
				}
			
			} else if (menu == 5) {
				// ID, PW 입력 받아 id,pw 있으면 테이블에서 정보가 사라짐
				System.out.print("회원탈퇴 id >>");
				String id = sc.next();
				System.out.print("회원탈퇴 비밀번호>> ");
				String pw = sc.next();
				// 회원 탈퇴 완료!
				int cnt = dao.delete(id,pw);
				
				if (cnt > 0) {
					System.out.println("탈퇴 성공");
				} else {
					System.out.println("탈퇴 실패");
				}
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}

		}
	}
}
// JDBC순서
// 1) 드라이버 설치 (동적로딩)
// 2) 커넥션 열기(연결)
// 3) SQL 문장 실행
// 4) 종료(연결끊기)

//1))Query문(sql) 전송
//2)) SQL문장 준비하기
//3)) sql문을 보내주기
// + ? 인자가 있다면 채워주기
// executeUpdate() : db에 만든 테이블에 영향을 받은적이 있는지 없는지 
// (insert , update , delete만 사용가능.)
// executeQuery():
// 4)) executeUpdate를 통해 받아온 결과값 처리
//5))닫기!




// M : DB에 내용을 저장, 가져옴
// Controler : 사용자가 입력한 내용을 받아서 dao로 보냄
// View : 사용자가 입력, 사용자가 보는것