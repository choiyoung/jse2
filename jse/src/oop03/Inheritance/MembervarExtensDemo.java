package oop03.Inheritance;
class Car{
	String name = "�ڵ���";
}
class HCar extends Car{
	String brand = "����";
}

public class MembervarExtensDemo {
	public static void main(String[] args) {
		HCar h = new HCar();
		System.out.println(h.brand+"\t");
		System.out.println(h.name);
	}
}
