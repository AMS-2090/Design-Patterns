package facade;

public class DroneFacade {
	private PowerSupply power;
	private SensorsModule sensors;
	private ActuatorsModule actuators;
	private FlightControllerBoard fcb;
	private CommunicationModule comm;
	private GPSmodule gps;
	private VideoCamera camera;
	
	public DroneFacade(PowerSupply power,
					   SensorsModule sensors,
					   ActuatorsModule actuators,
					   FlightControllerBoard fcb,
					   CommunicationModule comm) {
		
		this.power = power;
		this.sensors = sensors;
		this.actuators = actuators;
		this.fcb = fcb;
		this.comm = comm;
	}
	
	public void start() {
		System.out.println("Drone is preparing to start...");
		
		if(power.getState() == false) {
			power.on();
		}
		
		sensors.setUpSensors();
	}
	
	public void land() {
		
	}
	
	public void hover() {
		
	}
	
	public void recordVideo() {
		
	}
	
	public void returnToBase() {
		
	}

	
}
