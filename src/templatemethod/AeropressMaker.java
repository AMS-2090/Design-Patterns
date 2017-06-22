package templatemethod;

public class AeropressMaker extends CoffeeMaker {

	@Override
	protected void grindBeans() {
		System.out.println("'Medium-fine' size beans grinding...");
	}

	@Override
	protected void brew() {
		System.out.println("120 seconds of brewing...");
	}

}
