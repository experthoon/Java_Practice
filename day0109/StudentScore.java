package day0109;

public class StudentScore {
	
	private String name;
	private int java;
	private int html;
	private String schoolName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public int getTotal()
	{
		int n=0;
		n = java + html;
		return n;
	}
	public double getAverage()
	{
		double n=0;
		n = getTotal()/2.0;
		return n;
	}
	public String getPungga()
	{
		
		
		if(getAverage()>=80)
			return "합격";
		else
			return "불합격";
		
	}
	
}
