package ex03Animal;

public class Main {

	public static void main(String[] args) {
		// Animal
		Animal a1 = new Animal();
		a1.name = "동물";
		a1.move();
		
		//Bird
		Bird b1 = new Bird();
		b1.move();
		//Penguin
		Penguin p1 = new Penguin();
		p1.move();
		p1.cry();
		// 오버라이딩(Overriding) : 재정의
		// 상속 관계에 있는 메서드를 같은 이름으로 구현, 내부 로직은 다르게 작성됨.
		
		//  캐스팅(Casting) 
		//  : 기본 데이터 타입에 한 형변환
		//  - 객체의 타입에 대한 형변환 -> 객체의 타입을 바꿈
		//    단, 반드시 상속의 개념이 있어야한다.
		
		// 1) 묵시적(자동) 형변환 -> 업캐스팅 개념
		//  :자식 클래스가 부모 클래스의 타입으로 변형되는 것 (업캐스팅 하면 자식 클래스의 고유기능은 사라짐.)
		//    Bird ----> Animal
		Animal a2 = new Bird();
		// a2는 Animal 자료형 = Bird자료형을 대입.
		a2.cry();
		a2.move();
	//  1) Bird가 가지고 있는 고유한 기능, 데이터는 사용 불가
	//  2) Animal로 부터 물려받아서 오버라이딩한 메서드는 사용가능
	
		// 2) 명시적(강제) 형변환 -> 다운캐스팅 개념
		//   : 부모클래스가 자식 클래스로 타입이 변형되는것
		//   +( 업캐스팅 되었던 레퍼런스 변수만 다운캐스팅가능. )
		// Bird b2 = new Animal(); 오류 발생함. 
		Bird b2 = (Bird)a2;
		

	}

	
}










