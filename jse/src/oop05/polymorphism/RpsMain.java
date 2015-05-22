package oop05.polymorphism;

import java.util.Scanner;

public class RpsMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������� ������ �����մϴ�.");
		boolean flag = true;
		while (flag) {
			System.out.println("\n1.����\n2.����\n3.���ڱ�\n0.���� \n���ڸ� �Է��ϼ���.");
			int playerVal = scanner.nextInt();
			if (playerVal == 0) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			RpsService service = new RpsServiceImpl();
			if (playerVal < 4 && playerVal > 0) {
				System.out.println("�÷��̾�� " + service.showRpsVal(playerVal)
						+ "�� �½��ϴ�.");
				int comVal = service.displayComVal();
				System.out.println("��ǻ�ʹ� " + service.showRpsVal(comVal)
						+ "�� �½��ϴ�.\n");
				String winner = service.showWinner(playerVal, comVal);
				System.out.println(winner);
			} else {
				System.out.println("�߸��Է��߽��ϴ�. �ٽ��Է����ּ���");
			}
		}
		scanner.close();
	}
}
