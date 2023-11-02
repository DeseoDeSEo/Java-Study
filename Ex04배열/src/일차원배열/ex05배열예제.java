package 일차원배열;

import java.util.Scanner;

public class ex05배열예제 {

	public static void main(String[] args) {
		// 1) 입력하는 도구 가져오기
		// 2) 사용자가 입력한 5개의 점수들을 배열에 저장
		// 배열의 이름: score
		// 3)입력된 점수들을 모두 출력하기
		// 4) 최고 점수, 최저 점수 출력하기
		// 5) 총합, 평균 출력하기
		Scanner sc = new Scanner(System.in);
		int nom []= new int[5];
		int max ;
		int min;
		int sum = 0;
	   
		for ( int i = 0; i<nom.length; i++ ) {
				System.out.print((i+1) +"번째 입력 값 >> ");
				nom[i]= sc.nextInt();
				sum = nom[i] + sum;}
		System.out.print("입력된 값: " );
		for( int i =0; i<nom.length; i++) {
			if( i == nom.length){
				System.out.println(" ");}
			else  {
					System.out.println(nom[i]+ ", ");}
				}
		
		max = nom[0];
		min = nom [0];
		
		for ( int i = 0; i<nom.length; i++ ) {
				if ( nom[i]> max) {
					max = nom[i];
				}
			}

		for ( int i = 0; i< nom.length; i++ ) {
				if(nom[i]< min) {
					min = nom[i];
			}
		}
	
		int average = sum / nom.length;
		System.out.println("최대값: " + max  );
		System.out.println("최소값: "+ min);
		System.out.println("총합: "+ sum);
		System.out.println("평균: " + average);

	}
}
	

