package oop01.Syntax;

public class AverageB {
	String name ;
	int kor ;
	int eng ;
	/* �޼ҵ带 ���⿡ ���� �ϼż�*/
	/* �޼ҵ��� ��üȭ�� ���ּ���*/
	int tot(){
		int tot = this.kor + this.eng ;
		return tot ;
	}
	
	double avg(){
		double avg = tot() /2d ;
		return avg ;
	}
	
	public static void main(String[] args) {
		AverageB Hulk = new AverageB();
		Hulk.name = "��ũ";
		Hulk.kor = 100 ;
		Hulk.eng = 70 ;
		
		System.out.println("==="+Hulk.name+"�� ����ǥ===");
		System.out.println("���� : "+Hulk.kor+"��");
		System.out.println("���� : "+Hulk.eng+"��");
		System.out.println("���� : "+Hulk.tot()+"��");
		System.out.println("��� : "+Hulk.avg()+"��");
		
		System.out.println();
		
	}
}
