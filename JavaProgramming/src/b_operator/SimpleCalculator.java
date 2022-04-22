package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// 두 개의 숫자와 연산자를 입력받아 연산 결과를 알려주는 프로그램을 만들어주세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 1: ");
		int num1 = Integer.parseInt(sc.nextLine());

		System.out.print("연산자: ");
		String opr = sc.nextLine();

		System.out.print("숫자 2: ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		// opr.equals("연산자") 를 boolean 로 선언해 준 다음에 식에 대입해도 좋음

		int cal = opr.equals("+") ? num1 + num2 : opr.equals("-") ? num1 - num2
				: opr.equals("*") ? num1 * num2 : opr.equals("/") ? num1 / num2
						: opr.equals("%") ? num1 % num2 : 0; // 출력해주는 값이 정수이기 때문에 int 로 선언해준다.

		System.out.println(num1 + opr + num2 + " = " + cal);
		
	}
	
}
