package ex01변수;

import java.util.Scanner;

public class Ex06키보드입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int num = sc.nextInt();
		System.out.println("입력한 숫자는 ->"+ num);
		sc.close();

	}

}
