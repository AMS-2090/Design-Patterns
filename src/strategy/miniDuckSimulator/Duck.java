package strategy.duck;

public abstract class Duck {
	
	// interfaces variables
	protected Flyable flyInterface;
	protected Quackable quackInterface;
	
	public Duck() {
	}
	
	public abstract void show();
	
	// setting flyInterace to specific instance (implementing Flyable)
	public void setFlyInterface(Flyable fi) {
		flyInterface = fi;
	}
	// setting quackInterace to specific instance (implementing Quackable)
	public void setQuackInterface(Quackable qi) {
		quackInterface = qi;
	}
	
	public void executeFly() {
		flyInterface.fly();
	}
	
	public void executeQuack() {
		quackInterface.quack();
	}
	
	public void swim(){
		System.out.println("All of the ducks can swim, even rubber ones!");
	}

}
