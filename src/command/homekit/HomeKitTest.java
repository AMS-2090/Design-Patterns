package command.homekit;

public class HomeKitTest {

	public static void main(String[] args) {
		
		HomeKit homeKit = new HomeKit();
		RollerBlinds rollerBlinds = new RollerBlinds();
		RollerBlindsCommandUp rollerBlindsUp = new RollerBlindsCommandUp(rollerBlinds);
		RollerBlindsCommandDown rollerBlindsDown = new RollerBlindsCommandDown(rollerBlinds);
		
		homeKit.setCommand(rollerBlindsUp);
		homeKit.launch();
		
		homeKit.setCommand(rollerBlindsDown);
		homeKit.launch();
	}

}
