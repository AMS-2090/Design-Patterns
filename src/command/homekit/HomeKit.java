package command.homekit;

import java.util.LinkedHashMap;
import java.util.Map;

public class HomeKit {

	Map<String, Command> onCommandMap;
	Map<String, Command> offCommandMap;
	Command undoCommand;
	
	public HomeKit() {
		onCommandMap = new LinkedHashMap<>();
		offCommandMap = new LinkedHashMap<>();
		undoCommand = new EmptyCommand();
	}

	public void setCommand(String device, Command onCommand, Command offCommand) {
		onCommandMap.put(device, onCommand);
		offCommandMap.put(device, offCommand);
	}
	
	public void launch(String device) {
		onCommandMap.get(device).execute();
		undoCommand = onCommandMap.get(device);
	}
	
	public void shutDown(String device) {
		offCommandMap.get(device).execute();
		undoCommand = offCommandMap.get(device);
	}
	
	public void cancelLastCmd() {
		undoCommand.undo();
	}

	@Override
	public String toString() {
		
		StringBuilder cmdOn = new StringBuilder("commands 'ON' list:\n");
		String cmdClass;
		
		for(String key : onCommandMap.keySet()) {
			cmdClass = onCommandMap.get(key).getClass().getName();
			cmdOn.append(key).append(", command class: ").append(cmdClass).append('\n');
		}
		
		StringBuilder cmdOff = new StringBuilder("commands 'OFF' list:\n");
		
		for(String key : offCommandMap.keySet()) {
			cmdClass = offCommandMap.get(key).getClass().getName();
			cmdOff.append(key).append(", command class: ").append(cmdClass).append('\n');
		}
		
		cmdOn.append('\n').append(cmdOff);
		cmdOn.append('\n').append("last undo command: ").append(undoCommand.getClass().getName());
		
		return cmdOn.append('\n').toString();
	}
	
}
