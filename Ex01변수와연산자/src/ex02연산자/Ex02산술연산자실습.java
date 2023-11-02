package ex02연산자;

import java.util.Scanner;

public class Ex02산술연산자실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력>> ");
		int num = sc.nextInt();
		System.out.println("결과확인 >> " + num/100 +"00");
		// System.out.println("결과확인 >> " + (num/100 *100));
		//System.out.println("결과확인>> " + num-num%100);
		sc.close();
	}
}
