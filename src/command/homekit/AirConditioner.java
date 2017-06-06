package command.homekit;

public class AirConditioner {

	private String location;
	private int temperature;
	private String state;
	
	public AirConditioner(String location, int temperature) {
		this.location = location;
		this.temperature = temperature;
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public void setTemperature(int temperature) {
		if (state.equalsIgnoreCase("ON")) {
			state = "ON";
		}
		this.temperature = temperature;
		System.out.println(this.toString());
	}
	
	public void on() {
		state = "ON";
		System.out.println(this.toString());
	}
	
	public void off() {
		state = "OFF";
		System.out.println(this.toString());
	}
	
	public String toString() {
		StringBuilder info = new StringBuilder("Air conditioner at ");
		info.append(location).append(" is " + state);
		if (state.equalsIgnoreCase("ON")) {
			info.append(" and set to ").append(temperature).append(" C deg.");
		} else {
			info.append('.');
		}
		
		return info.toString();
	}
	
}
