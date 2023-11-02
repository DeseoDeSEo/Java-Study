package 월급계산프로그램;
public class Main {
	public static void main(String[] args) {
		
		Regular regular = new Regular("SMHRD001", "홍길동", 4000 ,400);
		System.out.println(regular.Print());
		System.out.println(regular.getMoneyPay()+"만원");
		
		Temp temp = new Temp("SMHRD002", "박문수", 3000);
		System.out.println(temp.Print());
		System.out.println(temp.getMoneyPay()+"만원");
		
		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD001", "홍길동", 10,10);
		System.out.println(partTime.Print());
		System.out.println(partTime.getMoneyPay()+"만원");
		
		
	}

}
