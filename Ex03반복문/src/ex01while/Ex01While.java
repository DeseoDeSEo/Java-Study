package ex01while;

public class Ex01While {

	public static void main(String[] args) {
		// 반복문 -조건에 성립할때까지 반복하는 문법
		int num = 1;
		while(true) {
			System.out.println(num);
			if(num==5) {
				break;
			}
			num++;
		}
//		while( num <= 5) {
//			System.out.println(num);
//			num = num+1;//num +=1 , num ++;
//		//	break;
//			
//		}
////		System.out.println(num);

	}

}
