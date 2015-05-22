package oop05.polymorphism;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ű�� �Է��ϼ��� : ");
		double height = scanner.nextDouble();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		double weight = scanner.nextDouble();
		
		KaupInterface kaup = new KaupImpl();
		
		System.out.println("Ű : "+height+"cm\n�����Դ� : " +weight+
				"Kg\nī�������� : "+kaup.getKaupIndex(height, weight)+
				"\n����� "+kaup.getResultMsg()+"�Դϴ�.");
		scanner.close();
	}
}
