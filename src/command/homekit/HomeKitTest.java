package command.homekit;

public class HomeKitTest {

	public static void main(String[] args) {
		
		HomeKit homeKit = new HomeKit();
		
		// Roller Blinds
		RollerBlinds rollerBlindsBedroom = new RollerBlinds("Bedroom");
		RollerBlindsCommandUp rollerBlindsUpBedroom = new RollerBlindsCommandUp(rollerBlindsBedroom);
		RollerBlindsCommandDown rollerBlindsDownBedroom = new RollerBlindsCommandDown(rollerBlindsBedroom);
		
		// Air Conditioner
		AirConditioner airConditionerLivingRoom = new AirConditioner("Living Room", 20);
		AirConditionerCommandOn airConditionerOnLivingRoom = new AirConditionerCommandOn(airConditionerLivingRoom);
		AirConditionerCommandOff airConditionerOffLivingRoom = new AirConditionerCommandOff(airConditionerLivingRoom);
		
		homeKit.setCommand("rbBedroom", rollerBlindsUpBedroom, rollerBlindsDownBedroom);
		homeKit.launch("rbBedroom");
		homeKit.shutDown("rbBedroom");
		
		homeKit.setCommand("acLivingRooom", airConditionerOnLivingRoom, airConditionerOffLivingRoom);
		homeKit.launch("acLivingRooom");
		homeKit.shutDown("acLivingRooom");
		
		System.out.println();
		System.out.println(homeKit.toString());
	}

}
