package templatemethod;

public class EspressoMaker extends CoffeeMaker {

	@Override
	protected void grindBeans() {
		System.out.println("'Fine' size beans grinding...");
	}

	@Override
	protected void brew() {
		System.out.println("27 seconds of brewing...");
	}

}
