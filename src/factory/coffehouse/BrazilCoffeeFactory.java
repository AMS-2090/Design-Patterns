package factory.coffehouse;

public class BrazilCoffeeFactory implements CoffeeFactory {
	
	private BeansType beansType;
	private MilkFactory milkFactory;
	
	public BrazilCoffeeFactory() {
		this.beansType = BeansType.BRAZIL;
		this.milkFactory = new PolishMilkFactory();
	}

	@Override
	public Coffee prepareEspresso(CoffeeSize coffeeSize) {
		Coffee espresso = new Espresso(coffeeSize);
		espresso.setBeansType(beansType);
		espresso.setMachineUsed("9-Bar Coffee Machine");
		espresso.setName("brazilian espresso");
		espresso.setGrindSize(GrindSize.MEDIUM_FINE);
		
		return espresso;
	}

	@Override
	public Coffee prepareCappuccino(CoffeeSize coffeeSize) {
		Coffee cappuccino = new Cappuccino(coffeeSize);
		cappuccino.setBeansType(beansType);
		cappuccino.setMachineUsed("9-Bar Coffee Machine");
		cappuccino.setName("brazilian cappuccino");
		cappuccino.setGrindSize(GrindSize.MEDIUM_FINE);
		
		Milk milkFoam = new MilkFoam(milkFactory);
		cappuccino.setMilk(milkFoam.prepare());
		
		return cappuccino;
	}

	@Override
	public Coffee prepareLatte(CoffeeSize coffeeSize) {
		Coffee latte = new Latte(coffeeSize);
		latte.setBeansType(beansType);
		latte.setMachineUsed("9-Bar Coffee Machine");
		latte.setName("brazilian cappuccino");
		latte.setGrindSize(GrindSize.MEDIUM_FINE);
		
		Milk steamedMilk = new SteamedMilk(milkFactory);
		latte.setMilk(steamedMilk.prepare());
		
		return latte;
	}

	@Override
	public Coffee prepareChemex(CoffeeSize coffeeSize) {
		Coffee chemex = new Chemex(coffeeSize);
		chemex.setBeansType(beansType);
		chemex.setMachineUsed("Chemex vessel");
		chemex.setName("brazilian chemex");
		chemex.setGrindSize(GrindSize.MEDIUM_COARSE);
		
		Milk hotMilk = new HotMilk(milkFactory);
		chemex.setMilk(hotMilk.prepare());
		
		return chemex;
	}
	
	

}
