package oop02.encapsule;

import java.util.Random;

/*
 Date : 2015.05.15 
 Author : ��â��
 Description : ���������� ���ӳ���
 1�� ������ 2�� ���� 3�� ��
 * */ 

public class GameRpsService {

	/*
	 ���ڰ��� ���� ����, ����, �� ���� ����  
	 * */
	public String showRpsValue(int playerValue) {
		String result = null;
		switch (playerValue) {
		case 1: 
			result = "����" ;
			break;
		case 2: 
			result = "����" ;
			break;
		case 3:
			result = "��" ;
			break;

		}
		return result ;
	}

	public int displayComValue() {
		return (int)((Math.random()*3)+1);
	}

	public String showWinner(int playerValue, int comValue) {
		String msg =null;
		
		if(playerValue > comValue){
			msg = "�̰���ϴ�!!";
		}else if(playerValue < comValue){
			msg = "�����ϴ�...";
		}else{
			msg = "�����ϴ�.";
		}
		return msg;
	}

	public void msg(int playerValue) {
		String msg ;
	msg = "0~3���� ���� �Է��Ͻÿ�";
		System.out.println(msg);
	}

} 
