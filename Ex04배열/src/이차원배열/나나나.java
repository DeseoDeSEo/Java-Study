package 이차원배열;

public class 나나나 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int[5][5];
		int num=1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5;j++) {
				arr[i][j] = num;
				num++;
			}
		}
		for(int j=0; j<5;j++) {
			for(int i=0; i<5; i++) {
				System.out.print(arr[j][i]  + "\t");
			}System.out.println();
			
		}

	}

}
