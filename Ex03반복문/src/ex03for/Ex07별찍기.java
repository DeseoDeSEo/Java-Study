package ex03for;

public class Ex07별찍기 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i =1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//			System.out.print("*");
//		}
//			System.out.println("");
//	}
		// 별찍기 2탄!!!!!
//		for (int i =5; i>=1; i--) {
//			for(int j =1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//별찍기 3탄!!!
		
		for(int i =5; i>=1; i--) {
			for(int j =1; j<=i;j++) { //for(int j=1;
				System.out.print(" ");}
				for(int k =5;k>=i;k--) {
					System.out.print("*");
				}System.out.println("");
	}
}
}
