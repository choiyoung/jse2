package oop01.Syntax;

public class AverageE {
	public static void main(String[] args) {

		String name = "��ũ";
		int kor = 100 ;
		int eng = 75 ;
		AverageEVO hulk = new AverageEVO(name, kor, eng);

		System.out.println("==="+name+"�� ����ǥ===");
		System.out.println("���� : "+kor+"��");
		System.out.println("���� : "+eng+"��");
		System.out.println("���� : "+hulk.tot()+"��");
		System.out.println("��� : "+hulk.avg()+"��");
		System.out.println();
	}
}
