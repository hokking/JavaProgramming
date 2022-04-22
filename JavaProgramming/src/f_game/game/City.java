package f_game.game;

public class City {

	String cityName;
	int cityToll;
	int cityPrice;

	void infoCityPrice() {

		cityPrice = (int) (Math.random() * 900)+100;

	}

	void infoCityToll() {

		cityToll = (int) (Math.random() * 90)+10;

	}

	String cityInfo() {
		return "==========================\n" + "---------- " + cityName
				+ " ------------\n" + "도시가격 : " + cityPrice + "\n통행료 : "
				+ cityToll + "\n==========================";

	}

}
