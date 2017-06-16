package facade;

public class FlightControllerBoard {

	public boolean powerOn(PowerSupply power) {
		if(power.getState()) {
			System.out.println("> Main system is booting up...");
			return true;
		} else return false;
	}

	public void setUpSensors(SensorsModule sensors) {
		sensors.initGyroscope();
		sensors.initAccelerometer();
		sensors.initCompass();
		sensors.initBarometer();
	}

	public void setUpActuators(ActuatorsModule actuators) {
		actuators.initESC();
	}

	public void setUpCommuniaction(CommunicationModule comm, RemoteController rc) {
		comm.setRc(rc);
		comm.initRT();
		comm.pairRc();
		comm.initStreaming();
	}

	public void setUpCamera(VideoCamera camera) {
		camera.on();
	}

	public void setUpGps(GPSmodule gps) {
		gps.initGps();
	}

	
}
