package command.homekit;

public class RollerBlindsCommandUp implements Command {
	
	private RollerBlinds rollerBlinds;

	public RollerBlindsCommandUp(RollerBlinds rollerBlinds) {
		this.rollerBlinds = rollerBlinds;
	}
	
	@Override
	public void execute() {
		rollerBlinds.up();
	}
	
	public void undo() {
		rollerBlinds.down();
	}

}
