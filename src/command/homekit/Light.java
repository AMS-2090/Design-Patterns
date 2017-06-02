package command.homekit;

public class Light {
	
	private String location;
	
	public Light(String location) {
		this.location = location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println("Light in " + location + " is turned ON.");
	}
	
	public void off() {
		System.out.println("Light in " + location + " is turned OFF.");
	}
}
