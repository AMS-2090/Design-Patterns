package factory.coffehouse;

public class Cappuccino extends Coffee {
	
	public Cappuccino(CoffeeSize coffeeSize) {
		this.coffeeSize = coffeeSize;
		this.coffeeType = CoffeeType.CAPPUCCINO;
	}
}
