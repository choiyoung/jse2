package oop01.Syntax;

public class AverageService {
	//VO�� �ִ� avg(), tot()�޼ҵ带
	// ����
	AverageDVO vo = new AverageDVO();
	public void setUser(String name, int kor, int eng) {
		vo.setName(name);
		vo.setKor(kor);
		vo.setEng(eng);
	}
	public int tot(){
		int tot = vo.getKor() + vo.getEng() ;
		return tot ;
	}
	public double avg(){
		double avg = tot() / 2d ;
		return avg ;
	}
	
}
