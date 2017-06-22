package templatemethod;

public class CappuccinoMaker extends CoffeeMaker {

	@Override
	protected void grindBeans() {
		System.out.println("Medium-fine size beans grinding...");
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
		System.out.println("Adding foamed milk...");
	}
	
}
