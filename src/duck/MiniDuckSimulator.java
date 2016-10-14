package duck;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		System.out.println("Wild Duck creating...");
		Duck duck = new WildDuck();
		duck.swim();
		duck.executeFly();
		duck.executeQuack();
		
		System.out.println("---\nDuck Model creating...");
		Duck model = new DuckModel();
		model.executeFly();
		System.out.println("changing to rocket propulsion...");
		model.setFlyInterface(new RocketPropFlyer());
		model.executeFly();
	}

}
