package strategy.duck;

public class NotFlyer implements Flyable{

	public void fly() {
		System.out.println("I cannot fly!");
	}
}
