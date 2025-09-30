public class Choice {
	
	//defining variables
	public int lRec;
	public int sRec;
	public int iRec;
	String temp;
	public double price;
	
	
	//constructor
	public Choice(){
		
	Scanner pick = new Scanner(System.in);
	System.out.println("Enter the amount of lemons in your recipe: ");
	lRec = pick.nextInt();
	//clear buffer
	temp = pick.nextLn();
	
	System.out.println("Enter the amount of sugar in your recipe: ");
	sRec = pick.nextInt();
	//clear buffer
	temp = pick.nextLn();
	
	System.out.println("Enter the amount of ice in your recipe: ");
	iRec = pick.nextInt();
	//clear buffer
	temp = pick.nextLn();
	
	System.out.println("Enter the price of each cup: ");
	price = pick.nextDouble();
	pick.close();
	}
}
