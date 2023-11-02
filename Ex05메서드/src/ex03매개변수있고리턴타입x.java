
public class ex03매개변수있고리턴타입x {

	public static void main(String[] args) {
		// 매개변수 있고, 리턴타입 없다(=void =텅빈)
		// 전달인자 있고, 리턴타입 자리에 데이터 타입이 명시x(return 키워드가 없다.)
		// void가 오는 경우는 메서드가 순수하게 기능자체를 가지고 있는 경우
		// ex) syso, compile을 하는 기능...
		// 여기서는 sumprint를 만듬
		//( 숫자 2개를 전달 받아서 더한 결과값을 출력해주는 기능)
		sumPrint(3,5);
// print기능이 있기에 또 다시 print사용 불가.
	}//아래는 순수한 프린트 기능을 가지고 있어서 void가 옴.
	public static void sumPrint(int num1, int num2) {
		System.out.println(num1 +num2);
	}

}
