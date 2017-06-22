package templatemethod;

public class CaramelMacchiatoMaker extends CoffeeMaker {

	@Override
	protected void grindBeans() {
		System.out.println("'Fine' size beans grinding...");
	}

	@Override
	protected void brew() {
		System.out.println("27 seconds of brewing...");
	}

	@Override
	protected boolean withIngredients() {
		return true;
	}

	@Override
	protected void addIngredients() {
		System.out.println("Adding vanilla syrup...");
		System.out.println("Adding steamed milk...");
		System.out.println("Adding caramel on the top...");
	}

}
