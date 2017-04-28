package factory.coffehouse;

public abstract class Coffee {
	
	protected String name;
	protected CoffeeType coffeeType;
	protected CoffeeSize coffeeSize;
	protected GrindSize grindSize;
	protected BeansType beansType;
	protected String machineUsed;
	protected String milk;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CoffeeType getCoffeeType() {
		return coffeeType;
	}

	public void setCoffeeType(CoffeeType coffeeType) {
		this.coffeeType = coffeeType;
	}

	public CoffeeSize getCoffeeSize() {
		return coffeeSize;
	}

	public void setCoffeeSize(CoffeeSize coffeeSize) {
		this.coffeeSize = coffeeSize;
	}

	public BeansType getBeansType() {
		return beansType;
	}

	public void setBeansType(BeansType beansType) {
		this.beansType = beansType;
	}

	public String getMachineUsed() {
		return machineUsed;
	}

	public void setMachineUsed(String machineUsed) {
		this.machineUsed = machineUsed;
	}

	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}

	public GrindSize getGrindSize() {
		return grindSize;
	}

	public void setGrindSize(GrindSize grindSize) {
		this.grindSize = grindSize;
	}

	public void drink() {
		String description = coffeeSize + " " + coffeeType;
		System.out.println("Drinking " + description);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(coffeeSize.toString());
		sb.append(" ").append(coffeeType).append(" brewed using ")
		.append(beansType).append(" beans,\n\tfrom ").append(machineUsed);
		
		if (milk != null) {
			sb.append(" (with ").append(milk).append(")");
		}
		
		return sb.toString();
	}
	
}
