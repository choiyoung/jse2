package oop01.Syntax;
/*
 �����ڴ� �ν��Ͻ��� �����ɶ�
 ȣ��Ǵ� '�ν��Ͻ� �ʱ�ȭ �޼���' �̴�.
 */
class MilkCoffee {
	public MilkCoffee() {
		System.out.println("���� �ִ�");
	}
	public MilkCoffee(int money) {
		this();
		System.out.println(money + "��");
	}
	public MilkCoffee(int money, boolean exist) {
		this(money);
		System.out.println("���Ű��ɿ��� : " + (exist == true ? "Ŀ����������" : "Ŀ�Ǿ���"));
	}
}
public class CoffeeB {
	/*
	 * ���� �ִ� 500�� ���Ű��ɿ��� : Ŀ������ ���� ...�����µ� �����ڸ� �ѹ��� ������.
	 */
	public static void main(String[] args) {
		
		MilkCoffee coffee = new MilkCoffee(500, true);
		// �ν��Ͻ��� ������ �ʴ� �ּҰ��� ����
		// ����(���۷���) �����̴�.
	}
}













