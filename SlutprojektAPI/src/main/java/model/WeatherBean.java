package model;

public class WeatherBean {

	private String cityStr;

	private String countryStr;

	private String cloudsStr;

	private String dateStr;

	private double temperatureKelvin;

	public WeatherBean(String cityStr, String countryStr) {

		this.cityStr = cityStr;
		this.countryStr = countryStr;

	}

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
	
	/*
	 * public double getTemperatureCelsius() { double cel = temperatureKelvin -
	 * 273.15; return Math.round(cel); }
	 */

	
	

	

}