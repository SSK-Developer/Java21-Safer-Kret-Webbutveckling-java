package model;

public class WeatherBean {

	// Declaring private variables
	private String cityStr;

	private String countryStr;

	private String cloudsStr;

	private String dateStr;

	private double temperatureKelvin;

	// constructor to get two key-values, city and country name.
	public WeatherBean(String cityStr, String countryStr) {

		this.cityStr = cityStr;
		this.countryStr = countryStr;

	}

	// getters and setters, to store value into my variables and then to be able to
	// get the values from getters.
	public String getCityStr() {
		return cityStr;
	}

	public String getCountryStr() {
		return countryStr;
	}

	public String getCloudsStr() {
		return cloudsStr;
	}

	public void setCloudsStr(String cloudsStr) {
		this.cloudsStr = cloudsStr;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public double getTemperatureKelvin() {
		return temperatureKelvin;
	}

	public void setTemperatureKelvin(double temperatureKelvin) {
		this.temperatureKelvin = temperatureKelvin;
	}

	// method to convert from kelvin to celsius and then round it to the closest
	// integer.
	public double getTemperatureCelsius() {
		double cel = getTemperatureKelvin() - 273.15;
		return Math.round(cel);
	}

	/*
	 * public String normalize(String input) { String output =
	 * Normalizer.normalize(input, Normalizer.Form.NFD); Pattern pattern =
	 * Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	 * 
	 * return pattern.matcher(output).replaceAll(""); }
	 */

	/*
	 * public String normalize1(String input) { String newString =
	 * Normalizer.normalize(input, Normalizer.Form.NFKD).replaceAll("\\p{M}", "");
	 * 
	 * return newString; }
	 */

}