/*package ex02do_while;

import java.util.Random;
import java.util.Scanner;

public class Ex04PlusGame {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		/Random rd = new Random();
		System.out.println("==================================plus game================");
		int inputNum =0;
		while (true) {
			System.out.print(num1 + "+ "+num2 + "=");
			inputNum = sc.nextInt();
		}
			int num1 = rd.nextInt(10)+1;
			int num2 = rd.nextInt(10)+1;
			System.out.print(num1 + "+ "+num2 + "=");
			inputNum = sc.nextInt();
			
			int answer = num1+num2;
			 */

package ex02do_while;

import java.util.Random;
import java.util.Scanner;

public class Ex04PlusGame {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      // 난수를 뽑는 방법
      Random rd = new Random();
      
      System.out.println("====Plus Game====");
      
      
      // 틀렸을때는 기존 문제를
      // 성공했을때는 새로운 문제를 출력
      // 힌트. 계속 같은 문제를 출제
      //      성공할때만 새로운 문제 뽑기
      
      // 첫 게임을 시작할때는 3개의 목숨이 주어진다
      // 문제의 답을 틀렸을때는 목숨을 하나씩 차감하며 
      // 클라이언트에게 알려준다 
      // 예 - 첫번째 문제 틀렸을 시 ) 남은목숨 2개
      // 마지막으로 목숨이 0이 되는 순간 게임은 종료된다
      
      
      int num1 = rd.nextInt(10) + 1;
      int num2 = rd.nextInt(10) + 1;
      int life = 3;
      int success = 0;
      
      while(true) {
         System.out.print(num1 + "+" + num2 + "=");
         int inputNum = sc.nextInt();
         
         
         // 정답확인
         int answer = num1 + num2;
         if(inputNum == answer) {
            System.out.println("Success!!!");
        
            num1 = rd.nextInt(10) + 1;
            num2 = rd.nextInt(10) + 1;
            success++;
           
            
         }else {
            System.out.println("Fail....");
            --life;
            if (life == 0) {
            	System.out.println("게임이 종료됩니다.");
            	break;
            }
            else{
            	System.out.println("목숨이 "+ life +"개 남았습니다.");
            }
         }
         System.out.println("맞춘개수:" + success);
         System.out.println("게임종료.");
         sc.close();
      }
      
      
   }

}