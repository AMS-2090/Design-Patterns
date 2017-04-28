package factory.coffehouse;

public class MilkFoam extends Milk {
	
	public MilkFoam(MilkFactory milkFactory) {
		this.milkFactory = milkFactory;
		this.name = "milk foam";
	}

}
