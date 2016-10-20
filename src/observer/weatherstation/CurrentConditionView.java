package observer.weatherstation;

public class CurrentConditionView implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionView(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
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
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
