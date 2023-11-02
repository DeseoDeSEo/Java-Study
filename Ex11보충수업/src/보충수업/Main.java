package 보충수업;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		//클래스에서 메서드를 사용하기 위해서는 객체를 생성해야한다.
//		PBKJajangmyeon pbk = new PBKJajangmyeon(); //pbk라는 변수(객체)생성됨. (추상클래스 일때는 객체 생성을 할 수 없다.)
//		pbk.makeJajang(); //객체한테 요청할때는 .을 찍는다.
		
		PCHJajangmyeon pch = new PCHJajangmyeon();
		//상속 받으면 가진 것은 아니지만 가진 것처럼 행동할 수 있다.
		PBGJajangmyeon pbg = new PBGJajangmyeon();
		PJGJajangmyeon pjg = new PJGJajangmyeon();
		PDYJajangmyeon pdy = new PDYJajangmyeon();
		
		PBKJajangmyeon p1 = pch; // 형변환 . pch가 상속메서드의 p1으로 들어간다.(= 부모 형태로 바뀐다. -> 업캐스팅) 상속관계에서만 일어난다.
		//재정의된 메서드는 같이 업캐스팅된다. 새로 만든 메서드는 같이 업캐스팅 되지 않는다. 
//		p1.makeJajang();
		PBKJajangmyeon p2 = pbg;		
		PBKJajangmyeon p3 = pjg;
		PBKJajangmyeon p4 = pdy;
		//이렇게 하면 서로 데이터 타입이 달랐던 3개를 한개의 데이터 타입으로 묶을 수 있다.
		
		ArrayList<PBKJajangmyeon> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		for(int i =0; i<list.size();i++) {
			list.get(i).makeJajang();	}
		
		PCHJajangmyeon pch2= (PCHJajangmyeon)p2; //다운캐스팅 (부모클래스에서 자식클래스로 돌아가는 것)
		pch2.makeGoonManDo();
//		다시 자식 클래스로 돌아가는 것임.
		
	}
}
