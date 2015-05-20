package oop02.encapsule;

public class KaupVO {
	private double height;
	private double weight;
	private int idx;
	private String msg;
	
	void No07_Kaup(double height, double weight) {
		
		setIdx(height, weight);
		setHeight(height);
		setWeight(weight);
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(double weight, double height) {
		this.idx = (int)((weight/(height*height))*10000);
	}

	void setMsg(){
		if(getIdx()>30){ this.msg = "��";}
		else if(getIdx()>24){ this.msg = "��ü��";}
		else if(getIdx()>20){ this.msg = "����";}
		else if(getIdx()>15){ this.msg = "��ü��";}
		else if(getIdx()>13){ this.msg = "����";}
		else if(getIdx()>10){ this.msg = "�������";}
		else{ this.msg = "�Ҹ���";}
	}
	public String getMsg(){
		return msg ;
	}
	@Override
	public String toString() {
		return "" + getMsg() + "\n" + "ī�������� [Ű=" + getHeight() + ", ������=" + getWeight() + ", ī��������="
				+ getIdx() + "]";
	}
}
