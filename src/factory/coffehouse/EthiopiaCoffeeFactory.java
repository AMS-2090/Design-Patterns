package factory.coffehouse;

public class EthiopiaCoffeeFactory implements CoffeeFactory {

	private BeansType beansType;
	private MilkFactory milkFactory;
	
	public EthiopiaCoffeeFactory() {
		this.beansType = BeansType.ETHIOPIA;
		this.milkFactory = new UKMilkFactory();
	}
	
	@Override
	public Coffee prepareEspresso(CoffeeSize coffeeSize) {
		Coffee espresso = new Espresso(coffeeSize);
		espresso.setBeansType(beansType);
		espresso.setMachineUsed("15-Bar Coffee Machine");
		espresso.setName("ethiopian espresso");
		espresso.setGrindSize(GrindSize.MEDIUM);
		
		return espresso;
	}

	@Override
	public Coffee prepareCappuccino(CoffeeSize coffeeSize) {
		Coffee cappuccino = new Cappuccino(coffeeSize);
		cappuccino.setBeansType(beansType);
		cappuccino.setMachineUsed("15-Bar Coffee Machine");
		cappuccino.setName("ethiopian cappuccino");
		cappuccino.setGrindSize(GrindSize.MEDIUM);
		
		Milk milkFoam = new MilkFoam(milkFactory);
		cappuccino.setMilk(milkFoam.prepare());
		
		return cappuccino;
	}

	@Override
	public Coffee prepareLatte(CoffeeSize coffeeSize) {
		Coffee latte = new Latte(coffeeSize);
		latte.setBeansType(beansType);
		latte.setMachineUsed("15-Bar Coffee Machine");
		latte.setName("ethiopian latte");
		latte.setGrindSize(GrindSize.MEDIUM);
		
		Milk steamedMilk = new SteamedMilk(milkFactory);
		latte.setMilk(steamedMilk.prepare());
		
		return latte;
	}

	@Override
	public Coffee prepareChemex(CoffeeSize coffeeSize) {
		Coffee chemex = new Chemex(coffeeSize);
		chemex.setBeansType(beansType);
		chemex.setMachineUsed("Chemex vessel");
		chemex.setName("ethiopian chemex");
		chemex.setGrindSize(GrindSize.MEDIUM_COARSE);
		
		//Milk hotMilk = new HotMilk(milkFactory);
		//chemex.setMilk(hotMilk.prepare());
		
		return chemex;
	}

}
