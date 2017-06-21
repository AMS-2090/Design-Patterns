package templatemethod;

public class CoffeeMakerTest {

	public static void main(String[] args) {
		
		EspressoMaker espressoMaker = new EspressoMaker();
		
		System.out.println("Making espresso:");
		espressoMaker.makeCoffee();
	}

}
