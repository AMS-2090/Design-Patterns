package factory.coffehouse;

public class SteamedMilk extends Milk {

	public SteamedMilk(MilkFactory milkFactory) {
		super(milkFactory);
		this.name = "steamed milk";
	}

}
