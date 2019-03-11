package chapter9;

public class GameFactory implements PlayFactory {

	@Override
	public void getPlay(Play play) {
		play.game();
	}

}
