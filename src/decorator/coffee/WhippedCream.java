package decorator.coffee;

public class WhippedCream extends IngredientDecorator {
	
	private static double price = 2.0;
	private static String description = "whipped cream";
	
	public WhippedCream(Drink drink) {
		this.drink = drink;
	}
	
	public String getDescription() {
		return drink.getDescription() + " with " + description;
	}

	public double cost() {
		return drink.cost() + price;
	}

}
