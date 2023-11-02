package 일차원배열;
import java.util.Scanner;
public class ex06배열예제 {
   public static void main(String[] args) {

      // 1) 입력하는 도구 가져오기
      Scanner sc = new Scanner(System.in);
      // 2) "수", "박"을 저장할 배열
      String[] arr = {"수","박"};
      
      // 수박 게임 만들기
      System.out.println("==== 수박 게임 Start! ====");
      // 3) 사용자에게 숫자 입력받기
      System.out.print("숫자를 입력해주세요 >> ");
      int num = sc.nextInt();
      // 4) num번 반복 : 글자를 출력하는 것
      for(int i = 0; i < num; i++) {
         // num번 반복하는 for문
         // i : 0 1 2 3 ... num-1
         // for문이 홀수번째 반복 : 수 -->i : 0 2 4 6 ... 
         // for문이 짝수번째 반복 : 박 -->i : 1 3 5 7 ...
         if(i % 2 == 0) {
            // 수
            System.out.print(arr[0]);
         }else {
            // 박
            System.out.print(arr[1]);
         }
      }
      
      
//      for(int i = 1; i <= num; i++) {
//         // i : 1 2 3 4 5 num
//         // for문 홀수번째 : i 1 3 5 7
//         // for문 짝수번째 : i 2 4 6 8
//      }
      
      
   }

}



// 내가한거
//package 일차원배열;
//
//import java.util.Scanner;
//
//public class ex06배열예제 {
//
//	public static void main(String[] args) {
//		// 수박게임만들기
//		Scanner sc = new Scanner(System.in);
//		String[] arr = {"수", "박"};
////		String arr[] = new String[2];
////		arr[0] = "수";
////		arr[1] = "박";
//		System.out.println("===수박게임 Start! ===");
//		System.out.print("숫자를 입력해주세요.>>  " );
//			 int num = sc.nextInt();
//			 for( int i = 0; i < num; i++) {
//				 if(i%2==0) {
//				 System.out.print(arr[0]);
//			}else {
//				System.out.print(arr[1]);
//			}
//		}
//
//	}
//}
