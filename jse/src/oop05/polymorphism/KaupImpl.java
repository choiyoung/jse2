package oop05.polymorphism;

public class KaupImpl implements KaupInterface{
	int idx;
	@Override
	public String getResultMsg() {
		String msg = "";
		if(idx>30){ msg = "��";}
		else if(idx>24){ msg = "��ü��";}
		else if(idx>20){ msg = "����";}
		else if(idx>15){ msg = "��ü��";}
		else if(idx>13){ msg = "����";}
		else if(idx>10){ msg = "�������";}
		else{ msg = "�Ҹ���";}
		return msg;
	}

	@Override
	public int getKaupIndex(double height, double weight) {
		KaupVO vo = new KaupVO();
		vo.setHeight(height);
		vo.setWeight(weight);
		int idx = (int)(((vo.getWeight()/(vo.getHeight()*vo.getHeight()))*10000));
		this.idx = idx ;
		return idx;
	}
	
}
