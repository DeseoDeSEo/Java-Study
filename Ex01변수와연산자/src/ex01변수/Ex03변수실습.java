package ex01변수;

public class Ex03변수실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		num1 = 10;
		num1 = 100;
		System.out.println(num1);
		int myAge = 25;
		int yourAge = 28;

		///////////////////
		/*
		 * myAge = myAge +3; yourAge = yourAge -3;
		 */
		////////////////////
		int change;
		change = myAge; // change = 25
		myAge = yourAge;
		yourAge = change;
		//////////////////////////

		System.out.println("나의나이: " + myAge);
		System.out.println("짝꿍의 나이: " + yourAge);

	}

}
