package decorator.coffee;

public abstract class Drink {
	
	protected CoffeeSize size;
	protected String[] description = {"a", "drink"};
	
	public String getDescription() {
		return description[0] + " " + description[1];
	}
	
	public void setCoffeeSize(CoffeeSize size) {
		this.size = size;
	}
	
	public CoffeeSize getCoffeeSize() {
		return this.size;
	}
	
	public abstract double cost();
	
	
}
