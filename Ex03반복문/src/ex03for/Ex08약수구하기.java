package ex03for;

import java.util.Scanner;

public class Ex08약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System .in);
		System.out.print("정수 입력: ");
		int j = sc.nextInt();
		int i = 1;
		System.out.print(j + "의 약수 : " );
		for( i=1; i<=j; i++) {
			int resto = j%i;
			if(resto == 0) {
				System.out.print(i + " ");
			}
		}
sc.close();
	}
	
}
