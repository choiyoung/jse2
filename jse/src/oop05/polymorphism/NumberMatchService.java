package oop05.polymorphism;

public interface NumberMatchService {
	/*
	��ǻ�Ͱ� �������� �����ϴ� ����
	0�� 1�� �߻���Ŵ
	*/
	public int makeComVal();
	
	/*
	�ΰ��� �Ķ���͸� ���ؼ� ��ġ�ϸ� true
	�ٸ��� false ����
	*/
	public boolean match(int player, int comval);
	
	/*
	makeComVal() �� ���ϰ��� true �� �÷��̾� �¸�
	�ٸ��� ��ǻ�� �¸���� �޽��� ���
	 */
	public String display();
}
