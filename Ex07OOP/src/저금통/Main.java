package 저금통;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)저금통 설계도를 사용해서 저금통 1개를 만듬.
		Piggybank pig1 = new Piggybank(1500);//기본생성자임
		//2) 저금통의 초기금액을 1500원으로 설정
		//pig1.money = 1500;
		//1) + 2) => 
		pig1.setMoney(2000);
		System.out.println(pig1.getMoney());
		//3) 저금통에 700원을 입금
		//:필드 money에 700원을 더하자.
		pig1.deposit(700);
		//4) 잔액 확인 
		pig1.showmoney();
		//5) 500원을 저금통에서 출금
		pig1.withdraw(500);
		//6) 잔액 확인.
		pig1.showmoney();

	}

}
