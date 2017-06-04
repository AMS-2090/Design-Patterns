package command.homekit;

public interface Command {
	
	public void execute();
	public void undo();
}
