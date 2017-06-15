package facade;

public class SensorsModule {
	
	/* TODO sensors
	 * 3-axis gyroscope
	 * 3-axis accelerometers
	 * compass
	 * barometer
	 */
	
	public void setUpSensors() {
		initGyroscope();
		
	}
	
	private void initGyroscope() {
		System.out.println("3-axis gyroscope initialized.");
	}
}
