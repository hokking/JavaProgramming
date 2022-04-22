package g_oop2;

public class Store {

	public static void main(String[] args) {

		Desktop d = new Desktop();
		AirCon ac = new AirCon();
		TV tv = new TV();

		Customer c = new Customer();
		
		c.buy(d);
		c.buy(ac);
		c.buy(tv);
		
	}

}

class Product {
	String name;
	int price;

	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	String getInfo() {
		return name + "(" + price + "원)";
	}
}

class Desktop extends Product {

	Desktop() {
		super("삼성 컴퓨터", 1000000);

	}

	void programming() {
		System.out.println("프로그램을 만듭니다.");
	}
}

class AirCon extends Product {
	AirCon() {
		super("LG 에어컨", 2000000);
	}

	void setTemperature() {
		System.out.println("온도를 설정합니다.");
	}

}

class TV extends Product {
	TV() {
		super("LG TV", 3000000);
	}

	void setChannel() {
		System.out.println("채널을 변경합니다.");
	}
}

class Customer {
	int money = 100000000;

	Product[] item = new Product[10];

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔돈이 부족합니다");
			return;
		}
		money -= p.price;

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null) {
				item[i] = p;
				break;
			}
		}
		System.out.println(p.getInfo() + "를 구매했습니다.");
	}

}
