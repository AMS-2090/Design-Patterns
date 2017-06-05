package command.homekit;

/*
 * EmptyCommand does nothing.
 */
public class EmptyCommand implements Command {

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}

}
