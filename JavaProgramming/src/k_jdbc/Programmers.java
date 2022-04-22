package k_jdbc;

import e_oop.ScanUtil;

public class Programmers {

	public static void main(String[] args) {

		boolean answer = true;
		int count = 0;
		int num = 0;

		System.out.println("숫자를 입력하세요 > ");
		int x = ScanUtil.nextInt();
		int x1 = x;
		int x2 = x;
		while (true) {
			x1 /= 10;
			count++;
			if (x1 == 1)
				break;
		}
		System.out.println(count);
		for (int i = 0; i < count + 1; i++) {
			num += x2 % 10;
			x2 /= 10;
			System.out.println(num + " " + x2);
		}
		System.out.println(x);
		if (x % num == 0) {
			answer = true;
		} else {
			answer = false;
		}

		System.out.println(answer);
	}
}
