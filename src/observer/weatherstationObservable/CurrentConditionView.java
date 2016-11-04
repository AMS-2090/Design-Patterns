package observer.weatherstationObservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionView implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public CurrentConditionView(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current weather conditions:");
		System.out.format("temperature: %.1fC\n", temperature);
		System.out.format("humidity: %.1f%%\n", humidity);
		System.out.format("pressure: %.1fhPa\n", pressure);
		System.out.println("-----------------------------");
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}
	}

}
