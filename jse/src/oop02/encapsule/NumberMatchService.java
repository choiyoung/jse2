package oop02.encapsule;

public class NumberMatchService {
	NumberMatchVO number = new NumberMatchVO();
	
	void input(int input) {
		int result = 0;
		try {
			number.setPlayer(input);
		} catch (Exception e) {
			System.out.println("���ڴ� �ȵ˴ϴ�.");
		}
		if (number.getPlayer() == 0) {
			System.out.println("�ٽ� �Է��� �ֽʽÿ�.");
		} else {
			number.setCom();
			result = game(number.getCom(), number.getPlayer());
		}
		if (result == 1) {
			System.out.println("������ϴ�.");
			System.out.println("������ �����մϴ�.");
		}
	}
	public int game(int com, int player) {
		int result;
		if (number.getPlayer() == number.getCom()) {
			System.out.println(number.getPlayer() + "����!!");
			result = 1;
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("��ǻ�Ͱ� ������ ���� " + number.getCom() + " �Դϴ�.");
			System.out.println("������ �����մϴ�.");
			result = 0;
		}
		return result;
	}
}
