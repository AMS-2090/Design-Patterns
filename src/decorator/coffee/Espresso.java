package decorator.coffee;

public class Espresso extends Drink {
	
	private static String description = "Espresso";
	private static double smallPrice = 4.0;
	private static double mediumPrice = 6.0;
	private static double bigPrice = 8.0;
	
	/* 'small' description by default */
	private String sizeDescription = "small";
	/* price is small by default */
	private double price = smallPrice;
	/* Espresso is small by default */
	private CoffeeSize size = CoffeeSize.SMALL; 
	
	public Espresso() {
		super.description[0] = sizeDescription;
		super.description[1] = description;
		super.size = size;
	}
	
	public Espresso(CoffeeSize size) {
		
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
