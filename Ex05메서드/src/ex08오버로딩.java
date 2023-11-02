
public class ex08오버로딩 {

	public static void main(String[] args) {
		//메서드 특징
//        오버로딩(overloading) : 중복정의   .. 오버라이딩 : 재정의
//        같은 클래스 내에서 같은 이름의 메서드를 정의할 수 있다.
//        숫자 2개를 더해주는 기능 sum2
		  sum(2,3);
//        숫자 3개를 더해주는 기능 sum3
		  sum(2,3,4);
		}
		
		public static void sum(int num1, int num2) {
			System.out.println(num1 + num2);
		}
		public static void sum(int num1, int num2, int num3) {
			System.out.println(num1 + num2+ num3);
		}

	

}
