package oop01.encapsule;

import java.util.Scanner;

public class NumberMatchController {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	NumberMatchService service = new NumberMatchService();
	int su ;
	System.out.println("1���� 3���� ������ �Է�");
	su = scanner.nextInt();
	service.input(su);
	scanner.close();
	}
}
