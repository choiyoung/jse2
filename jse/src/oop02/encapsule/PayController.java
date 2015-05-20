package oop02.encapsule;


import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PayService service = new PayService();
		
		String name ;
		int salary ;
		
		
		
		System.out.println("�̸��� �Է��ϼ���.");
		name = scanner.next();
		System.out.println("�޿��� �Է��ϼ���.");
		salary = scanner.nextInt();
		
		
		
		/*
		 ���� ...
		 income = salary - tax ;
		 
		 PayVO : getter, setter
		 PayService : ������
		 PayController ������ �����ϼ���.
		 �̸��� �޿��� �Է¹޾Ƽ�
		 ���� �� �� �ҵ��� ���ϴ� �����Դϴ�.
		 */
		
		System.out.println("===== �޿����� =====");
		System.out.println("���� : " + name);
		System.out.println("���� : " + salary);
		System.out.println("���� : " + service.tax(salary));
		System.out.println("�Ǽ��ɾ� : " + service.CalculateIncome(name, salary));
		scanner.close();
	}
}
