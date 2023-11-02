package member;
public class MemberVO {
	private String id;
	private String pw;
	private String nick;
	
	
	public MemberVO(String id, String pw, String nick) {
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getNick() {
		return nick;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	
}
