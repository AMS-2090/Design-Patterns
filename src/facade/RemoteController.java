package facade;

public class RemoteController {

	private String id;
	
	public RemoteController(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
