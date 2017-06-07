package command.homekit;

public class AcCommandSetTempOn implements Command {

	private AirConditioner airConditioner;
	private int temperature;
	private int prevTemperature;
	
	public AcCommandSetTempOn(AirConditioner airConditioner, int temperature) {
		this.airConditioner = airConditioner;
		this.temperature = temperature;
	}
	
	@Override
	public void execute() {
		prevTemperature = airConditioner.getTemperature();
		airConditioner.setTemperature(temperature);
	}

	@Override
	public void undo() {
		airConditioner.setTemperature(prevTemperature);
	}

}
