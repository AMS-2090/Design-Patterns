package command.homekit;

public class AirConditionerCommandOff implements Command {

	private AirConditioner airConditioner;
	
	public AirConditionerCommandOff(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}
	
	
	@Override
	public void execute() {
		airConditioner.off();
	}


	@Override
	public void undo() {
		airConditioner.on();
	}

}
