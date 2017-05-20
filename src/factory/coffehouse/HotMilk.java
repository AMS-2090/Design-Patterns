package factory.coffehouse;

public class HotMilk extends Milk {

	public HotMilk(MilkFactory milkFactory) {
		super(milkFactory);
		this.name = "hot milk";
	}

}
