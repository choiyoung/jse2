package oop02.encapsule;

public class RpsService {
	/*
	 * ��ǻ�Ͱ� �������� �߻���Ų �� 1~3����
	 * 1. ���� 2. ����  3. ��
	 */
	public int displayComval() {
		return (int) ((Math.random() * 3) + 1);
	}

	/*
	 * ���ڸ� �����ִ� ����
	 */
	public String showWinner(int a, int b) {
		String winner = "";
		int c = a - b ;
		/*if(c == 0){
			winner = "���º� �Դϴ�.";
		}else if((Math.abs(c)) == 1){
			if(a > b){
				winner = "�÷��̾ �̰���ϴ�.";
			}else{
				winner = "��ǻ�Ͱ� �̰���ϴ�.";
			}
		}else if((Math.abs(c)) == 2){
			if(a  < b){
				winner = "��ǻ�Ͱ� �̰���ϴ�.";
			}else{
				winner = "�÷��̾ �̰���ϴ�.";
			}
		}*/
		switch (Math.abs(c)) {
		case 0:
			winner = "���º� �Դϴ�.";
			break;
		case 1:
			if(a > b){
			winner = "�÷��̾ �̰���ϴ�.";
			}else{
				winner = "��ǻ�Ͱ� �̰���ϴ�.";
			}
			break;
		case 2:
			if(a > b){
				winner = "��ǻ�Ͱ� �̰���ϴ�.";
			}else{
				winner = "�÷��̾ �̰���ϴ�.";
			}
			break;
		}
		return winner;
	}

	// ���ڿ� �Ҵ�� ����, ����, ���� ���ڷ� ��ȯ�ؼ� �����ִ� ����
	public String showRpsVal(int playerVal) {
		String rps = "";
		switch (playerVal) {
		case 1:
			rps = "����" ;
			break;
		case 2:
			rps = "����" ;
			break;
		case 3:
			rps = "��" ;
			break;
		}
		return rps;
	}

}
