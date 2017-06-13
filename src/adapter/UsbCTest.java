package adapter;

public class UsbCTest {

	public static void main(String[] args) {
		
		MacBook macbook = new MacBook();
		UsbTypeC usbc = new Thunderbolt3();
		
		HighSpeedHdmi hdmi20 = new HighSpeedHdmi();
		HdmiAdapter hdmiAdapter = new HdmiAdapter(hdmi20);
		
		System.out.println("Plugging in Thunderbolt 3:");
		macbook.plugInPeripheral(usbc);
		System.out.println("\nPlugging in HDMI with hdmi->usb-c adapter:");
		macbook.plugInPeripheral(hdmiAdapter);
	}

}
