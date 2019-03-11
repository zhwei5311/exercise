package chapter9;

public class PlayGame {
	public static void main(String[] args) {
		PlayCoin playCoin = new PlayCoin();
		Dice dice = new Dice();
		GameFactory factory = new GameFactory();
		factory.getPlay(playCoin);
		factory.getPlay(dice);
	}
}
