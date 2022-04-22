package f_game.game2;

public class Player {

	int budget = 1000;
	int id;
	int location;
	String name;
	int sum;

	Player(int id, String name) {
		this.id = id;
		this.name = name;
	}

	int dice() {

		int num1 = (int) (Math.random() * 6) + 1;
		int num2 = (int) (Math.random() * 6) + 1;
		sum = num1 + num2;
		return sum;
	}

	int location() {
		int a = sum += sum;
		if (a >= 10) {
			a %= 10;
		}
		return a;
	}

	void buyCity(City city) {
		int landPrice = city.landPrice;
		if (landPrice > budget) {
			System.out.println("돈이 부족합니다");
		} else {
			budget -= landPrice;
			city.setOwner(id);
		}
	}

	void buyHotel(City city) {
		int hotelPrice = city.hotelPrice;
		if (hotelPrice > budget) {
			System.out.println("돈이 부족합니다");
		} else {
			budget -= hotelPrice;
			city.toll += 5;
			city.setHotel(id);
			System.out.println("통행료가 " + city.toll + "로 증가했습니다");
		}
	}

	int getBudget() {
		return budget;
	}

	void setBudget(int budget) {
		this.budget = budget;
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}
}
