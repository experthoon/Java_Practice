package day0119;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectTest {
	
	static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	
	public void connectSawon() {
		Connection conn = null; //메서드에서는 초기값 안주면 에러남
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "select * from sawon order by num asc";
		
		try {
			conn = DriverManager.getConnection(URL, "dragon", "a1234");
			
			System.out.println("클라우드의 오라클 서버에 연결성공!!!");
			
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			//여러줄을 가져와야 할경우 while문 사용
			//rs.next(): 다음데이터로 이동하면서 true반환, 더 이상 데이터가 없으면 false반환
			while(rs.next())
			{
				//db로부터 데이터 가져오기
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String buseo = rs.getString("buseo");
				int pay = rs.getInt("pay");
				
				System.out.println(num + "\t" + name + "\t" + gender + "\t" + buseo + "\t" + pay);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("클라우드의 오라클 서버에 연결실패!!!" + e.getMessage());
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//connectFood
	public void connectFood() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "select f.fno,name,food,price,shop,loc,addr from food f, jumun j where f.fno=j.fno";
		
		try {
			conn=DriverManager.getConnection(URL, "dragon", "a1234");
			
			System.out.println("오라클 dragon 계정 연결성공!!!");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("***배민 주문 고객 리스트***");
			System.out.println("주문번호\t주문자\t음식명\t가격\t상호명\t가게위치\t주소");
			System.out.println("============================================================");
			
			while(rs.next())
			{
				int fno = rs.getInt("fno");
				String name = rs.getString("name");
				String food = rs.getString("food");
				int price = rs.getInt("price");
				String shop = rs.getString("shop");
				String loc = rs.getString("loc");
				String addr = rs.getString("addr");
				
				System.out.println(fno + "\t" + name + "\t" + food + "\t" + price + "\t" + shop + "\t" + loc + "\t" + addr);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결 실패" + e.getMessage());
			
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static 아니니까 메서드를 생성해줘야함
		DbConnectTest dct = new DbConnectTest();
		//dct.connectSawon();
		dct.connectFood();
		
	}

}
