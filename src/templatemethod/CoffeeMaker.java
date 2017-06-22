package templatemethod;

public abstract class CoffeeMaker {
	
	/*
	 * Template method
	 */
	public final void makeCoffee() {
		boilWater();
		grindBeans();
		brew();
		if (withIngredients()) {
			addIngredients();
		}
		pourIntoCup();
	}
	
	private final void boilWater() {
		System.out.println("Boiling water...");
	}
	
	/*
	 * Each coffee type needs specific grind size.
	 */
	protected abstract void grindBeans();
	
	/*
	 * Each coffee type needs specific brew time.
	 */
	protected abstract void brew();
	
	/*
	 * withIngredients() method returns false by default.
	 * Extending class can override it,
	 * if it wants to add ingredients in addIngredients() method.
	 */
	protected boolean withIngredients() {
		return false;
	}
	
	/*
	 * addIngredients() method is a hook.
	 * Extending class can override it, but doesn't have to.
	 */
	protected void addIngredients() {}
	
	private final void pourIntoCup() {
		System.out.println("Pouring into cup...");
	}
	
}
