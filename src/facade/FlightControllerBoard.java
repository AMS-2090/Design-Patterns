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

	public void setZSpeed(ActuatorsModule actuators, float verticalSpeed) {
		actuators.controlLinearSpeed('z', verticalSpeed);
	}
	
	public void setXSpeed(ActuatorsModule actuators, float horizontalXSpeed) {
		actuators.controlLinearSpeed('x', horizontalXSpeed);
	}
	
	public void setYSpeed(ActuatorsModule actuators, float horizontalYSpeed) {
		actuators.controlLinearSpeed('y', horizontalYSpeed);
	}

	public void setZRotateSpeed(ActuatorsModule actuators, float zRotateSpeed) {
		actuators.controlAngularSpeed('z', zRotateSpeed);
	}
	
	public void setXRotateSpeed(ActuatorsModule actuators, float xRotateSpeed) {
		actuators.controlAngularSpeed('x', xRotateSpeed);
	}
	
	public void setYRotateSpeed(ActuatorsModule actuators, float yRotateSpeed) {
		actuators.controlAngularSpeed('y', yRotateSpeed);
	}
	
}
