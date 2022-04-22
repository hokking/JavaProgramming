package f_game.game;

public class Dice {

	int dice1;
	int dice2;

	Dice() {
		dice1 = (int) (Math.random() * 6)+1;
		dice2 = (int) (Math.random() * 6)+1;
	}

	int sumDice() {
		
		int sum=dice1+dice2;
		if(sum>10){
			sum%=10;
		}
		return sum;
	}

	void print() {
		System.out.println(dice1);
		System.out.println(dice2);
		System.out.println(sumDice());
	}
}
