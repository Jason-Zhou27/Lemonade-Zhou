public class Day_Efficacy {
	double totalEfficacy;
	//Lemons and Sugar declared within the Inventory class
	double lsRatio = lemons/sugar;
	int randomWeather = (int)(Math.random()*7);
	double weatherMultiplier = calcWeatherMultiplier(random);
	String WeatherName = detWeatherName(random);
	double recipeMultiplier = recipeEfficacy(lsRatio);
	int customers = calcCustomers(weatherMultiplier);
	double custMultiplier = calcCustMultiplier(customers);
	
	public double calcWeatherMultiplier(int randomWeather) {
		double[] weatherMultipliers = {0.70, 0.75, 0.80, 0.85. 0.90, 0.95, 1.00};
		return weatherMultipliers[randomWeather];
	}
	public String detWeatherName(int randomWeather) {
		String[] WeatherNames = {"Cloudy 70 degrees", "Cloudy 75 degrees," "Hazy 80 degrees," "Cloudy 85 degrees," "Sunny 60 degrees," "Sunny 75 degrees"};
		return WeatherNames[randomWeather];
	}
	public double recipeEfficacy(double lsRatio){
		double idealLSRatio = 1.67;
		double percDifRatio = (Math.abs(idealLSRatio-lsRatio)/idealLSRatio);
		return (1-percDifRatio);
	}
	public int calcCustomers(double weatherMultiplier){
		int arbCustomers = (int)(Math.random()*50+30);
		return (int)(arbCustomers*weatherMultiplier);
	}
	public double custMultiplier(int customers){
		return (double)(customers/50);
	}
	totalEfficacy = 1.00*custMultiplier*recipeMultiplier*weatherMultiplier;
}
