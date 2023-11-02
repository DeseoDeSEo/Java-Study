package 추상메서드;
public abstract class 조류 {
	//메서드를 설계(선언) ----> 추상메서드
	//울기
	public abstract void cry(); //추상메서드
	//움직이기
	public abstract void move();
	//알낳기
	public void egg() {
		System.out.println("알을 낳는다");
	}
}
