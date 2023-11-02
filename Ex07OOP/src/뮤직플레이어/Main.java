package 뮤직플레이어;
import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//노래실행
		MP3Player mp3 = new MP3Player();
		//노래 실행할 경로가 필요
		//mp3.play("C:\\Users\\gjaischool\\Desktop\\mp3\\뉴진스-HypeBoy.mp3"); //역슬래시 한번만 쓸 수 없음.
		
		// 1.가수명String  2.노래제목 String 3. 출시년도 int 4.시간 int 5.경로
		Music m1 = new Music("뉴진스","Hypeboy",2022, 140,"C:\\Users\\gjaischool\\Desktop\\mp3\\뉴진스-HypeBoy.mp3" );
		Music m2 = new Music("르세라핌","Antifragile",2022 ,180,"C:\\Users\\gjaischool\\Desktop\\mp3\\르세라핌-Antifragile.mp3");
		Music m3 = new Music("아이브","Love dive",2022,190,"C:\\Users\\gjaischool\\Desktop\\mp3\\아이브-LoveDive.mp3");
		Music m4 = new Music("윤하","사건의 지평선",2022,200,"C:\\Users\\gjaischool\\Desktop\\mp3\\윤하-사건의지평선.mp3");
		Music m5 = new Music("카라","When I move",2022,200,"C:\\Users\\gjaischool\\Desktop\\mp3\\카라-WhenIMove.mp3");

		ArrayList<Music> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);

		
//		System.out.println(m1.getSinger());
//		System.out.println(m2.getTitle());
//		System.out.println(m2.getYear());
//		System.out.println(m2.getTime());
		int point = 0;
		
		while(true) {
			System.out.println(" ");
			System.out.println("1.재생 2.정지 3.이전곡 4.다음곡 5.목록 6.종료 >>  ");
		    int menu = sc.nextInt();
			if(menu ==1) {
				System.out.println("===============재생=========");
				if (mp3.isPlaying()) {
					mp3.stop();
				};
				mp3.play(list.get(point).getPath());
				System.out.print(point +1 + "." );
				System.out.print(list.get(point).getSinger()+ " - " );
			    System.out.print(list.get(point).getTitle() + " " );
			    System.out.print(list.get(point).getTime()+"초");
			}
			else if(menu ==2) {
				System.out.println("======정지======");
				if (mp3.isPlaying()) {
					mp3.stop();
				};
				System.out.print(point +1 + "." );
				System.out.print(list.get(point).getSinger()+ " - " );
			    System.out.print(list.get(point).getTitle() + " " );
			    System.out.print(list.get(point).getTime()+"초");
			}
			else if(menu==3) {
				System.out.println("===========이전곡==============");
				if(point >0){
					point--;
					
				}if (mp3.isPlaying()) {
					mp3.stop();
				};
				
				mp3.play(list.get(point).getPath());
				System.out.print((point +1) + "." );
				System.out.print(list.get(point).getSinger()+ " - " );
			    System.out.print(list.get(point).getTitle() + " " );
			    System.out.print(list.get(point).getTime()+"초");
			
			}
			else if(menu==4){
				System.out.println("===========다음곡==============");
				if(point < list.size()-1) {
					point++;
				}if (mp3.isPlaying()) {
					mp3.stop();
				};
				
				mp3.play(list.get(point).getPath());
				System.out.print((point +1) + "." );
				System.out.print(list.get(point).getSinger()+ " - " );
			    System.out.print(list.get(point).getTitle() + " " );
			    System.out.print(list.get(point).getTime()+"초");
		
			}
			else if(menu ==5) {
				System.out.println("===============목록============");
				for(int i=0; i<list.size();i++) {
					System.out.println(i + ". "+ list.get(i).getSinger() + " - " +
							list.get(i).getTitle() + ", " + list.get(i).getTime()+"초");
					
				}
			}
			else if(menu ==6) {
				System.out.println("프로그램을 종료합니다.");
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				break;
			}
		}
	}
}
