package strategy.miniDuckSimulator;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyInterface = new NotFlyer();
		quackInterface = new Quacker();
	}
	
	public void show() {
		System.out.println("I am a Rubber Duck!");
	}

}
