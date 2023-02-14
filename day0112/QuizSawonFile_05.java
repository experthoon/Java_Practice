package day0112;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class QuizSawonFile_05 {
	
	/*/
	 * 가족수당 = 가족수 * 50000
	 * 시간수당 = 시간수 * 25000
	 * 총급여 = 기본급 + 가족수당 + 시간수당
	 * 번호	사원명		기본급		가족수		초과근무시간		가족수당	시간수당	총급여
	 */
	
	public static void payRead() {
		String fileName = "C:\\sist1226\\file\\sawon.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			System.out.println("번호\t사원명\t기본급\t가족수\t초과근무시간\t가족수당\t시간수당\t총급여");
			System.out.println("==========================================================================");
			
			int n =0;
			
			while(true)
			{
				String s = br.readLine();
				
				if(s==null)
					break;
				
				String [] data = s.split(",");
				
				String sawonName = data[0];
				int gibonpay = Integer.parseInt(data[1]);
				int familySu = Integer.parseInt(data[2]);
				int chogwa = Integer.parseInt(data[3]);
				int familyPay = familySu * 50000;
				int timeSu = chogwa * 25000;
				int total = gibonpay + familyPay + timeSu;
				
				
				
				System.out.println(++n + "\t" + sawonName + "\t" + gibonpay + "\t" + familySu + "\t" +
				chogwa + "\t" + familyPay + "\t" + timeSu + "\t" + total);
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
		payRead();
	}

}
