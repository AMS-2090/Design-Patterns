package facade;

public class VideoCamera {
	
	private String type;
	
	public VideoCamera(String type) {
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void on() {
		System.out.println("> " + type + " camera is turned on");
	}
}
