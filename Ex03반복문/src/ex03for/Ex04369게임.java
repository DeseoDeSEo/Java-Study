package ex03for;
public class Ex04369게임 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		for(i=1 ; i<=50; i++) {
			if(i% 10 ==3 || i %10==6|| i % 10 ==9){
				System.out.println("박수");}
			else if(i%10 ==5) {
					System.out.println("으악");}
			else {
					System.out.println(i);
					}
				}
	}
	
	}

/*for (int i =1; i<=50; i++){
 * int cal = i%10;
 * if(cal ==3 || cal == 6 || cal == 9){
 * */
 