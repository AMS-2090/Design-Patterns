package observer.weatherstationObservable;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionView currentConditionView = new CurrentConditionView(weatherData);
		//HeatIndexView heatIndexView = new HeatIndexView(weatherData);
		
		/*
		 * Simulation of changing weather conditions
		 */
		weatherData.setMeasurements(26.6f, 65f, 1013.1f);
		weatherData.setMeasurements(27.3f, 70f, 1015.0f);
		weatherData.setMeasurements(25.7f, 59f, 1008.5f);
	}

}
