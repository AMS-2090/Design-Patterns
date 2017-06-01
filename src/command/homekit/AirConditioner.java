package command.homekit;

public class AirConditioner {

	private String location;
	private int temperature;
	
	public AirConditioner(String location, int temperature) {
		this.location = location;
		this.temperature = temperature;
	}
	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public void on() {
		System.out.println("Air conditioner in " + location + " is ON and set to " + temperature + " C deg.");
	}
	
	public void off() {
		System.out.println("Air conditioner at " + location + " is OFF.");
	}
	
}
