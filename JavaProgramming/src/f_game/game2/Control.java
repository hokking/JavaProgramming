package f_game.game2;

import e_oop.ScanUtil;

public class Control {

	Player[] p;
	City[] c;

	Control() {

		init();
	}

	void start() {
		int turn = 0;
		String input;
		int num;
		boolean game = true;
		System.out.println("===== 모두의 마블 =====");
		System.out.println("몇명이서 플레이 하시겠습니까?(2~4)>");
		int user = ScanUtil.nextInt();
		while (true) {
			game = true;
			System.out.println();
			System.out.println(p[turn].name + "님의 차례입니다.");
			System.out.println("주사위를 던져주세요.(엔터)");
			ScanUtil.nextLine();

			int diceValue = p[turn].dice();
			int locationValue = p[turn].location();
			System.out.println("주사위 합: " + diceValue);
			if (c[locationValue].getOwner() == -1) {
				System.out.println("현재위치: " + c[locationValue].getName());
				System.out.println("소유자가 없습니다. 구매하시겠습니까?");
				while (game) {

					System.out.println("1)예 2)아니오 3)정보보기");
					input = ScanUtil.nextLine();
					switch (input) {
					case "1":
						p[turn].buyCity(c[locationValue]);
						System.out.println(c[locationValue].getName()
								+ "을 구매하였습니다.");
						System.out.println("남은금액: " + p[turn].getBudget());
						game = false;
						break;
					case "2":
						System.out.println(c[locationValue].getName()
								+ "을 구매하지않았습니다.");
						game = false;
						break;
					case "3":
						c[locationValue].cityInfo();
						break;
					}

				}

			} else if (c[locationValue].getOwner() == p[turn].getId()) {
				System.out.println("현재위치: " + c[locationValue].getName());
				System.out.println("내땅입니다.");
				if (c[locationValue].getHotel() == -1) {
					System.out.println("호텔을 구매하시겠습니까?");
					System.out.println("1)예 2)아니오");
					num = ScanUtil.nextInt();
					switch (num) {
					case 1:
						p[turn].buyHotel(c[locationValue]);
						break;
					case 2:
						break;
					}
				} else {
					System.out.println("호텔을 가지고 있습니다.");
				}
			} else {
				System.out.println("현재위치: " + c[locationValue].getName());
				System.out
						.println("남의땅입니다. 통행료: " + c[locationValue].getToll());
				p[turn].budget -= c[locationValue].toll;
				System.out.println("남은금액: " + p[turn].getBudget());
			}
			if (p[turn].getBudget() < 0) {
				System.out.println(p[turn].name + "님이 파산하였습니다.");
				System.exit(0);
			}
			if (turn == 0) {
				turn++;
			} else
				turn--;

		}

	}

	void init() {

		p = new Player[2];
		p[0] = new Player(0, "User1");
		p[1] = new Player(1, "User2");

		c = new City[10];
		c[0] = new City("서울", 200, 25, 100);
		c[1] = new City("부산", 180, 30, 90);
		c[2] = new City("강릉", 200, 40, 100);
		c[3] = new City("대구", 180, 22, 90);
		c[4] = new City("대전", 130, 18, 65);
		c[5] = new City("광주", 120, 15, 60);
		c[6] = new City("경주", 220, 25, 110);
		c[7] = new City("전주", 180, 20, 90);
		c[8] = new City("제주", 250, 50, 125);
		c[9] = new City("여수", 150, 20, 75);

	}
}
