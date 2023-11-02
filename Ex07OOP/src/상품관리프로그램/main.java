package 상품관리프로그램;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		product[] pdList = new product[5];
		ArrayList<product> list = new ArrayList<>();
		while(true) {
			System.out.print("[1]물건추가 [2] 예상 판매량 조회 [3] 종료 >> ");
			Scanner sc = new Scanner(System.in);
			//객체가 자료형임 그래서 arraylist다음에 담고 싶은 자료형에 객체 이름을 적음.
			
			int choice = sc.nextInt();
				if (choice ==1) {
					System.out.print("물건 이름: ");
					String name = sc.next();
					System.out.print("단가: ");
					int unitPrice = sc.nextInt();
					System.out.print("수량: ");
					int amount = sc.nextInt();			
					product g = new product(name, unitPrice, amount);
					list.add(g);
					}
				else if(choice == 2) {
					System.out.println("제품명   \t 단가 \t 수량 " );
					int sum =0;
					for(int i = 0; i<list.size(); i++) {
						System.out.print(list.get(i).getName());
						System.out.print("\t"); 
						System.out.print(list.get(i).getUnitPrice());
						System.out.print("\t");
						System.out.print(list.get(i).getAmount());
						System.out.println();
						
						sum += list.get(i).getUnitPrice() * list.get(i).getAmount();
						
				}
					System.out.print("판매 시 매출: " + sum + " 원");}
				else
				{
					break;
				}
				
				
		

	}
	}
}
