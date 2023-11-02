package 월급계산프로그램;

public class Temp extends Employee {
	
	public Temp(String empno, String name, int pay) {
		super(empno, name, pay);
	}

	public int getMoneyPay() {
		return getPay()/12;
	}
	

}
