package factory.coffehouse;

public class CoffeeHouse {
	
	private CoffeeFactory coffeeFactory;
	private Coffee coffee;
	
	public CoffeeHouse(CoffeeFactory coffeefactory) {
		this.coffeeFactory = coffeefactory;
	}
			
	public void serve(Order order) {
		
		System.out.println("order: " + order );
		
		try {
			coffee = prepareCoffee(order);
			System.out.println("Coffee served:\n\t" + coffee.toString());
			//coffee.drink();
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage() + " hasn't been implemented yet.");
		}
		
	}
	
	private Coffee prepareCoffee(Order order) throws IllegalArgumentException {
		
		Coffee coffee = null;
		CoffeeType coffeeType = order.getCoffeeType();
		CoffeeSize coffeeSize = order.getCoffeeSize();
		
		if (coffeeType == CoffeeType.ESPRESSO) {
			coffee = coffeeFactory.prepareEspresso(coffeeSize);
		} 
		else if (coffeeType == CoffeeType.CAPPUCCINO) {
			coffee = coffeeFactory.prepareCappuccino(coffeeSize);
		}
		else if (coffeeType == CoffeeType.LATTE) {
			coffee = coffeeFactory.prepareLatte(coffeeSize);
		}
		else if (coffeeType == CoffeeType.CHEMEX) {
			coffee = coffeeFactory.prepareChemex(coffeeSize);
		}
		else throw new IllegalArgumentException(coffeeType.toString());
		
		return coffee;	
	}

}
