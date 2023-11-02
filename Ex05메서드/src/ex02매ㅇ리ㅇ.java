
public class ex02매ㅇ리ㅇ {

	public static void main(String[] args) {
		// 매개변수 있고, 리턴타입 있다
		// 전달인자 있고, 리턴타입 자리에 데이터 타입이 명시되어있다.(+return)
		// 2개의 숫자를 빼기 해준 결과값을 받을 수 있는 minus라는 메서드
		minus(8,3); // 리턴 으로 하면 출력값이 없으니 Print해야함
		System.out.println(minus(8,3));

	}// main 메서드 밖
	public static int minus(int num1, int num2) {
		return num1 - num2;
		//리턴 타입 자리에 데이터 타입이 있으면 반드시 return 이라는 키워드 작성
		//메서드 사용은 main안에서 사용해야함.
	}

}
