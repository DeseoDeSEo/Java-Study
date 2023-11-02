package ex02do_while;
import java.util.Scanner;
public class Ex02합계와평균 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int num = 0;
		int counting =0;
		do {
			System.out.print("숫자를 입력하세요>> ");
			num = sc.nextInt();
			if(num > 100) {			
				break;	
			}
			 total += num;
			 counting +=1;
		}while(true);
		System.out.println("합계: " + total);
		System.out.println("평균: " +  (double)total/*1.0을 곱하면 double이됨*/ /counting);
		/*51.66666666을 100을 곱해서 int에 담음 그리고 100으로 다시 나누면 51.66으로 자릿수 옮길 수 있음
		 * double temp1 = (double)total/num;
		 * int temp2 = (int)(temp1*100);       
		 * double result = temp2*100.0;         */
         sc.close();
	}

}
