package 일차원배열;

public class ex01배열기초 {

	public static void main(String[] args) {
		// 배열 : 같은 타입의 데이터를 관리하기 위해 사용하는 자료구조
		//1. 인덱스로 이루어진 자료구조
		//2. 순차적 접근이 가능한 자료구조
		//3. 학생 3명의 이름을 저장하자!
//		
//		String stu1 = "조미소";
//		String stu2 = "조자연";
//		String stu3 = "박호용";
//		for( int i = 1; i<=3; i++) {
//			System.out.println(stu+i);
//		}
		//이름이라는 같은 타입의 데이터를 하나로 관리할 수 있는 배열
		//1.배열을 선언하는 방법
		//자료형[] 배열명 =  new 자료형[배열의크기];
		//+배열은 선언 및 생성을 할때 크기가 정해져있다.
		//뒤쪽에서 크기를 변경할 수 없다.
		String[] stu= new String[3];
		//System.out.println(stu); // 3칸짜리 공간이 저장되어있는 주소값
		stu[0] = "조자연";
		stu[1] = "박호용";
		stu[2] = "조미소";
		//System.out.println(stu[1]);//값변경은 가능하지만 배열 크기는 변경 불가.
		//Syntax error : 빨간줄 (문법적으로 치명적인 오류)
		//Exception : 실행을 시켜야 확인할 수 있는 오류
		//인덱스 값을 사용해서 3명의 이름을 for문을 사용해서 출력
		for( int i =0; i<=2; i++) {
			System.out.println(stu[i]);
		}
		
		int [] arr = {3,10,4,8,17,22,31};
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		int max =arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max) {
			max = arr[i];
		}
		}	
		System.out.println("최대값은" + max +"입니다.");
	}

}
