package oop01.Syntax;

public class Pay {
	String name ;
	int salary ;
	static final double TAX = 0.1 ;
	
	public static void main(String[] args) {
		
		
		
		Pay p = new Pay();
		p.salary = 300 ;
		p.name = "��ũ";
		System.out.println("==="+ p.name +"�� 5���� �Ǳ޿��� "+(int)(p.salary*(1-TAX))+"���� �Դϴ�.");
		p.salary = 500 ;
		p.name = "���̾��";
		System.out.println("==="+ p.name +"�� 5���� �Ǳ޿��� "+(int)(p.salary*(1-TAX))+"���� �Դϴ�.");
		p.salary = 100 ;
		p.name = "�丣";
		System.out.println("==="+ p.name +"�� 5���� �Ǳ޿��� "+(int)(p.salary*(1-TAX))+"���� �Դϴ�.");
		
	}
}
