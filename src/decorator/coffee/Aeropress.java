package decorator.coffee;

public class Aeropress extends Drink {

	private static String description = "Aeropress";
	private static double smallPrice = 6.0;
	private static double mediumPrice = 7.0;
	private static double bigPrice = 8.0;
	
	/* 'small' description by default */
	private String sizeDescription = "small";
	/* small price by default */
	private double price = smallPrice;
	/* small size by default */
	private CoffeeSize defaultSize = CoffeeSize.SMALL;
	
	public Aeropress() {
		super.description[0] = sizeDescription;
		super.description[1] = description;
		super.size = defaultSize;
	}
	
	public Aeropress(CoffeeSize size) {
		super.size = size;
		
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
