package decorator.coffee;

public abstract class IngredientDecorator extends Drink {
	
	protected Drink drink;
	protected String[] description;
	
	public abstract String getDescription();
	
	public CoffeeSize getCoffeeSize() {
		return drink.getCoffeeSize();
	}

}
