package command.homekit;

public class LightCommandOn implements Command {

	private Light light;
	
	public LightCommandOn(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
