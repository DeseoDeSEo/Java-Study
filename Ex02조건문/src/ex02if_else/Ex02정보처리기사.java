package ex02if_else;
import java.util.Scanner;
public class Ex02정보처리기사 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("DB: ");
		int DB = sc.nextInt();
		
		System.out.print("전자계산기 구조: ");
		int elec = sc.nextInt();
		
		System.out.print("OS: ");
		int os = sc.nextInt();
		
		System.out.print("데이터통신: ");
		int data = sc.nextInt();
		
		System.out.print("소프트웨어 공학: ");
		int soft = sc.nextInt();
		
		// 선생님 boolean isCheck1 = (DB + elec + os + data + soft) > =60;
		//boolean isCheck2 = DB >= 8 && elec >= 8 && os>=8 && data>= 8 && soft>=8
		//if(isCheck1 && isCheck2){
		//    System.out.prinln("합격입니다!");
		//} else {
		//  System.out.println("불합격입니다!");
		
		int total = DB + elec + os+ data+ soft;
		if (DB <8 || elec< 8 || os<8 || data <8 || soft<8 ) {
			System.out.println("불합격입니다!");
		}
		else {
			if (total >=60) {
				System.out.println("합격입니다!");
			}
			else {
			System.out.println("불합격입니다!");
			}
			sc.close();
		}
	}

}
