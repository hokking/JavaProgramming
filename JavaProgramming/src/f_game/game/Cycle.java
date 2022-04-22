package f_game.game;

import e_oop.ScanUtil;

public class Cycle {

	public static void main(String[] args) {

		City[] c = new City[10];
		User u = new User();
		int turn = 0;

		boolean game = true;
		boolean ask = true;

		String[] cityName = { "서울", "부산", "강릉", "대구", "대전", "광주", "경주", "전주",
				"제주", "여수" };
		while (game) {
			for (int i = 0; i < c.length; i++) {
				c[i] = new City();
				c[i].cityName = cityName[i];
				c[i].infoCityPrice();
				c[i].infoCityToll();
			}

			ask = true;
			System.out.println("주사위 돌리기(1)");
			int num = ScanUtil.nextInt();
			Dice d = new Dice();
			if (turn == 0) {
				u.tollCity2(d.sumDice(), c[d.sumDice()].cityToll);

			} else {
				u.tollCity1(d.sumDice(), c[d.sumDice()].cityToll);

			}

			// 중복값이 있을때 출력하고 순서를 바꿔줌
			System.out.println(d.dice1 + "|" + d.dice2 + " " + d.sumDice()
					+ "만큼 이동합니다.");

			while (ask) {
				if (num == 1) {
					System.out.println(c[d.sumDice()].cityName + "을 구매하시겠습니까?");
					System.out.println("예(1) 아니요(2) 정보보기(3)");

				}
				int num1 = ScanUtil.nextInt();

				switch (num1) {

				case 1:
					if (turn == 0) {
						u.getCity1(d.sumDice());
						u.buyCity1(c[d.sumDice()].cityPrice);
						System.out.println("USER1이 " + c[d.sumDice()].cityName
								+ "을 구매하였습니다.");
						System.out.println("USER1 남은금액 : " + u.money1);
						turn++;
					} else {
						u.getCity2(d.sumDice());
						u.buyCity2(c[d.sumDice()].cityPrice);
						System.out.println("USER2이 " + c[d.sumDice()].cityName
								+ "을 구매하였습니다.");
						System.out.println("USER2 남은금액 : " + u.money2);
						turn--;
					}
					ask = false;
					break;
				case 2:

					if (turn == 0) {
						System.out.println("USER1이 " + c[d.sumDice()].cityName
								+ "을 구매하지 않았습니다.");
						turn++;
					} else {
						System.out.println("USER2가 " + c[d.sumDice()].cityName
								+ "을 구매하지 않았습니다.");
						turn--;
					}
					ask = false;
					break;
				case 3:
					System.out.println(c[d.sumDice()].cityInfo());
					// 다시 묻는 곳으로 돌아가야 한다.
					break;
				}
			}
		}
	}
}
