package strategy.miniDuckSimulator;

public class NotFlyer implements Flyable{

	public void fly() {
		System.out.println("I cannot fly!");
	}
}
