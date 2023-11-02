package ex04switch;

import java.util.Scanner;

public class Ex01switch {

	public static void main(String[] args) {
		// switch를 활용한 메뉴 선택
		//1.햄버거 2.짜장면 3.제육볶음 4.초밥
		Scanner sc = new Scanner(System.in);
		System.out.println("===========점심메뉴 추천===========");
		System.out.print("1.햄버거 2.짜장면 3.제육볶음 4.초밥>>");
		int menu = sc.nextInt();
		switch(menu){
		case 1:
			System.out.println("동명동 본투비버거를 추천해드릴게요");
			
		case 2:
			System.out.println("열도지 짜장면을 추천해드릴게요");
			
		case 3:
			System.out.println("수라간 제육볶음을 추천해드립니다");
			
		case 4:
			System.out.println("공초밥을 추천해드립니다");
			break;
		default: //범위 밖
			System.out.println("정확한 숫자를 입력해주세요.");
			break;
		
		}
		sc.close();

	}

}
