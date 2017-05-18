package decorator.coffee;

public abstract class IngredientDecorator extends Drink {
	
	protected Drink drink;
	
	public abstract String getDescription();
	
	public CoffeeSize getCoffeeSize() {
		return drink.getCoffeeSize();
	}

}
