package adapter;

public class HdmiAdapter implements UsbTypeC {

	private Hdmi hdmi;
	
	public HdmiAdapter(Hdmi hdmi) {
		this.hdmi = hdmi;
	}
	
	@Override
	public void transferData() {
		hdmi.transferVideo();
		hdmi.transferAudio();
	}

	@Override
	public void power() {
		System.out.println("Power is not available.");
	}

}
