package facade;

public class DroneFacadeTest {

	public static void main(String[] args) {
		PowerSupply power = new PowerSupply(3000);
		SensorsModule sensors = new SensorsModule();
		ActuatorsModule actuators = new ActuatorsModule(4);
		FlightControllerBoard fcb = new FlightControllerBoard();
		CommunicationModule comm = new CommunicationModule();
		VideoCamera camera = new VideoCamera("4K");
		RemoteController rc = new RemoteController("remote_123");
		GPSmodule gps = new GPSmodule();
		
		DroneFacade drone = new DroneFacade(power,
											sensors,
											actuators,
											fcb,
											comm,
											camera,
											rc,
											gps);
		
		drone.start();
	}

}
