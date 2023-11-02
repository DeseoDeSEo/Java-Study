package 월급계산프로그램;

public abstract class Employee {
	
	// Employee 클래스  == 일반클래스임.
	// 1) 추상메서드를 포함하는 클래스는 반드시 추상 클래스가 되어야한다.
	// 2) 추상클래스도 일반 메서드를 포함할 수 있다.
	// 3) 추상클래스가 추상 메서드를 포함하지 않을 수 있다.
	//+ 방법) public abstract class Employee
	// 4) 추상클래스는 객체 생성(실체화)가 불가능하다! - 개념적인 존재이며 공통적인 특징들인 추상적인개념.
	// 
	
	//Regular, PartTime, TempEmployee가 가지고 있는 공통적인 필드,메서드 있음
	//Regular, PartTime, TempEmployee가 Employee를 상속 받을 예정.
	 protected String empno;
	 protected String name;
	 protected int pay;
	// private -> 데이터 보호, 클래스 내부에 설계되어있는 메서드를 통해서만 접근가능
	// protected -> 상속관계에 있는 클래스들 + 같은 패키지에 있는 클래스들만 접근가능
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	public String Print() {
		return (empno + " : " + name+ " : " + pay);
	}
	
	public abstract int getMoneyPay(); //자식메서드에서 각자 다르게 구현되니까 추상메서드임.
	//추상메서드 : 선언만 되어있고 바디({}중괄호)가 없는 메서드이다.
	 
	public String getEmpno() {
		return empno;
	}
	public String getName() {
		return name;
	}
	public int getPay() {
		return pay;
	}
	
	
}
