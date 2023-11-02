package 일차원배열;
import java.util.Scanner;
public class ex08배열예제 {
	public static void main(String[] args) {
		// 채점하기
		Scanner sc =new Scanner(System.in);
		int[] answer = {1,4,3,2,1};
		int num [] = new int[5];
		int sum =0;
		System.out.println("==채점하기==");
	    System.out.println("답을 입력하세요.");
	    
		for(int i=0; i< 5; i++) {
		    System.out.print((i+1) +"번답 >> ");
			num[i] = sc.nextInt();}
		System.out.println("정답확인 ");
		for( int i=0; i<5; i++) {
			if ( answer[i] != num[i]) {
				System.out.print("X ");
				sum = sum +0;}
			else {
				System.out.print("O ");
				sum = sum +20;}		
			}System.out.print(" 총점: " + sum);
		}
	}
