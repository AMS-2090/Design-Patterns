package adapter;

public class HighSpeedHdmi implements Hdmi {

	private String transferSpeed = "18Gb/s";
	
	@Override
	public void transferVideo() {
		System.out.println("Transfer video at speed of " + transferSpeed + ".");
	}

	@Override
	public void transferAudio() {
		System.out.println("Transfer audio.");
	}
	
}
