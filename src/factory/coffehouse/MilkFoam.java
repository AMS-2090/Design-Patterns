package factory.coffehouse;

public class MilkFoam extends Milk {
	
	public MilkFoam(MilkFactory milkFactory) {
		super(milkFactory);
		this.name = "milk foam";
	}

}
