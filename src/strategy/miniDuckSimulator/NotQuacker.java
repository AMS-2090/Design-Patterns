package strategy.miniDuckSimulator;

public class NotQuacker implements Quackable {

	@Override
	public void quack() {
		System.out.println("<<<SILENCE>>>");
	}

}
