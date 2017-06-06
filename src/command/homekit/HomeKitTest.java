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
		AcCommandSetTempOn airConditionerSetTempOn19LivingRoom = 
				new AcCommandSetTempOn(airConditionerLivingRoom, 19);
		
		// Light
		Light lightHall = new Light("Hall");
		LightCommandOn lightOnHall = new LightCommandOn(lightHall);
		LightCommandOff lightOffHall = new LightCommandOff(lightHall);
		
		Light lightBedroom = new Light("Bedroom");
		LightCommandOn lightOnBedroom = new LightCommandOn(lightBedroom);
		LightCommandOff lightOffBedroom = new LightCommandOff(lightBedroom);
		
		// Macro
		Command[] goodNight = {rollerBlindsDownBedroom, airConditionerOffLivingRoom, lightOffBedroom};
		Command[] goodMorning = {rollerBlindsUpBedroom, airConditionerOnLivingRoom, lightOnBedroom};
		MacroCommand goodNightMacro = new MacroCommand(goodNight);
		MacroCommand goodMorningMacro = new MacroCommand(goodMorning);
		
		homeKit.setCommand("rbBedroom", rollerBlindsUpBedroom, rollerBlindsDownBedroom);
		homeKit.launch("rbBedroom");
		homeKit.shutDown("rbBedroom");
		homeKit.cancelLastCmd();
		
		homeKit.setCommand("acLivingRooom", airConditionerOnLivingRoom, airConditionerOffLivingRoom);
		homeKit.launch("acLivingRooom");
		homeKit.shutDown("acLivingRooom");
		homeKit.cancelLastCmd();
		
		homeKit.setCommand("acLivingRoomOn19", airConditionerSetTempOn19LivingRoom, airConditionerOffLivingRoom);
		homeKit.launch("acLivingRoomOn19");
		homeKit.cancelLastCmd();
		
		homeKit.setCommand("lightHall", lightOnHall, lightOffHall);
		homeKit.launch("lightHall");
		homeKit.shutDown("lightHall");
		homeKit.cancelLastCmd();
		
		System.out.println("macro test:");
		homeKit.setCommand("goodNight", goodNightMacro, goodMorningMacro);
		homeKit.launch("goodNight");
		homeKit.shutDown("goodNight");
		homeKit.cancelLastCmd();
		
		System.out.println();
		System.out.println(homeKit.toString());
	}

}
