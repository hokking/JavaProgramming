package a_variable;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {

		// * 다음과 같은 프로그램을 만들어주세요.
		// *
		// * =========== 회원가입 ===========
		// * 아이디 > admin
		// * 비밀번호(4자리 숫자) > 1234
		// * 이름 > 홍길동
		// * 나이 > 99
		// * 키 > 185.5
		// * =============================
		// * 회원가입 완료!!
		// * =========== 내 정보 ============
		// * 아이디 : admin
		// * 비밀번호 : 1234
		// * 이름 : 홍길동
		// * 나이 : 99세
		// * 키 : 185.5cm
		// * =============================

		Scanner sc = new Scanner(System.in);

		System.out.println("=========== 회원가입 ===========");
		System.out.print("아이디 >");
		String myId = sc.nextLine();

		System.out.print("비밀번호(4자리 숫자) >");
		String myPaw = sc.nextLine();

		System.out.print("이름 >");
		String myName = sc.nextLine();

		// 다른 곳에 커서를 두고 한글을 입력할 경우 잘못된 값이 입력이 된다.
		
		System.out.print("나이 >");
		String myAge = sc.nextLine();

		System.out.print("키 >");
		double myHih = Double.parseDouble(sc.nextLine());
		System.out.println("=============================");

		System.out.println("회원가입 완료!!");

		System.out.println("=========== 내 정보 ============");
		System.out.println("아이디 : " + myId);
		System.out.println("비밀번호 : " + myPaw);
		System.out.println("이름 : " + myName);
		System.out.println("나이 : " + myAge);
		System.out.println("키 : " + myHih + "cm");
		System.out.println("=============================");


		
	}

}
