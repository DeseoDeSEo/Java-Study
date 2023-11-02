import java.util.ArrayList;
import java.util.Scanner;
public class ex02뮤직플레이어 {
	public static void main(String[] args) {
		// 노래 리스트가 저장될 ArrayList만들기 :  musicList
		ArrayList<String> MusicList = new ArrayList<>();
		//"가수이름- 노래제목"
		// 사용자에게 보여지는 화면 구현
		int menu ;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("[1]노래조회 [2]노래추가 [3] 노래삭제 [4] 종료 >>");
			// 숫자입력받기 : select
			menu = sc.nextInt();
			// select가 어떤 숫자인지 판단
			if( menu == 1) {	
					if( MusicList.size() == 0) {
						System.out.print("재생목록이 없습니다. ");	
					}else {
						System.out.println("====현재재생목록====");
						for(int i =0; i < MusicList.size();i++) {
							System.out.println(i+". "+ MusicList.get(i));
						}}
					System.out.println(" " );
					System.out.print("====================");
			}else if(menu ==2) {
				System.out.println("====현재재생목록====");
					if( MusicList.size() == 0) {
						System.out.print("재생목록이 없습니다. ");	
					}else {
						for(int i =0; i<MusicList.size();i++) {
							System.out.println(i+". "+ MusicList.get(i));
						}}
				System.out.println(" " );
				System.out.print("====================");
				System.out.print("[1]마지막 위치에 추가  [2]원하는 위치에 추가 ");
					int choice = sc.nextInt();
					if(choice == 1 ) {
						System.out.print("추가할 노래 입력>> ");
						String song = sc.next();
						MusicList.add(song);
						System.out.println("추가가 완료되었습니다. ");
					}else {
						System.out.println("추가할 위치 입력>> ");
						int location = sc.nextInt();
						System.out.println(" 추가할 노래 입력>> ");
						String song = sc.next();
						MusicList.add(location-1, song);
						System.out.println("추가가 완료되었습니다"); }}
			else if(menu ==3) {
				System.out.println("====현재재생목록====");
				if( MusicList.size() == 0) {
					System.out.print("재생목록이 없습니다. ");	
				}else {
					for(int i =0; i<MusicList.size();i++) {
						System.out.println(i+". "+ MusicList.get(i));
					}}
				System.out.println("================");
				System.out.println("[1]선택삭제  [2]전체삭제 >>  ");
				int choice = sc.nextInt();
					if (choice==1) {
						MusicList.remove(choice-1);
						System.out.println("노래가 삭제되었습니다.");}
					else {	
						MusicList.clear();
						System.out.println("전체 노래가 삭제되었습니다.");}}
			else if(menu==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. ");
			}}
				
				
			
			// 단, 1~4가 아닌 다른 숫자를 입력하면 " 잘못입력했습니다."
			//    4를 입력하면 프로그램 종료
			// 1 -> ArrayList에 데이터가 있으면 재생목록을 보여주기
			//   -> 데이터가 없으면 "재생 목록이 없습니다."
			// 2 -> 마지막 위치에 추가
			//      원하는 위치에 추가
			// 3 -> 선택 삭제
		
	}


}
