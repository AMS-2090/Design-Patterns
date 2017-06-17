package facade;

public class DroneFacade {
	private PowerSupply power;
	private SensorsModule sensors;
	private ActuatorsModule actuators;
	private FlightControllerBoard fcb;
	private CommunicationModule comm;
	private GPSmodule gps;
	private VideoCamera camera;
	private RemoteController rc;
	
	public DroneFacade(PowerSupply power,
					   SensorsModule sensors,
					   ActuatorsModule actuators,
					   FlightControllerBoard fcb,
					   CommunicationModule comm,
					   VideoCamera camera,
					   RemoteController rc,
					   GPSmodule gps) {
		
		this.power = power;
		this.sensors = sensors;
		this.actuators = actuators;
		this.fcb = fcb;
		this.comm = comm;
		this.camera = camera;
		this.rc = rc;
		this.gps = gps;
	}
	
	public void start() {
		System.out.println("\n* Drone is preparing to start...");
		
		// battery
		if(!power.getState()) {
			power.on();
		}
		// Flight Controller Board
		if(fcb.powerOn(power)) {
			// sensors
			fcb.setUpSensors(sensors);
			// actuators
			fcb.setUpActuators(actuators);
			// camera
			fcb.setUpCamera(camera);
			// communication
			fcb.setUpCommuniaction(comm, rc);
			// GPS
			fcb.setUpGps(gps);
			
			System.out.println(">>> Up! <<<");
		}
		
	}
	
	public void land() {
		// TODO: landing procedure
		//hover();
		fcb.setFallSpeed(-1);
	}
	
	public void hover() {
		// TODO: hovering procedure
	}
	
	public void recordVideoStart() {
		// TODO: record video start
	}
	
	public void recordVideoStop() {
		// TODO: record video stop
	}
	
	public void returnToBase() {
		// TODO: return to base procedure
	}

	
}
