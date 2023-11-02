package ex04switch;

import java.util.Scanner;

public class Ex04최종조건문실습 {

	public static void main(String[] args) {
		// 자판기 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원) >>");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			if (money < 800) {
				System.out.println("돈이 부족해요ㅜㅜ");
				System.out.println("잔돈 " + money + "원");
				break;
			}
			else {
			   int resto = money -800;
			   System.out.println("잔돈 " + resto + "원");
			   int cheon = resto /1000;
			   int o = resto %1000/500;
			   int b =resto %1000%500/100;
			   System.out.print("천원: " + cheon +"개");
			   System.out.print("오백원" + o + "개");
			   System.out.print("백원" + b + "개");
				  
				   
			   }
			   int sip = (resto-(cheon*1000))-
			   System.out.print("천원: "+ cheon+"개");
			   
			   break;}
		case 2:
			if (money < 500) {
				System.out.println("돈이 부족해요ㅜㅜ");
				System.out.println("잔돈 " + money + "원");
				break;
			}
			else {
				int resto1 = money -500;
			    System.out.println("잔돈 " + resto1 + "원");
			    int cheon = resto1 /1000;
				   System.out.print("천원: "+ cheon+"개");
			    break;		
			}
			
		case 3: 
			if(money < 1500) {
				System.out.println("돈이 부족해요ㅜㅜ");
				System.out.println("잔돈 " + money + "원");
				break;
			}
			else {
			    int resto2 = money -1500;
			    System.out.println("잔돈: " + resto2 + "원");
			    int cheon = resto2 /1000;
				   System.out.print("천원: "+ cheon+"개");
			    break;
			    }
			
		default:
			System.out.print("올바른 숫자를 입력하세요. " );
			break;
		}
	}

}
// if(menu ==1){
//   changemoney =money -800;
//} else if(menu ==2){
//changemoney = money-500;
// else if(menu == 3){
//changemoney = money -1500;
