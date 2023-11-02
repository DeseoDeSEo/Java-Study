package 월급계산프로그램;

public class Regular extends Employee {
	protected int bonus;

	public Regular(String empno, String name, int pay, int bonus) {//리턴타입이 없으면 void도 없음.
		super(empno, name, pay);
		this.bonus = bonus;
	
	}
	@Override
	public int getMoneyPay() {
		return (getPay() + bonus)/12;
	}
	public int getBonus() {
		return bonus;
	}

}
