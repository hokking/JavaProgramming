package f_game.game;

import java.util.Arrays;

public class User {

	int[] getCityNum1 = new int[10];
	int[] getCityNum2 = new int[10];
	int money1 = 10000;
	int money2 = 10000;

	void getCity1(int num) {

		for (int i = 0; i < getCityNum1.length; i++) {
			if (getCityNum1[i] == 0) {
				getCityNum1[i] = num;
				break;
			}
		}
		System.out.println(Arrays.toString(getCityNum1));
	}

	void getCity2(int num) {

		for (int i = 0; i < getCityNum2.length; i++) {
			if (getCityNum2[i] == 0) {
				getCityNum2[i] = num;
				break;
			}
		}
		System.out.println(Arrays.toString(getCityNum2));
	}

	int buyCity1(int cityPrice) {
		return money1 -= cityPrice;
	}

	int buyCity2(int cityPrice) {
		return money2 -= cityPrice;
	}

	void tollCity1(int num, int citytoll) { // user1이 통행료를 받는 곳 -> user2의 순서때 확인
		for (int i = 0; i < getCityNum1.length; i++) {
			if (num == getCityNum1[i]) {
				System.out
						.println("user1의 도시입니다" + citytoll + "원의 통행료를 지불하세요.");
				money2 -= citytoll;
				System.out.println("USER2 남은 금액 : " + money2);
				getCityNum2[i]=0;

			} else if (num == getCityNum2[i]) {
				System.out.println("user1의 도시입니다");
				getCityNum1[i]=0;
			}
		}

	}

	void tollCity2(int num, int citytoll) {
		for (int i = 0; i < getCityNum2.length; i++) {
			if (num == getCityNum2[i]) {
				System.out
						.println("user2의 도시입니다" + citytoll + "원의 통행료를 지불하세요.");
				money1 -= citytoll;
				System.out.println("USER1 남은 금액 : " + money1);
				getCityNum1[i]=0;
			} else if (num == getCityNum1[i]) {
				System.out.println("user2의 도시입니다");
				getCityNum2[i]=0;
			}
		}

	}

}
