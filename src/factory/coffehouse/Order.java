package factory.coffehouse;

public class Order {
	private CoffeeType coffeeType;
	private CoffeeSize coffeeSize;
	
	public Order(CoffeeType coffeeType, 
				CoffeeSize coffeeSize) {
		
		this.coffeeType = coffeeType;
		this.coffeeSize = coffeeSize;
	}
	
	public CoffeeType getCoffeeType() {
		return coffeeType;
	}
	
	public CoffeeSize getCoffeeSize() {
		return coffeeSize;
	}

	public void setCoffeeType(CoffeeType coffeeType) {
		this.coffeeType = coffeeType;
	}

	public void setCoffeeSize(CoffeeSize coffeeSize) {
		this.coffeeSize = coffeeSize;
	}
	
	public String toString() {
		return new String(coffeeSize + " " + coffeeType);
	}
	
	
}
