package 이차원배열;
public class ex06예제 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num = 21;
		for (int j = 0; j<5;j++) {
			if (j==0) {
			for( int i = 0; i<5; i++) {
				arr[j][i] = num;
				num++;}}
			else if(j==1) {
			for(int i =4 ; i >=0; i--) {
				arr[j][i]= num;
				num++;}}
			else if( j==2) {
				for(int l=0; l<5; l++) {
					arr[j][l] =num;
					num++;} }
			
		    else if(j==3) {
			 for(int k = 4; k>=0; k--) {
				 arr[j][k] = num;
				 num++;}}
		    else {
		    	for(int d =0; d<5; d++) {
		    		arr[j][d] =num;
		    		num++;}}
		}
		for( int j=0; j<5;j++) {
			for(int i=0; i<5;i++) {
				System.out.print(arr[j][i]+ "\t");
			} System.out.println();
		}
}

	}
