package Person;
public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("조자연", 20,"여자",164, "광주");
//		p1.name = "조자연";
//		p1.age =20;
//		p1.gender = "여자";
//		p1.height = 164;
		System.out.println("이름: "+p1.name);
		System.out.println("나이: "+p1.age);
		System.out.println("성별: "+p1.gender);
		System.out.println("키: "+p1.height);
		p1.breathe();
		p1.eat();
		p1.sleep();
		
//		Person p2 = new Person();
//		p2.name= " 류혜림";
//		p2.age = 28;
//		p2.gender= "여자";
//		p2.height = 160;
//		p2.home = "광주";
//		System.out.println("이름: "+p2.name);
//		System.out.println("나이: "+p2.age);
//		System.out.println("성별: "+p2.gender);
//		System.out.println("키: "+p2.height)		
		
	}
}