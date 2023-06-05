package lotto01;

import java.util.Arrays;
import java.util.Random;

public class randomLotto {

	public static void main(String[] args) {
		int [] lotto = new int[6];
		Random random = new Random();
		
		//������ȣ ����
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			
			//�ߺ���ȣ ����
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		//�������� ����
		for(int i=0; i<lotto.length; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
			
		//������ȣ ���
		System.out.println("�ζǹ�ȣ : " + Arrays.toString(lotto)); // �迭�� ������ ���
	}

}
