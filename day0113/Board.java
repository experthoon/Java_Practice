package day0113;

public class Board {
	private String writer;
	private String subject;
	private String content;
	
	public Board() {};
	//명시적 생성자
	public Board(String name, String subject, String content) {
		// TODO Auto-generated constructor stub
		this.writer=writer;
		this.subject=subject;
		this.content=content;
	}
	
	
	
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
