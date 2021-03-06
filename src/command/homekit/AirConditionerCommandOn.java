package command.homekit;

public class AirConditionerCommandOn implements Command {

	private AirConditioner airConditioner;
	
	public AirConditionerCommandOn(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}
	
	
	@Override
	public void execute() {
		airConditioner.on();
	}


	@Override
	public void undo() {
		airConditioner.off();
	}

}
