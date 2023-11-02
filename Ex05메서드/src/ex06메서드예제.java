
public class ex06메서드예제 {

	public static void main(String[] args) {
		// 
		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("큰 수 확인: "+ result);
	}
	public static int largerNumber(int num1,int num2) {
		if (num1 > num2) {
			return num1;
		}
		else if( num1 < num2) {
			return num2;
		} else {
			return 0;
		}
	}

}
