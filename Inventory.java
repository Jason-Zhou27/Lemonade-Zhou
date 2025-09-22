import java.util.Scanner;


public class Inventory {
	double money = 100.00;
	double sugarPrice = 0.15;
	double lemonPrice = 0.20;
	double icePrice = 0.05;
	double cupPrice = 0.03;
	int lemons;
	int sugar;
	int ice;
	int cups;
		
	Scanner sc = new Scanner(system.in);
	System.out.print("You have " + money + "dollars");
	System.out.print("Enter # of lemons: ");
	int buyLemons = Integer.parseInt(sc.nextLine());
	System.out.print("Enter # of sugar: ");
	int buySugar = Integer.parseInt(sc.nextLine());
	System.out.print("Enter # of ice:");
	int buyIce = Integer.parseInt(sc.nextLine());
	System.out.print("Enter # of cups: ");
	int buyCups = Integer.parseInt(sc.nextLine());
		
	public void updateInventory() {
		lemons+=buyLemons;
		sugar+=buySugar;
		ice+=buyIce;
		cup+=buyCups;
	}
}
