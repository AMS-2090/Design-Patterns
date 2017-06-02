package command.homekit;

public class LightCommandOn implements Command {

	Light light;
	
	public LightCommandOn(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}
