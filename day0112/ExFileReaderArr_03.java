package day0112;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ExFileReaderArr_03 {

	//번호	상품명		수량		단가		총금액 (split)
	public static void fileRead1() {
		String fileName = "C:\\sist1226\\file\\coffeeshop.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			System.out.println("번호\t상품명\t수량\t단가\t총금액");
			System.out.println("===============================");
			
			int n=0; //번호
			
			
			while(true)
			{
				String s = br.readLine();
				
				//종료
				if(s==null)
					break;
				
				//분리방법1
				/*String [] data = s.split(",");
				
				String sang=data[0];
				int su=Integer.parseInt(data[1]);
				int dan=Integer.parseInt(data[2]);
				int total = su * dan;*/
				
				//분리방법2
				StringTokenizer st = new StringTokenizer(s, ",");
				
				String sang = st.nextToken();
				int su = Integer.parseInt(st.nextToken());
				int dan = Integer.parseInt(st.nextToken());
				int total = su*dan;
				
				System.out.println(++n + "\t" + sang + "\t" + su + "\t" + dan + "\t" + total);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			
		}finally {
			try {
				br.close();
				fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileRead1();
	}

}
