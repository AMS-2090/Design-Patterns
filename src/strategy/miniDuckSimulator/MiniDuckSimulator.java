package strategy.duck;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		/*
		 * WildDuck
		 */
		System.out.println("Wild Duck creating...");
		Duck duck = new WildDuck();
		duck.swim();
		duck.executeFly();
		duck.executeQuack();
		
		/*
		 * RubberDuck
		 */
		System.out.println("---\nRubber Duck creating...");
		Duck rubberDuck = new RubberDuck();
		rubberDuck.executeFly();
		System.out.println("changing to rocket propulsion...");
		rubberDuck.setFlyInterface(new RocketPropFlyer());
		rubberDuck.executeFly();
		
		/*
		 * SqueakyDuck
		 */
		System.out.println("---\nSqueaky Duck creating...");
		Duck squeakyDuck = new SqueakyDuck();
		squeakyDuck.executeFly();
		squeakyDuck.executeQuack();
	}

}
