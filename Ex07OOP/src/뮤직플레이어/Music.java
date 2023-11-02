package 뮤직플레이어;

public class Music {// vo value object?! 변수를 담고 있는 객체?!
	private String singer;
	private String title;
	private int year;
	private int time;
	private String path;
	//메소드 오버로딩  - 동일한 이름의 메서드를 정의하는 방법
	// 이유- 똑같은 이름으로 쓰면 사용자가 편하기에 (획일화)
	// 1. 메서드들의 매개변수 개수가 다를때
	// 2. 메서드들의 매개변수의 데이터 타입이 다를때
	
	public Music(String singer, String title, int year, int time) {
		this.singer = singer;
		this.title = title;
		this.year = year;
		this.time = time;
	}
	
	
	public Music(String singer, String title, int year, int time, String path) {
		this.singer = singer;
		this.title = title;
		this.year = year;
		this.time = time;
		this.path = path;
	}
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	public String getSinger() {
		return singer;
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	public int getTime() {
		return time;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	
}
