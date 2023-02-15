package day0119;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class QuizMyStudentCrud {
	
	DbConnect db = new DbConnect();
	
	public void insertStudent() {
		Scanner sc = new Scanner(System.in);
		
		String name, hp, dream;
		int age;
		String sql = "";
		
		System.out.println("학생 이름 입력: ");
		name = sc.nextLine();
		System.out.println("핸드폰 번호 입력: ");
		hp = sc.nextLine();
		System.out.println("장래희망 입력: ");
		dream = sc.nextLine();
		System.out.println("나이 입력: ");
		age = Integer.parseInt(sc.nextLine());
		
		sql = "insert into mystudent values(seq_s.nextval, '"+name+"','"+hp+"','"+dream+"','"+age+"',sysdate)";
		//System.out.println(sql);
		
		//db연결
		Connection conn = null;
		Statement stmt = null;
		
		conn = db.getConnection(); //오라클에 연결
		
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("***추가완료***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}
	public void selectStudent() {
		System.out.println("학생번호\t이름\t핸드폰번호\t장래희망\t나이");
		System.out.println("=====================================================");
		
		String sql = "select * from mystudent order by num";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		conn = db.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				String num = rs.getString("num");
				String name = rs.getString("name");
				String hp = rs.getString("hp");
				String dream = rs.getString("dream");
				int age = rs.getInt("age");
				
				System.out.println(num + "\t" + name + "\t" + hp + "\t" + dream + "\t" + age + "살\t" + rs.getDate("sdate"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
	}
	
	public void deleteStudent() {
		Scanner sc = new Scanner(System.in);
		
		String num;
		String sql = "";
		
		System.out.println("삭제할 학생 번호 입력: ");
		num = sc.nextLine();
		
		sql = "delete from mystudent where num=" + num;
		System.out.println(sql);
		
		Connection conn = db.getConnection();
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql);
			
			if(a==0)
				System.out.println("없는 학생 번호입니다.");
			else
				System.out.println("***삭제 완료***");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}
	public void updateStudent() {
		Scanner sc = new Scanner(System.in);
		String name, hp, dream;
		int age;
		int num;
		String sql = "";
		
		System.out.println("수정할 학생 번호를 입력하세요: ");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.println("수정할 학생 이름은: ");
		name = sc.nextLine();
		
		System.out.println("수정할 학생 전화번호: ");
		hp = sc.nextLine();
		
		System.out.println("수정할 학생의 장래희망: ");
		dream = sc.nextLine();
		
		System.out.println("수정할 학생 나이: ");
		age = Integer.parseInt(sc.nextLine());
		
		sql = "update mystudent set name = '"+name+"',hp = '"+hp+"',dream = '"+dream+"',age ='"+age+"' where num= "+num;
		System.out.println(sql);
		
		Connection conn = db.getConnection();
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql);
			if(a==0)
				System.out.println("***수정할 학생 정보가 없습니다.***");
			else 
				System.out.println("**수정완료**");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("updateError: " + e.getMessage());
		}finally {
			db.dbClose(stmt, conn);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizMyStudentCrud qmc = new QuizMyStudentCrud();
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		while(true)
		{
			System.out.println("***QuizMyStudentCrud예제***");
			System.out.println("1.insert  2.select  3.delete  4.update  9.exit");
			n = Integer.parseInt(sc.nextLine());
			
			if(n==1)
				qmc.insertStudent();
			else if(n==2)
				qmc.selectStudent();
			else if(n==3)
				qmc.deleteStudent();
			else if(n==4)
				qmc.updateStudent();
			else if(n==9)
			{
				System.out.println("종료하겠습니다.");
				break;
			}
		}
	}

}
