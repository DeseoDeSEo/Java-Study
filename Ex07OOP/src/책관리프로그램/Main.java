package 책관리프로그램;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// vo => value object
		//자료형 [] 레퍼런스 변수명 = new 자료형 [배열의 크기];
		BookData[] bookList = new BookData[5]; //bookdata 자료형을 가진 변수들만 저장될 수 있음
		//b1은 BookData 자료형을 가진 상태
		BookData b1 = new BookData("Java", 21000, "홍길동");
		BookData b2 = new BookData("C++", 29000, "박문수");
		BookData b3 = new BookData("Datbase", 31000, "김장독");
		BookData b4 = new BookData("Android", 18000, "이순신");
		BookData b5 = new BookData("Web", 26000, "김철수");
		bookList[0] = b1;
		bookList[1] = b2;
		bookList[2] = b3;
		bookList[3] = b4;
		bookList[4] = b5;
		// 배열 안에 들어있는 값들에 접근하는 방법을 사용해서 사용자로부터 입력받은 금액으로 구매할 수 있는 책의 정보를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		System.out.println("구매 가능한 책 목록 ");
		for( int i =0; i<bookList.length; i++) {
			if (money >= bookList[i].getPrice()) {
				System.out.println("["+ bookList[i].getTitle()+ " , "+
			    bookList[i].getWriter()+ " , "+ bookList[i].getPrice()+"원]");
				
				}
			}
		}
	}

