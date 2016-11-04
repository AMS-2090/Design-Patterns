package observer.weatherstation;

public class HeatIndexView implements Observer, DisplayElement {
	private double heatIndex = 0.0;
	private Subject weatherData;

	public HeatIndexView(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Heat Index View: ");
		System.out.format("Heat index is %.1fC\n", heatIndex);
		System.out.println("-----------------------------");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		heatIndex = computeHeatIndex(temperature, humidity);
		display();
	}
	
	/*
	 * the heat index is an index that combines air temperature and relative humidity,
	 * in shaded areas, as an attempt to determine the human-perceived equivalent temperature.
	 * the result is also known as the "felt air temperature".
	 */
	private float computeHeatIndex(float tC, float rh) {
		float t = celsiusToFahrenheit(tC);
		final float C1 = -42.379f;
        final float C2 = 2.04901523f;
        final float C3 = 10.14333127f;
        final float C4 = -0.22475541f;
        final float C5 = -.00683783f;
        final float C6 = -5.481717E-2f;
        final float C7 = 1.22874E-3f;
        final float C8 = 8.5282E-4f;
        final float C9 = -1.99E-6f;
        float t2 = t * t;
        float r2 = rh * rh;
		float index = C1 + (C2 * t) + (C3 * rh) + (C4 * t * rh) + (C5 * t2) + (C6 * r2)
				+ (C7 * t2 * rh) + (C8 * t * r2) + (C9 * t2 * r2);
				
		return fahrenheitToCelsius(index);
	}
	
	private float celsiusToFahrenheit(float celsius) {
	
		return ((9*celsius)/5) + 32;
	}
	
	private float fahrenheitToCelsius(float fahrenheit) {
		return ((fahrenheit - 32)*5)/9;
	}
}
