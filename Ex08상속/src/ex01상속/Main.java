package ex01상속;
public class Main {
	public static void main(String[] args) {
		// p.256  
		/* 메서
		 * 상속 -> 부모 클래스의 코드를 자식클래스에서 물려받아 사용하는 것
		 * 	      프로그래밍에선는 상속을 단순히 물려 받는 것이 아닌
		 * 		  물려 받은 후 자식 클래스 특성에 맞게 확장시키는 개념
		 * 
		 * 		  자바의 상속을 할 때는 extends라는 키워드를 사용한다.
		 * 클래스 명 앞에 final이라고적혀있으면 
		 * 부모 클래스 super class 자식 클래스 sub class
		 *(샹속의 특징) 
		 *동시에 2개 이상의 상속을 받을 수 있다.
		 *상속을 여러번 해주는 것은 상관없다.
		 *모든 클래스는 최상위 부모로 object클래스를 가지게 된다.
		 *
		 *Casting(형변환)
		 *: 기본데이터 형변환
		 *1) 명시적 형변환(강제)
		 *2) 묵시적 형변환(자동)
		 *   -> 객체타입 데이터 형변환
		 *   : 객체타입 데이터 형변환은 상속관계에 있을때 만 가능하다.
		 * 		
		 */
		Animal a = new Animal();
		a.swimming();
		Cat c = new Cat();  // cat이라는 객체 선언
		c.swimming();       //  
		c.grooming();
		

	}

}
