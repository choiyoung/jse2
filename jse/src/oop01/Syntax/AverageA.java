package oop01.Syntax;

public class AverageA {
	String name ;
	int kor ;
	int eng ;
	
	public static void main(String[] args) {
		//tot, avg ���������� �����Ͻð�
		//�Ʒ��� ���� ��µǵ��� ���ּ���.
		AverageA Hulk = new AverageA();
		Hulk.name = "��ũ";
		Hulk.kor = 100 ;
		Hulk.eng =70 ;
		int tot1 = Hulk.kor + Hulk.eng ; 
		double avg1 = tot1 /2d ;
		System.out.println("==="+Hulk.name+"�� ����ǥ===");
		System.out.println("���� : "+Hulk.kor+"��");
		System.out.println("���� : "+Hulk.eng+"��");
		System.out.println("���� : "+tot1+"��");
		System.out.println("��� : "+avg1+"��");
		System.out.println();
		
		AverageA Iron = new AverageA();
		Iron.name = "���̾�";
		Iron.kor = 68 ;
		Iron.eng =98 ;
		int tot2 = Iron.kor + Iron.eng ; 
		double avg2 = tot2 /2d ;
		System.out.println("==="+Iron.name+"�� ����ǥ===");
		System.out.println("���� : "+Iron.kor+"��");
		System.out.println("���� : "+Iron.eng+"��");
		System.out.println("���� : "+tot2+"��");
		System.out.println("��� : "+avg2+"��");
		System.out.println();
		
		AverageA Thor = new AverageA();
		Thor.name = "�丣";
		Thor.kor = 45 ;
		Thor.eng =20 ;
		int tot3 = Thor.kor + Thor.eng ; 
		double avg3 = tot3 /2d ;
		System.out.println("==="+Thor.name+"�� ����ǥ===");
		System.out.println("���� : "+Thor.kor+"��");
		System.out.println("���� : "+Thor.eng+"��");
		System.out.println("���� : "+tot3+"��");
		System.out.println("��� : "+avg3+"��");
		System.out.println();
		//���̾�
		//�丣
		
	}
}
