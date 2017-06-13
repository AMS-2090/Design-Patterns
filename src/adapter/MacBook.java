package adapter;

public class MacBook {

	private UsbTypeC usbc;
	
	public void plugInPeripheral(UsbTypeC usbc) {
		this.usbc = usbc;
		
		usbc.power();
		usbc.transferData();
	}
	
}
