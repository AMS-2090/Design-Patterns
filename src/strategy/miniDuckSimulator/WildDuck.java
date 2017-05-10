package strategy.miniDuckSimulator;

public class WildDuck extends Duck {

	public WildDuck() {
		flyInterface = new Flyer();
		quackInterface = new Quacker();
	}
	
	public void show() {
		System.out.println("I am the real Wild Duck!");
	}
}
