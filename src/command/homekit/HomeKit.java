package command.homekit;

import java.util.HashMap;
import java.util.Map;

public class HomeKit {

	Map<String, Command> onCommandList;
	Map<String, Command> offCommandList;
	
	public HomeKit() {
		onCommandList = new HashMap<>();
		offCommandList = new HashMap<>();
	}

	public void setCommand(String device, Command onCommand, Command offCommand) {
		onCommandList.put(device, onCommand);
		offCommandList.put(device, offCommand);
	}
	
	public void launch(String device) {
		onCommandList.get(device).execute();
	}
	
	public void shutDown(String device) {
		offCommandList.get(device).execute();
	}
}
