package day0103;

public class QuizScoreRank_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name = {"이우형","박예은","이지민","이성희"};
		int [] java = {77, 88, 69, 98};
		int [] oracle = {99, 87, 94, 89};
		int [] tot = new int[4];
		double [] avg = new double[4];
		int [] rank = new int[4];
		
		
		/*
		 * 각 학생들의 점수에 대한 총점 평균 등수를 구하여 출력하시오
		 * 
		 */
		//총점 평균 구하기
		for(int i=0;i<name.length;i++)
		{
			tot[i] = java[i] + oracle[i];
			avg[i] = tot[i]/2.0;
		}
		//등수 구하기
		for(int i =0; i<name.length; i++)
		{
			rank[i] = 1;
			for(int j=0; j<name.length;j++)
				if(tot[i]<tot[j])
					rank[i]++;
		}
		
		
		//최종출력
		
		System.out.println("번호\t이름\t자바\t오라클\t총점\t평균\t등수");
		System.out.println("=====================================");
		for(int i =0; i<name.length;i++)
		{
			System.out.println(i+1+"\t"+name[i]+"\t"+java[i]+"\t"+oracle[i]+"\t"+tot+"\t"+ avg + "\t" + rank[i]);
		}
			
			
		
	}

}
