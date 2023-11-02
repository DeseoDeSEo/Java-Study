package ex03Animal;

public class Bird extends Animal{
	// 조류는 동물이 가진 기능들을 다 가질 수 있다!
	// 조류의 설계도
	// 상속에서 사용되는 키워드 : extends(확장하다)
	// 알을 낳다
	public void egg() {
		System.out.println("알을 낳음");
	}
	//  오버라이딩
	//  move를 물려받지만 내부 로직을 다르게 구현함.
	//  : 상속 관계에서 메서드를 재정의(다른 구현, 다른 로직) 하는 것을 '오버라이딩'
	// 단, 같은 이름을 사용해야한다. (alt + shift+ s) 하고 override관련 함.

	@Override //어노테이션 : 오버라이딩임을 알려주는 체크임.
	public void move() {
		//move메서드를 구현할 수 있도록 자동완성
		System.out.println("날아다닌다. ");
	}
	

}
