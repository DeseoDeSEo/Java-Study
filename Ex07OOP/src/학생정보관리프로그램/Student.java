package 학생정보관리프로그램;
public class Student {
	//학생정보관리프로그램의 설계도
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scorePython;
	
	// public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scorePython
	// { this.name = name  ""...} 강사님 이렇게 하심.
	public void insertString(String name, String number) {
		this.name = name;
		this.number = number;
	}
	public void insertInt(int age, int scoreJava, int scoreWeb, int scorePython) {
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scorePython = scorePython;
	}
	public void showStu() {
		System.out.println(name +" 님 안녕하세요."+ "\n" + "[" + number + " ," 
		                   +age+ "살  ] ");
		System.out.println(name + "님의 Java 점수는 "+ scoreJava + "점 입니다.");
		System.out.println(name + "님의 web점수는 " + scoreWeb + "점 입니다. ");
		System.out.println(name + "님의 Python 점수는 "+ scorePython + "점 입니다.");
		System.out.println("=============================================");
	}
	// getter, setter
	// getter : 데이터를 가져와서 확인할 수 있도록 도와주는 메서드
	public String getName() {
		return name;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public int getScorePython() {
		return scorePython;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public void setScorePython(int scorePython) {
		this.scorePython = scorePython;
	}
	public String getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	// setter : 데이터를 수정할 수 있도록 도와주는 메서드
	public void setNamet(String name) {
		this.name = name;
	} // 단축키 : alt + shift + s -> generate setter and getter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
