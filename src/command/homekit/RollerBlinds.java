package command.homekit;

public class RollerBlinds {

	private String location;
	
	public RollerBlinds(String location) {
		this.location = location;
	}
	
	public void up() {
		System.out.println("Roller blinds at " + location + " are lifted.");
	}
	
	public void down() {
		System.out.println("Roller blinds at " + location + " are lowered.");
	}
}
