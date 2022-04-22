package f_game.game2;

public class City {
	
	int owner = -1;
	int hotelOwner=-1;
	String name;
	int landPrice;
	int toll;
	int hotelPrice;

	City(String name, int landPrice, int toll, int hotelPrice) {
		this.name = name;
		this.landPrice = landPrice;
		this.toll = toll;
		this.hotelPrice=hotelPrice;
	}

	int getOwner() {
		return owner;
	}

	void setOwner(int owner) {
		this.owner = owner;
	}

	String getName() {
		return name;
	}

	int getLandPrice() {
		return landPrice;
	}

	int getToll() {
		return toll;
	}
	
	int getHotelPrice(){
		return hotelPrice;
	}
	
	int getHotel(){
		return hotelOwner;
	}
	
	void setHotel(int owner){
		this.hotelOwner=owner;
	}

	void cityInfo() {
		System.out.println("==========================");
		System.out.println("---------- " +getName() + " ------------");
		System.out.println("도시가격 : " + landPrice);
		System.out.println("통행료 : " + toll);
		System.out.println("==========================");
	}
}
