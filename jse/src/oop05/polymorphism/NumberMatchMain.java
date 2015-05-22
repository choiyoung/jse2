package oop05.polymorphism;

import java.util.Scanner;

public class NumberMatchMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumberMatchService numbermatch = new ServiceImpl();
		System.out.println("���� 1�Ǵ� 2�� �Է��ϼ���.");
		int player = scanner.nextInt();
		int comval = numbermatch.makeComVal();
		numbermatch.match(player, comval);
		System.out.println(numbermatch.display());
		scanner.close();
	}
}
