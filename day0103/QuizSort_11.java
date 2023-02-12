package day0103;

public class QuizSort_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"이효리","김삼순","진","슈가","유재석"};
		int [] ages = {40,33,27,28,52};
		
		/*이름의 오름차순으로 출력하세요
		 * 번호 이름 나이
		 * 1  김삼순 33
		 * 
		 * */
		//문자열 오름차순 정렬
		for(int i =0; i<names.length-1; i++)   // 문자 앞 뒤 비교 후 오름차순 정렬
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
					
					
					//이름행 변경시 나이도 같이 변경
					int n = ages[i];
					ages[i] = ages[j];
					ages[j] = n;
				}
			}
		}
		System.out.println("번호\t이름\t나이");
		for(int i=0; i<names.length; i++)
		{
			System.out.println(i+1+"\t"+names[i]+"\t"+ages[i]);
		}
		
	}

}
