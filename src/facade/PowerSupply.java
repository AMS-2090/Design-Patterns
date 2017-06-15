package facade;

public class PowerSupply {

	private int maxCapacity;
	private boolean state;
	
	public PowerSupply(int maxCapacity) {
		this.maxCapacity = maxCapacity;
		state = false;
	}
	
	public void on() {
		state = true;
		System.out.println("Battery is online.");
	}
	
	public void off() {
		state = false;
		System.out.println("Battery is offline.");
	}
	
	public boolean getState() {
		return state;
	}
}
