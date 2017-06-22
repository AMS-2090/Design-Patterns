package templatemethod;

public class CoffeeMakerTest {

	public static void main(String[] args) {
		
		EspressoMaker espressoMaker = new EspressoMaker();
		CappuccinoMaker cappuccinoMaker = new CappuccinoMaker();
		AeropressMaker aeropressMaker = new AeropressMaker();
		CaramelMacchiatoMaker caramelMacchiatoMaker = new CaramelMacchiatoMaker();
		
		System.out.println("Making espresso:");
		espressoMaker.makeCoffee();
		System.out.println("------------------");
		System.out.println("Making cappuccino:");
		cappuccinoMaker.makeCoffee();
		System.out.println("------------------");
		System.out.println("Making aeropress:");
		aeropressMaker.makeCoffee();
		System.out.println("------------------");
		System.out.println("Making caramel macchiato:");
		caramelMacchiatoMaker.makeCoffee();
	}

}
