package 일차원배열;
import java.util.Random;
public class ex09로또번호출력 {
	public static void main(String[] args) {	
		Random rd= new Random();
		int lotto [ ] = new int[5];
		System.out.println("====로또타임====");
		System.out.println("이번주 출력번호는요...!! 두구두구두구!!!!");
		for ( int i =0; i< lotto.length; i++) {
			lotto[i]= rd.nextInt(10)+1;
			for( int j =0; j<i; j++) {
				//자기 자시을 제외한 앞쪽 인덱스들과 비교
				//lotto[i] 새로입력된 값
				//lotto[j] 이미 앞쪽에 입력되어있는 값
				if( lotto[i] == lotto[j]) {
					i--;
					break;
				}
				}
			} 
		for(int k=0; k<lotto.length; k++) {
			System.out.println(lotto[k]);
		}
		}
}

