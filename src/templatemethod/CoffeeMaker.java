package templatemethod;

public abstract class CoffeeMaker {
	
	/*
	 * Template method
	 */
	public void makeCoffee() {
		boilWater();
		grindBeans();
		brew();
		if (withIngredients()) {
			addIngredients();
		}
		pourIntoCup();
	}
	
	public final void boilWater() {
		System.out.println("Boiling water...");
	}
	
	/*
	 * Each coffee type needs specific grind size.
	 */
	public abstract void grindBeans();
	
	/*
	 * Each coffee type needs specific brew time.
	 */
	public abstract void brew();
	
	/*
	 * withIngredients() method returns false by default.
	 * Extending class can override it,
	 * if it wants to add ingredients in addIngredients() method.
	 */
	public boolean withIngredients() {
		return false;
	}
	
	/*
	 * addIngredients() method is a hook.
	 * Extending class can override it, but doesn't have to.
	 */
	public void addIngredients() {}
	
	public final void pourIntoCup() {
		System.out.println("Pouring into cup...");
	}
	
}
