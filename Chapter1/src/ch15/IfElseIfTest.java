package ch15;

import java.util.Scanner;

public class IfElseIfTest {

	public static void main(String[] args) {
		System.out.println("*���̵��� ���ǥ*");
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("�� ���� �Ƶ��Դϴ�.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}
		else if(age < 20) {
			charge = 1000;
			System.out.println("��, ����л��Դϴ�.");
		}
		else {
			charge =3000;
			System.out.println("�Ϲ��� �Դϴ�.");
		}
		System.out.println("������" + charge + "�Դϴ�");
	}
	
}
