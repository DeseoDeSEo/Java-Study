package ex02연산자;

import java.util.Scanner;

public class Ex10삼항연산자농구공분리 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("농구공의 개수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		String result = count%2 == 0 ? "필요한 상자의 수 : " + count/5 :"필요한 상자의 수" + count/5 + 1 ; 
		System.out.println(result);
		sc.close();

	}

}
