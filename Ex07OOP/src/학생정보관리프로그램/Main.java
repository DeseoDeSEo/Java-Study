package 학생정보관리프로그램;
public class Main {
	public static void main(String[] args) {
		Student student =new Student();
		student.insertString("나예호", "20200801");
		student.insertInt(20, 10, 80, 95);
		student.showStu();
		
		Student student1  = new Student();
		student1.insertString("김운비", "20111003");
		student1.insertInt(19, 90, 65, 30);
		student1.showStu();
	}

}
