package factory.coffehouse;

public abstract class Milk {
	
	protected MilkFactory milkFactory;
	protected String name;
	
	public Milk(MilkFactory milkFactory) {
		this.milkFactory = milkFactory;
	}
	
	public String prepare() {
		
		StringBuilder milk = new StringBuilder(name);
		
		String rawMilk = milkFactory.deliverMilk();
		
		milk.append(" made from ").append(rawMilk);
		
		return milk.toString();
	}
}
