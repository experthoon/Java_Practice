package day0106;

class MyStuInfo{
	private String stuName;
	private String hp;
	private int score;
	
	//3개 생성자
	public MyStuInfo(String name, String hp, int score) {
		this.stuName=name;
		this.hp=hp;
		this.score=score;
	}
	//출력메서드
	public void writeData() {
		System.out.println("이름: " + stuName);
		System.out.println("연락처: " + hp);
		System.out.println("점수: " + score);
	}
}

public class ArrayConst_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MyStuInfo in1=new MyStuInfo("김영", "0101010110", 40);
		MyStuInfo in2=new MyStuInfo("김영", "0101010110", 40);
		MyStuInfo in3=new MyStuInfo("김영", "0101010110", 40);
		MyStuInfo in4=new MyStuInfo("김영", "0101010110", 40);
		MyStuInfo in5=new MyStuInfo("김영", "0101010110", 40);
		
		in1.writeData();
		in2.writeData();*/
		
		//선언, 할당... 초기화
		/*MyStuInfo [] stu = new MyStuInfo[3];
		
		stu[0] = new MyStuInfo("김종이", "010-1111-2222", 99);
		stu[1] = new MyStuInfo("김혜원", "010-2222-2222", 89);
		stu[2] = new MyStuInfo("백혜원", "010-1111-1235", 79);*/
		
		//선언,할당과 동시에 초기화
		MyStuInfo [] stu = {new MyStuInfo("김종이", "010-0000-000", 89),
							new MyStuInfo("김종이", "010-0000-000", 89),
							new MyStuInfo("김종이", "010-0000-000", 89)};
		
		//출력
		for(int i=0; i<stu.length; i++)
		{
			stu[i].writeData();
			System.out.println("------------------------------------");
			
		}
		//출력2
		for(MyStuInfo my:stu)
		{
			my.writeData();
			System.out.println("------------------------------------");
		}
	}

}
