package factory.coffehouse;

public class CoffeeHouseTest {

	public static void main(String[] args) {
		CoffeeHouse coffeeHouse = new CoffeeHouse(new BrazilCoffeeFactory());
		
		Order orders[] = new Order[4];
		
		orders[0] = new Order(CoffeeType.ESPRESSO,
								CoffeeSize.MEDIUM);
		
		orders[1] = new Order(CoffeeType.CAPPUCCINO,
							CoffeeSize.SMALL);
		
		orders[2] = new Order(CoffeeType.LATTE,
							CoffeeSize.LARGE);
		
		orders[3] = new Order(CoffeeType.CHEMEX,
							CoffeeSize.MEDIUM);
		
		System.out.println("Brazilian Coffee Factory:\n");
		
		for(Order order : orders) {
			coffeeHouse.serve(order);
			System.out.println();
		}
		
		System.out.println("---------------------------");
		/************************************************/
		
		CoffeeHouse coffeeHouse2 = new CoffeeHouse(new EthiopiaCoffeeFactory());

		System.out.println("Ethiopian Coffee Factory:\n");
		
		for(Order order : orders) {
			coffeeHouse2.serve(order);
			System.out.println();
		}
	}

}
