package oop01.game;

import java.util.Scanner;



public class KaupService {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ű�� �Է��ϼ��� :");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ��� : ");
		double weight = scanner.nextDouble();

		KaupVO kaup = new KaupVO();
		kaup.setHeight(height);
		kaup.setWeight(weight);
		kaup.setIdx(weight, height);
		kaup.setMsg();
		System.out.println(kaup);

		System.out.println("�Ϸ�");
		scanner.close();
	}
}
