package oop01.Syntax;

public class AverageC {
	public static void main(String[] args) {
		
	AverageVO hulk = new AverageVO();
	String name = "��ũ";
	int kor = 100 ;
	int eng = 70 ;
	
	hulk.setName(name);
	hulk.setKor(kor);
	hulk.setEng(eng);
	
	System.out.println("==="+hulk.getName()+"�� ����ǥ===");
	System.out.println("���� : "+hulk.getKor()+"��");
	System.out.println("���� : "+hulk.getEng()+"��");
	System.out.println("���� : "+hulk.tot()+"��");
	System.out.println("��� : "+hulk.avg()+"��");
	System.out.println();
	}
}
