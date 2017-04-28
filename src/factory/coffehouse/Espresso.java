package factory.coffehouse;

public class Espresso extends Coffee {
	
	public Espresso(CoffeeSize coffeeSize) {
		this.coffeeSize = coffeeSize;
		this.coffeeType = CoffeeType.ESPRESSO;
	}

}
