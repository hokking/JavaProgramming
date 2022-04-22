package e_oop;

public class AirCon {

	int temp = 24;
	int wind = 3;
	boolean power;

	void power() {
		power = !power;
		System.out.println(power ? "전원이 켜졌습니다." : "전원이 꺼졌습니다.");
	}

	void tempUp() {
		if (power) {
			if (temp <= 30)
				temp++;
		}
		System.out.println("현재 온도 : " + temp);
	}

	void tempDown() {
		if (power) {
			if (temp >= 18)
				temp--;
		}
		System.out.println("현재 온도 : " + temp);
	}

	void changeWind() {
		if (power) {
			if (++wind > 5)
				wind = 1;
		}
		System.out.println("바람 세기 : " + wind);
	}

	public static void main(String[] args) {

		AirCon ac = new AirCon();

		while (true) {

			System.out
					.println("POWER(1) TEMP UP(2) TEMP DOWN(3) WIND(4) PROGRAM END(0)");
			int num = ScanUtil.nextInt();
			switch (num) {
			case 1:
				ac.power();
				break;
			case 2:
				ac.tempUp();
				break;
			case 3:
				ac.tempDown();
				break;
			case 4:
				ac.changeWind();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}

		}

	}
	
}
