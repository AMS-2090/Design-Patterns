package decorator.coffee;

public class CoffeeShop {

	public static void main(String[] args) {
		
		/* pure Espresso */
		Drink espresso = new Espresso();
		System.out.println(espresso.getDescription());
		System.out.println("price: " + espresso.cost() + "\n");
		
		/* add Chocolate */
		espresso = new Chocolate(espresso);
		System.out.println(espresso.getDescription());
		System.out.println("price: " + espresso.cost() + "\n");

		/* add Milk */
		espresso = new Milk(espresso);
		System.out.println(espresso.getDescription());
		System.out.println("price: " + espresso.cost() + "\n");
		
		/* ************************************************ */
		
		/* pure Drip */
		Drink drip = new Drip();
		System.out.println(drip.getDescription());
		System.out.println("price: " + drip.cost() + "\n");

		/* add Milk */
		drip = new Milk(drip);
		System.out.println(drip.getDescription());
		System.out.println("price: " + drip.cost() + "\n");

		/* ************************************************ */
		
		/* pure Aeropress */
		Drink aeropress = new Aeropress(CoffeeSize.MEDIUM);
		System.out.println(aeropress.getDescription());
		System.out.println("price: " + aeropress.cost() + "\n");

		/* add Whipped Cream */
		aeropress = new WhippedCream(aeropress);
		System.out.println(aeropress.getDescription());
		System.out.println("price: " + aeropress.cost() + "\n");
		
		/* ************************************************ */
		
		/* pure Espresso medium size */
		Drink espressoMedium = new Espresso(CoffeeSize.MEDIUM);
		System.out.println(espressoMedium.getDescription());
		System.out.println("price: " + espressoMedium.cost() + "\n");
		
		/* add Whipped Cream */
		espressoMedium = new WhippedCream(espressoMedium);
		System.out.println(espressoMedium.getDescription());
		System.out.println("price: " + espressoMedium.cost() + "\n");
		
		/* add Chocolate */
		espressoMedium = new Chocolate(espressoMedium);
		System.out.println(espressoMedium.getDescription());
		System.out.println("price: " + espressoMedium.cost() + "\n");
		
	}

}
