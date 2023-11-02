package ex03for;
public class Ex06심플구구단 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("2단")
//		for(int i =1; i<=9;i++) {
//			int num= 2;
//			System.out.println(num +"*"+ i + " = "+ num*i);
//		}
		
//		for(int i=2 ; i<=9; i++){
//			System.out.println("============"+i+"단"+"==========");
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//				if(j==9) {
//					System.out.println("  ");
//				}
//				
//			}
//		}
		
		for(int i =2 ; i<= 9 ; i++) {
			System.out.print(i+"단 : ");
			for(int j =1; j<=9;j++) {
				System.out.print(i+"*" +j +"="+i*j+ " ");
				if(j==9) {
				System.out.println();
			}
		}
	}
}
}
