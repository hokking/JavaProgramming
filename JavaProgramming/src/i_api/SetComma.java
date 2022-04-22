package i_api;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {

		// 숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		// 123,456,789

		// System.out.println("숫자를 입력해주세요>");
		// String number = ScanUtil.nextLine();
		// String number2 = "";
		// int count = 0;
		//
		// for (int i = number.length() - 1; i >= 0; i--) {
		// number2 = number.charAt(i) + number2;
		// count++;
		// if (count % 3 == 0 && count != number.length()) {
		// number2 = "," + number2;
		// }
		// }
		// System.out.println(number2);

		System.out.println("숫자를 입력해주세요>");
		String number = ScanUtil.nextLine();
		String number2 = "";
		int count = 0;
		for (int i = number.length() - 1; i >= 0; i--) {
			number2 = number.charAt(i) + number2;
			count++;
			if (count % 3 == 0 && i != 0) {
				number2 = "," + number2;
			}
		}
		System.out.println(number2);
	}
}
