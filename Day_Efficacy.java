public class Day_Efficacy {
	double totalEfficacy;
	double lsRatio;
	int randomWeather;
	double weatherMultiplier;
	String WeatherName;
	double recipeMultiplier;
	int customers;
	double custMultiplier;
	public Day_Efficacy(){
		lsRatio = lRec/sRec;
		randomWeather = (int)(Math.random()*7);
		weatherMultiplier = calcWeatherMultiplier(random);
		WeatherName = detWeatherName(random);
		recipeMultiplier = recipeEfficacy(lsRatio);
		customers = calcCustomers(weatherMultiplier);
		custMultiplier = calcCustMultiplier(customers);
		totalEfficacy = 1.00*custMultiplier*recipeMultiplier*weatherMultiplier;
	}
	
	public double calcWeatherMultiplier(int randomWeather) {
		double[] weatherMultipliers = {0.70, 0.75, 0.80, 0.85, 0.90, 0.95, 1.00};
		return weatherMultipliers[randomWeather];
	}
	public String detWeatherName(int randomWeather) {
		String[] WeatherNames = {"Cloudy 70 degrees", "Cloudy 75 degrees," "Hazy 80 degrees," "Cloudy 85 degrees," "Sunny 60 degrees," "Sunny 75 degrees"};
		return WeatherNames[randomWeather];
	}
	public double recipeEfficacy(double lsRatio){
		double idealLSRatio = 1.67;
		double percDifRatio = (Math.abs(idealLSRatio-lsRatio)/idealLSRatio);
		return (1.00-percDifRatio);
	}
	public int calcCustomers(double weatherMultiplier){
		int arbCustomers = (int)(Math.random()*50+30);
		return (int)(arbCustomers*weatherMultiplier);
	}
	public double calcCustMultiplier(int customers){
		return (double)(customers/50);
	}
}
