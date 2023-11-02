package ex02연산자;

public class Ex07논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isCheck1 = true;
		System.out.println(isCheck1);
		
		int num1 = 10;
		int num2 = 5;
		int num3 = 3;
		int num4 = 7;
		
		System.out.println(num1 > num2 && num3 > num4);
		System.out.println(num1 > num2 && num3 < num4);
		System.out.println(num1 > num2 || num3 == num4);
		System.out.println(num1 > num2 || num3  != num4);

	}

}
