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
		System.out.println("> Motors are ready.");
	}
	
	public void controlLinearSpeed(char axis, float axisSpeed) {
		System.out.println("> constant velocity in axis: '" 
							+ axis + "' set to " + axisSpeed + "m/s");
	}
	
	public void controlAngularSpeed(char axis, float rotateSpeed) {
		System.out.println("> constant velocity around axis: '"
							+ axis + "' set to " + rotateSpeed + "deg/s");
	}
}
