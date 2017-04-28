package factory.coffehouse;

public class Chemex extends Coffee {
	
	public Chemex(CoffeeSize coffeeSize) {
		this.coffeeSize = coffeeSize;
		this.coffeeType = CoffeeType.CHEMEX;
	}

}
