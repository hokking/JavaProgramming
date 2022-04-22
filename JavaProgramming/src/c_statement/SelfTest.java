package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		// 탄수화물 중독 자가진단 테스트
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String chk=null;
		
		
		System.out.println("============ 탄수화물 중독 자가 진단 ============");
		System.out.println("(다음 항목에 해당하는 경우 \"o\", 해당하지 않는 경우 \"x\"를 입력해주세요.)");

		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다 ");
		chk = sc.nextLine();
		if (chk.equals("o"))
			i++;
		System.out.print("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다 ");
		chk = sc.nextLine();
		if (chk.equals("o"))
			i++;
		System.out.print("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다 ");
		chk = sc.nextLine();
		if (chk.equals("o"))
			i++;
		System.out.print("정말 배고프지 않더라도 먹을 때가 있다 ");
		chk = sc.nextLine();
		if (chk.equals("o"))
			i++;
		System.out.print("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다 ");
		chk = sc.nextLine();
		if (chk.equals("o"))
			i++;
		System.out.print("스트레스를 받으면 자꾸 먹고 싶어진다 ");
		chk = sc.nextLine();
		if (chk.equals("o"))
			i++;
		System.out.print("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다 ");
		chk = sc.nextLine();
		if (chk.equals("o"))
			i++;
		System.out.print("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다 ");
		chk = sc.nextLine();
		if (chk.equals("o"))
			i++;
		System.out.print("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다 ");
		chk = sc.nextLine();
		if (chk.equals("o"))
			i++;
		System.out.print("다이어트를 위해 식이조절을 하는데 3일도 못간다 ");
		chk = sc.nextLine();
		if (chk.equals("o"))
			i++;

		if (i >= 7) {
			System.out.println("중독!");
		} else if (i >= 4) {
			System.out.println("위험!");
		} else if (i == 3) {
			System.out.println("주의!");
		}else
			System.out.println("안전!");

	}

}
