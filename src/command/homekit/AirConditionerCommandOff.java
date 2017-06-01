package command.homekit;

public class AirConditionerCommandOff implements Command {

	AirConditioner airConditioner;
	
	public AirConditionerCommandOff(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}
	
	
	@Override
	public void execute() {
		airConditioner.off();
	}

}
