package ex01while;

public class Ex02홀수만출력 {

	public static void main(String[] args) {
		// 1부터 100까지 홀수만 출력하시오 (6월 13일!)
		//while문을 사용할 것
		int i=1;
		while(i<=100) {
			if (i%2 ==1) {
			System.out.println(i);
		}
			/** while(true) {
			 * if(num%2 ==1){
			 * System.out.println(num);
			 *}
			 *if(num==100) {
			 *break;
			 * }
			 */
			
			/** 두번째 방법)while(num <=100){
			 * System.out.println(num);
			 * num +=2;
			 * }
			 */
			
			/** while(num<=100){
			 * System.out-------
			 * num+=2;
			 */
       i++;
	}

	}
}