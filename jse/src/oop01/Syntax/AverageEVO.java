package oop01.Syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	// getter setter �� ������� ���ð�
	// �����ڷ� ó�����ּ���
	// ��, avg() tot()�� �ۼ����ּ���
	public AverageEVO(){} //������ ������ �����ۼ�
	
	
	public AverageEVO(String name, int kor, int eng){
		this.name = name ;
		this.kor = kor ;
		this.eng = eng ;
	}
	int tot(){
		return this.kor + this.eng ;
	}
	double avg(){
		return tot() /2d;
	}
}
