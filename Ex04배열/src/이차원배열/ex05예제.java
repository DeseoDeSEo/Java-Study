package 이차원배열;

public class ex05예제 {

   public static void main(String[] args) {
      int[][] arr = new int[5][5];
      int num = 21; // 21 ~ 45
     
      
      // 입력부
      for(int j=4; j>=0; j--) {    
         for(int i=0; i<5; i++) {
            arr[i][j] = num;
            num++;
         }
      }
      // 출력부
      for(int j = 0; j<5; j++) {
    	  for(int i = 0; i<5; i++) {
            System.out.print(arr[j][i]+"\t");
         } System.out.println(" ");
      }      
   }
}