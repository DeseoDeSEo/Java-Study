package 일차원배열;
import java.util.Scanner;
public class ex07배열예제 {
	public static void main(String[] args) {
		// 별 출력
		Scanner sc = new Scanner(System.in);
		int star [] = new int[5];
		for(int i = 0 ; i < star.length; i ++) {
			System.out.print((i+1)+ "번째 별의 개수를 입력 >> ");
			star[i] = sc.nextInt();
		} 
		for(int i = 0; i< 5; i ++) {
			System.out.print(star[i] + " : " );
			for(int i1 = 0; i1<star[i];i1++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}