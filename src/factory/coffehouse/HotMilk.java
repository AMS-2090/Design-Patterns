package factory.coffehouse;

public class HotMilk extends Milk {

	public HotMilk(MilkFactory milkFactory) {
		this.milkFactory = milkFactory;
		this.name = "hot milk";
	}

}
