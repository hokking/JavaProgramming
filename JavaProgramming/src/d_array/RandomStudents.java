package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {

		// 402호 전체 학생들 중 사용자가 입력한 숫자만큼 랜덤으로 학생을 뽑는 프로그램을 만들어주세요.

		Scanner sc = new Scanner(System.in);

		String[] students = { "강나영", "강동환", "강태영", "곽지훈", "김서윤", "김영훈", "김진석",
				"김충신", "박슬기", "박채린", "손영태", "손영흔", "안정연", "이선우", "이수보", "이주홍",
				"이중호", "임현정", "장유진", "정신애", "조수경", "조하영", "조혜민", "허민정", "박지은" };
		// while (true) {
		// String temp;
		//
		// for (int i = 0; i < students.length; i++) {
		// int random = (int) (Math.random() * 25);
		// temp = students[random];
		// students[random] = students[i];
		// students[i] = temp;
		// }
		//
		// System.out.print("숫자를 입력하세요 > ");
		// int input = Integer.parseInt(sc.nextLine());
		//
		// for (int i = 0; i < input; i++) {
		//
		// System.out.print(students[i] + "\t");
		//
		// }
		// System.out.println();
		// }

		System.out.print("숫자를 입력하세요 > ");
		int input = Integer.parseInt(sc.nextLine());

		String[] pick = new String[input]; // 뽑은 사람을 저장할 배열
		int count = 0; // 현재 뽑은 사람 수

		do {
			int random = (int) (Math.random() * students.length);

			boolean flag = true;
			for (int i = 0; i < pick.length; i++) {
				if (students[random].equals(pick[i])) {
					flag = false;
				}
			}

			if (flag) {
				pick[count++] = students[random]; // false면 count++이 되지 않기 때문에 input값보다 작아서 다시 실행
			}
		} while (count < input);
		System.out.println(Arrays.toString(pick));

	}
}
