package oop04.abstraction;

public class ProductController {
	public static void main(String[] args) {
		ComputerInfo ci = new ComputerInfo();
		ci.setComputerInfo("�Ｚ", "����", "a-1234-4567", "dual-core",
				"8G", "500GB");
		ci.displayProductInfo();
		System.out.println();
		
		TvInfo ti = new TvInfo() ;
		ti.setTvInfo("LG", "xĵ����", "x-1234", "42", "16:9");
		//set �޼ҵ� ȣ��
		// TV ������
		// ȸ�� : LG
		// ��ǰ�� : Xĵ����
		// ��ǰID : x-1234
		// ȭ������� : 42��ġ
		// ȭ����� : 16:9
		ti.displayProductInfo();
	}
}
