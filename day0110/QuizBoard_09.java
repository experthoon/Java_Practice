package day0110;

import java.util.Scanner;

interface Command{
	public void write();
	
}

class Insert implements Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 Insert합니다");
	}
}
class Select implements Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 Select합니다");
	}
}
class Update2 implements Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 Update합니다");
	}
}
class Delete2 implements Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 Delete합니다");
	}
	

	}	
	
	
	

public class QuizBoard_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Command comm = null;
		int num;
		
		exit: while(true)
		{
			System.out.println("[메뉴] 1.추가 2.수정 3.삭제 4.조회 5.종료");
			System.out.println("==================================");
			System.out.println("select==>");
			num = sc.nextInt();
			
			switch(num)
			{
			case 1:
				comm = new Insert();
				break;
			case 2:
				comm = new Update2();
				break;
			case 3:
				comm = new Delete2();
				break;
			case 4:
				comm = new Select();
				break;
			default:
				System.out.println("시스템을 종료합니다");
				break exit; //while문 빠져나옴
			}
			if(num<=4)
				comm.write();
		}
	}
		
		
		
}


