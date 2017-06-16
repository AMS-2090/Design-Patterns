package facade;

public class ActuatorsModule {

	private int numOfMotors;
	
	public ActuatorsModule(int numOfMotors) {
		this.numOfMotors = numOfMotors;
	}
	
	public void initESC() {
		for(int i = 0; i < numOfMotors; i++) {
			System.out.println("> electronic speed control initialized for motor " + (i+1));
		}
		System.out.println("> Motors are ready");
	}
}
