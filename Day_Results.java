public class Day_Results{
	
	double profit;
	

	public Day_Results(){
	profit = totalEfficacy*price*customers;
	printResults(profit);
		
	
	}
	public void printResults(double profit){
		System.out.println("Your profit for the day was " + profit);
		if (profit>=100){
			System.out.println("--A Successful day!");
		}
		else if (profit>=50){
			System.out.println("--Not too horrible but not great");
		}
		else {
			System.out.println("--WOMP WOMP --try better next time!");
		}
		System.out.println("All your ice has melted");
	}		
}
