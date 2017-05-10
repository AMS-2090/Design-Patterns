package strategy.miniDuckSimulator;

public class SqueakyDuck extends Duck {

	public SqueakyDuck() {
		flyInterface = new Flyer();
		quackInterface = new Squeaker();
	}
	
	@Override
	public void show() {
		System.out.println("I am a Squeaky Duck!");
	}

}
