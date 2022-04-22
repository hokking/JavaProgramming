package c_statement;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int optNum1 = 0;
		int optNum2 = 0;
		int optNum3 = 0;

		while (true) {
			optNum1 = (int) (Math.random() * 10);
			optNum2 = (int) (Math.random() * 10);
			optNum3 = (int) (Math.random() * 10);

			if (!(optNum1 == optNum2 || optNum2 == optNum3 || optNum3 == optNum1)) {
				break;
			}
		}
		int count = 0;
		while (true) {
			
			int strike = 0;
			int ball = 0;
			int out = 0;

			System.out.println("숫자를 입력하세요 > ");
			int inNum1 = Integer.parseInt(sc.nextLine());
			int inNum2 = Integer.parseInt(sc.nextLine());
			int inNum3 = Integer.parseInt(sc.nextLine());

			if (inNum1 == optNum1) {
				strike++;
			} else if (inNum1 == optNum2 || inNum1 == optNum3) {
				ball++;
			}
			if (inNum2 == optNum2) {
				strike++;
			} else if (inNum2 == optNum1 || inNum2 == optNum3) {
				ball++;
			}
			if (inNum3 == optNum3) {
				strike++;
			} else if (inNum3 == optNum1 || inNum3 == optNum2) {
				ball++;
			}
			out = 3 - (strike + ball);

			count++;
			
			System.out.println(count+"번째 시도 [ Strike : " + strike + " / Ball : " + ball
					+ " / Out : " + out+" ]");

			if (strike == 3) {
				System.out.println("정답입니다.");
				System.exit(0);
			}
		}

	}

}
