package ch02;

public class FunctionTest {
	
	public static int addNum(int num1, int num2) { // �Ű������� ��ȯ �� �� �ִ� ���
		
		int result;    //��������
		result = num1 + num2;
		return result; //��ȯ�̵Ǹ� �ڵ����� ��������.
		
	}
	
	public static void sayHello(String greeting) { // ��ȯ���� ���� ���
		
		System.out.println(greeting);
	
	}
	
	public static int calcSum() { //��ȯ�� �ϰ� �Ű������� ���� ���
	
		int sum = 0;
		int i;
		
		for(i=0; i<=100; i++) {
			sum += i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		int n1 = 10; //��������
		int n2 = 20;
		
		int total = addNum(n1, n2); //�Լ��� ȣ���ϸ� �Լ��� ����� �޸� ������ ���ÿ� ����.
		System.out.println(total);
		
		sayHello("�ȳ��ϼ���");
		
		total = calcSum();
		System.out.println(total);
	}

}
