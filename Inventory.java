import java.util.Scanner;


public class Inventory {
	double moneySpent;
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
	System.out.println(checkTransaction(money, lemons, lemonPrice));
	System.out.print("Enter # of sugar: ");
	int buySugar = Integer.parseInt(sc.nextLine());
	System.out.println(checkTransaction(money, sugar, sugarPrice));
	System.out.print("Enter # of ice:");
	int buyIce = Integer.parseInt(sc.nextLine());
	System.out.println(checkTransaction(money, ice, icePrice));
	System.out.print("Enter # of cups: ");
	int buyCups = Integer.parseInt(sc.nextLine());
	System.out.println(checkTransaction(money, cups, cupPrice));

	updateInventory();
	updateMoney();
		
	public void updateInventory() {
		lemons+=buyLemons;
		sugar+=buySugar;
		ice+=buyIce;
		cup+=buyCups;
	}
	public void updateMoney(){
		moneySpent = lemons*lemonPrice + sugar*sugarPrice + ice*icePrice + cups*cupPrice;
		money = money - moneySpent;
	}
	public String checkTransaction(double money, int item, double itemPrice){
		moneySpent = lemons*lemonPrice + sugar*sugarPrice + ice*icePrice + cups*cupPrice;
		money = money - moneySpent;
		if (money==0){
			return "You have no money left";
		} 
		else if (money>=0){
			return "You have " + money + "dollars left";
		} 
		else {
			undoTransaction();
			return "transaction invalid";
		}

	}
	public void undoTransaction(){
		money = money + moneySpent;
		buyLemons = 0;
		buySugar = 0;
		buyIce = 0;
		buyCups = 0;
		
		
		
	}
	
}
