package oop01.Syntax;

public class AverageD {
	public static void main(String[] args) {
		AverageService hulk = new AverageService();
		String name = "��ũ";
		int kor = 100 ;
		int eng = 75 ;
		hulk.setUser(name, kor, eng);
		
		System.out.println("==="+name+"�� ����ǥ===");
		System.out.println("���� : "+kor+"��");
		System.out.println("���� : "+eng+"��");
		System.out.println("���� : "+hulk.tot()+"��");
		System.out.println("��� : "+hulk.avg()+"��");
		System.out.println();
		}
	}

