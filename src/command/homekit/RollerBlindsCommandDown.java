package command.homekit;

public class RollerBlindsCommandDown implements Command {

	private RollerBlinds rollerBlinds;

	public RollerBlindsCommandDown(RollerBlinds rollerBlinds) {
		this.rollerBlinds = rollerBlinds;
	}
	
	@Override
	public void execute() {
		rollerBlinds.down();
	}
	
	public void undo() {
		rollerBlinds.up();
	}

}
