package oop02.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		boolean flag = true;
		GameRpsService service = new GameRpsService();
		Scanner scanner = new Scanner(System.in);

		while (flag) {
			
			System.out.println("\n����, ����, �� ������ �����մϴ�.");
			System.out.println("1.����\t2.����\t3.��\t0.����");
			int playerValue = scanner.nextInt();
			if(playerValue > 3 || playerValue < 0){
				service.msg(playerValue);
			}else{
				int comValue = (int) service.displayComValue();
				if (playerValue == 0) {
					System.out.println("������ �����մϴ�.");
					break;
				}
				System.out.println("����� " + service.showRpsValue(playerValue)
						+ " �� �½��ϴ�.");
				System.out.println("��ǻ�ʹ� " + service.showRpsValue(comValue)
						+ " �� �½��ϴ�.");
				String winner = service.showWinner(playerValue, comValue);
				System.out.println("\n����� " + winner);
			}
		}
		scanner.close();
	}
}
