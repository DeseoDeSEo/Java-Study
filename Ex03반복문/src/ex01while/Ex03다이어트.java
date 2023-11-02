package ex01while;

import java.util.Scanner;

public class Ex03다이어트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int i = 1;
		int total = 0;
		System.out.print("현재몸무게: " );
		int now = sc.nextInt();
		System.out.print("목표몸무게: ");
		int dream = sc.nextInt();
		
		while(true) {		
			System.out.print(i+"주차 감량 몸무게: ");
			int minus = sc.nextInt();
			total = total + minus;
			int diference = now - dream;
			
			if (diference <= total) {
				System.out.println(now-total + "kg 달성!! 축하합니다!");
				break;
			}
			else {
				i++;
			}
		}
	}
}
//