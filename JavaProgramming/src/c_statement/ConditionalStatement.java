package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {

		// 조건문
		// - if문
		// - switch문

		// if문
		// - if(조건식){} : 조건식의 결과가 true 이면 블럭안의 문장을 수행한다.
		// - else if(조건식){} : 다수의 조건이 필요할 때 if 뒤에 추가한다.
		// - else{} : 조건식 이외의 경우를 위해 추가한다.

		// int a = 9;
		//
		// if (a == 1) {
		// System.out.println("a == 1");
		// } else if (a == 2) {
		// System.out.println("a == 2");
		// } else if (a == 3) {
		// System.out.println("a == 3");
		// } else {
		// System.out.println("else");
		// }
		//
		// if (a < 10) {
		// System.out.println("a가 10보다 작다.");
		// } else if (a < 20) {
		// System.out.println("a가 20보다 작다.");
		// }

		// 점수가 60점 이상이면 합격 그렇지 않으면 불합격

		// int score = 80;
		//
		// if (score >= 60) {
		// System.out.println("합격");
		// } else
		// System.out.println("불합격");

		// 점수에 등급을 부여하는 프로그램

		// score = 80;
		// String grade = null;
		//
		// if (90 <= score && score <= 100) {
		// grade = "A";
		// } else if (80 <= score) {
		// grade = "B";
		// } else if (70 <= score) {
		// grade = "C";
		// } else if (60 <= score) {
		// grade = "D";
		// } else {
		// grade = "F";
		// }
		//
		// System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");
		//
		// score = 44;
		// grade = null;
		//
		// if (90 <= score && score <= 100) {
		// grade = "A";
		// if (score >= 97) {
		// grade += "+";
		// } else if (score <= 93) {
		// grade += "-";
		// }
		// } else if (score >= 80) {
		// grade = "B";
		// if (score >= 87) {
		// grade += "+";
		// } else if (score <= 83) {
		// grade += "-";
		// }
		// } else if (score >= 70) {
		// grade = "C";
		// if (score >= 77) {
		// grade += "+";
		// } else if (score <= 73) {
		// grade += "-";
		// }
		// } else if (score >= 60) {
		// grade = "D";
		// if (score >= 67) {
		// grade += "+";
		// } else if (score <= 63) {
		// grade += "-";
		// }
		// } else {
		// grade = "F";
		// }
		//
		// System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");

		// 정렬 : ctrl + shift + f

		// switch문
		// - switch(int/String){case1 : break;}
		// - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		// - 조건식과 일치하는 case문 이후의 문장을 수행한다.

		// a = 20;
		//
		// switch (a) {
		// case 10:
		// System.out.println("a == 0");
		// break; // 반드시 넣어 주어야 한다.
		// case 20:
		// System.out.println("a == 2");
		// break;
		//
		// default:
		// System.out.println("default");
		// break;
		// }

		// 주어진 월에 해당하는 계절을 출력해봅시다.

		// int month = 1;
		// String season = null;
		//
		// switch (month) {
		// case 3:
		// case 4:
		// case 5:
		// season = "봄";
		// break;
		// case 6:
		// case 7:
		// case 8:
		// season = "여름";
		// break;
		// case 9:
		// case 10:
		// case 11:
		// season = "가을";
		// break;
		// case 12:
		// case 1:
		// case 2:
		// season = "겨울";
		// break;
		// }
		//
		// System.out.println(month + "월에 해당하는 계절은 " + season + "입니다.");
		//
		// score = 52;
		// grade = null;
		//
		// switch (score / 10) {
		// case 10:
		// case 9:
		// grade = "A";
		// break;
		// case 8:
		// grade = "B";
		// break;
		// case 7:
		// grade = "C";
		// break;
		// case 6:
		// grade = "D";
		// break;
		// default:
		// grade = "F";
		// break;
		// }
		//
		// System.out.println(score + "점은 " + grade + "등급 입니다.");

		// 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.

		Scanner sc = new Scanner(System.in);

		// System.out.print("숫자 > ");
		// int num = Integer.parseInt(sc.nextLine());
		//
		// switch (num) {
		// case 0:
		// System.out.println("0 입니다.");
		// break;
		// default:
		// System.out.println("0이 아닙니다.");
		// break;
		// }

		// 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.

		// System.out.print("숫자 > ");
		// int num1 = Integer.parseInt(sc.nextLine());
		//
		// if (num1 % 2 == 1) {
		// System.out.println("홀수입니다.");
		// } else
		// System.out.println("짝수입니다.");

		// 점수 3개를 입력받아 합계, 평균 , 등급을 출력해주세요.

		// System.out.println("숫자 3개 > ");
		// int a = Integer.parseInt(sc.nextLine());
		// int b = Integer.parseInt(sc.nextLine());
		// int c = Integer.parseInt(sc.nextLine());
		//
		// int sum = a + b + c;
		// double avg = Math.round(sum / 3.0 * 10) / 10.0;
		// String lev = null; // null : 참조형 타입의 기본값

		// 기본값
		// boolean = false
		// 나머지 = 0

		// if (avg >= 90 && avg == 100) {
		// lev = "A";
		// } else if (avg >= 80) {
		// lev = "B";
		// } else if (avg >= 70) {
		// lev = "C";
		// } else if (avg >= 60) {
		// lev = "D";
		// } else
		// lev = "F";
		//
		// System.out.println("점수의 합계 : " + sum + ", 평균 : " + avg + ", 등급 : "
		// + lev + "입니다.");

		// 1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.

		int rd1 = (int) (Math.random() * 100 + 1);
		int rd2 = (int) (Math.random() * 100 + 1);
		int rd3 = (int) (Math.random() * 100 + 1);

		if (rd1 > rd2) {
			int temp = rd1;
			rd1 = rd2;
			rd2 = temp;
		}
		if (rd1 > rd3) {
			int temp = rd1;
			rd1 = rd3;
			rd3 = temp;

		}
		if (rd2 > rd3) {
			int temp = rd2;
			rd2 = rd3;
			rd3 = temp;
		}

		// if문 안에서 변수를 선언해서 값을 넣어줄 수 있도록 한다.
		
		System.out.println(rd1 + " < " + rd2 + "  < " + rd3);
		// if (random1 <= random2) {
		// if (random1 <= random3) {
		// if (random2 <= random3) {
		// System.out.println(random1 + " " + random2 + " " + random3);
		// } else
		// System.out.println(random1 + " " + random3 + " " + random2);
		// } else {
		// if (random1 <= random2) {
		// System.out.println(random3 + " " + random1 + " " + random2);
		// } else
		// System.out.println(random3 + " " + random2 + " " + random1);
		// }
		// } else {
		// if (random1 <= random3) {
		// System.out.println(random2 + " " + random1 + " " + random3);
		// } else
		// System.out.println(random2 + " " + random3 + " " + random1);
		// }

	}

}
