package ex02do_while;
import java.util.Scanner;
public class Ex03로그인프로그램 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id = "hello";
		String pw = "1234";	
		do {
			System.out.print("아이디를 입력해 주세요 >> ");
			String tryid  = sc.next();
			
			System.out.print("비밀번호를 입력해 주세요 >> ");
		    String trypw = sc.next();
		    if ( tryid.equals(id) && trypw.equals(pw)) {
		    	System.out.println("로그인성공!");
		    	break;
		    }else {
		    System.out.println("아이디와 비밀번호가 잘못되었습니다.");
		    }
		}
	while(true);
		sc.close();
}
}