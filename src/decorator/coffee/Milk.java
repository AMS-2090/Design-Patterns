package decorator.coffee;

public class Milk extends IngredientDecorator {
	
	private static double price = 1.0;
	private static String description = "milk";
	
	public Milk(Drink drink) {
		this.drink = drink;
	}
	
	public String getDescription() {
		return drink.getDescription() + " with " + description;
	}

	public double cost() {
		return drink.cost() + price;
	}
}
