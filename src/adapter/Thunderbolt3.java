package adapter;

public class Thunderbolt3 implements UsbTypeC {
	
	private String transferSpeed = "40Gb/s";
	private String maxPowerSupply = "100W";

	@Override
	public void transferData() {
		System.out.println("Transfer data at speed of " + transferSpeed + ".");
	}

	@Override
	public void power() {
		System.out.println(maxPowerSupply + " max. charging power available.");
	}

}
