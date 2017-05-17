package decorator.coffee;

public class Drip extends Drink {
	
	private static String description = "Drip";
	private static double smallPrice = 4.0;
	private static double mediumPrice = 6.0;
	private static double bigPrice = 8.0;
	
	/* 'medium' description by default */
	private String sizeDescription = "medium";
	/* medium price by default */
	private double price = mediumPrice;
	/* medium size by default */
	private CoffeeSize size = CoffeeSize.MEDIUM;
	
	public Drip() {
		super.description[0] = sizeDescription;
		super.description[1] = description;
		super.size = size;
	}
	
	public Drip(CoffeeSize size) {

		this.size = size;
		
		switch(size) {
		case SMALL:
			price = smallPrice;
			sizeDescription = "small";
			break;
		case MEDIUM:
			price = mediumPrice;
			sizeDescription = "medium";
			break;
		case BIG:
			price = bigPrice;
			sizeDescription = "big";
			break;
		}
		
		super.description[0] = sizeDescription;
		super.description[1] = description;
	}
	
	public double cost() {
		return price;
	}

}
