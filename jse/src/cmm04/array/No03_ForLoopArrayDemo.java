package cmm04.array;

import java.util.Scanner;

public class No03_ForLoopArrayDemo {
	public static void main(String[] args) {
		// 1���� 5������ ���� ���ϼ���.
		No03_ForLoopArrayVO arrayVO = new No03_ForLoopArrayVO();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ټ����� ���ڸ� �Է��ϼ���.");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		
		arrayVO.forLoopArrayVO(a,b,c,d,e);
		
	}
}
