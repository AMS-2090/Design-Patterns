package facade;

public class CommunicationModule {
	
	private RemoteController rc;
	
	public CommunicationModule() {
		this.rc = null;
	}
	
	public void setRc(RemoteController rc) {
		this.rc = rc;
	}
	
	public RemoteController getRc() {
		return rc;
	}
	
	public void initRT() {
		System.out.println("> Receiver/Transmitter initialized");
	}
	
	public void pairRc() {
		System.out.println("> Pairing with " + rc.getId() + "...");
	}
	
	public void initStreaming() {
		System.out.println("> Streaming of video and data started");
	}
}
