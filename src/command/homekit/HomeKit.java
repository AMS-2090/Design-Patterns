package command.homekit;

public class HomeKit {

	Command slot;
	
	public HomeKit() {
	}

	public void setCommand(Command command) {
		slot = command;
	}
	
	public void launch() {
		slot.execute();
	}
}
