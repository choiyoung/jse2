package oop02.encapsule;

import java.util.Scanner;

public class RpsController {
	public static void main(String[] args) {
		RpsService service = new RpsService();
		RpsUtil util = new RpsUtil();
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("���������� ������ �����մϴ�.");
			System.out.println("1.����, 2.����, 3.���ڱ� �� �Է��ϼ���.");
			int playerVal = scanner.nextInt();

			if (playerVal < 3 && playerVal > 0) {
				System.out.println("�÷��̾�� " + service.showRpsVal(playerVal)
						+ "�� �½��ϴ�.");
				int comVal = service.displayComval();
				System.out.println("��ǻ�ʹ� " + service.showRpsVal(comVal)
						+ "�� �½��ϴ�.");
				String winner = service.showWinner(playerVal, comVal);
				System.out.println(winner);
			} else {
				System.out.println(util.showRange(1, 3));
				System.out.println();
			}
		}
		scanner.close();
	}
}
