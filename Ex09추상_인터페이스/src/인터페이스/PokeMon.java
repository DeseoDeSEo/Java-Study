package 인터페이스;
// 포켓몬 게임을 만드는 개발자
// 게임의 모든 캐릭터들은 공격, 특수공격을 할 수 있어야한다.
public interface PokeMon {
	// 인터페이스 -> 프로젝트 지침서, 설계도
	// : 1) 필드 2) 메서드( 반드시 선언만 함 => 추상메서드 )
	// 인터페이스는 일반 메서드를 포함할 수 없다.
	//1) 필드
	final String name = "조자연";
	
	// 일반공격: atk(attack)
	public abstract void atk();
	
	// 특수공격: specialAtk
	public abstract void specialAtk();
    
}
