package oop01.Syntax;

public class CardMain {
	public static void main(String[] args) {

		CardVO player = new CardVO("��Ʈ", 3);
		CardVO computer = new CardVO("�����̵�", 5);
		System.out.println("ī�� ���� : " + CardVO.height);
		System.out.println("ī�� �ʺ� : " + CardVO.width);

		// �ν��Ͻ� �����ϼż� �Ʒ� ���ó��
		// ��µǵ��� ���ּ���

		System.out.println("�÷��̾�� " + player.getKind() + player.getNumber()
				+ " �̰�");
		System.out.println("��ǻ�ʹ� " + computer.getKind() + computer.getNumber()
				+ " ��" + " ��ǻ�Ͱ� �̰���ϴ�.");
		// haert, spade
	}
}
