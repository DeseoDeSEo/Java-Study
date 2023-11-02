package 월급계산프로그램;

public class PartTimeEmployee extends Employee {
	protected int workDay;
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay){
		super(empno,name, pay);
		this.workDay = workDay;
	}
	public int getMoneyPay() {
		return (getPay()*workDay);
	}
}
// 상속 관계에서 부모클래스가 생성자를 가지고 있으면 반드시 
//자식클래스에서도 생성자가 있어야한다.
//super(): 부모클래스의 생서자를 지칭하는 메서드