package oop01.Syntax;

/*
 Date : 
 Author : 
 Desc : static ����
 */
public class CardVO {

	private String kind; // ī���� ����
	private int number; // ī���� ����
	static int width = 100; // ī���� ��
	static int height = 250; // ī���� ����

	public CardVO(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String getKind() {
		return this.kind;
	}

	public int getNumber() {
		return this.number;
	}
}