package oop05.polymorphism;

public class RpsServiceImpl implements RpsService{

	@Override
	public int displayComVal() {
		return (int) ((Math.random() * 3) + 1);
		
	}

	@Override
	public String showWinner(int a, int b) {
		String winner = "";
		int c = a - b ;
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

	@Override
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
