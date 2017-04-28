package factory.coffehouse;

public class Latte extends Coffee {

	public Latte(CoffeeSize coffeeSize) {
		this.coffeeSize = coffeeSize;
		this.coffeeType = CoffeeType.LATTE;
	}
	
}
