package factory.coffehouse;

public interface CoffeeFactory {
	
	public Coffee prepareEspresso(CoffeeSize coffeeSize);
	public Coffee prepareCappuccino(CoffeeSize coffeeSize);
	public Coffee prepareLatte(CoffeeSize coffeeSize);
	
	public Coffee prepareChemex(CoffeeSize coffeeSize);
	
}
