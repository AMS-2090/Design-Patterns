package factory.coffehouse;

public class SteamedMilk extends Milk {

	public SteamedMilk(MilkFactory milkFactory) {
		this.milkFactory = milkFactory;
		this.name = "steamed milk";
	}

}
