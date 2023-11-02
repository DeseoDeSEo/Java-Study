package ex03for;

import java.util.Scanner;

public class Ex03배수출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		int i= 1;
		for(i=1;i<11;i++) {
			System.out.print(num*i + " "  );
		}
	}
}
