package 보충수업;
public class PCHJajangmyeon extends PBKJajangmyeon {
	//상속 받은 기능은 적지않아도 상속된다.
	public void makeGoonManDo(){
		System.out.println(" 바삭한 군만두를 튀겨냅니다.");
	}
	//상속 받은 기능을 재정의 가능 -오버라이드 : 상황에 맞게 변화.
	public void makeJajang() {
		System.out.println(" 짜장면 위에 민초를 올린다.");
	}

	

}
