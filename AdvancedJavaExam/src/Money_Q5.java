import java.util.Scanner;

public class Money_Q5 {
	
	static int quarters;
	static int pennies;
	static int dimes;
	static int dollars;
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int cents = scan.nextInt();
		
	    dollars=(cents/100);
		System.out.println("no. of dollars: "+dollars);
		int remain= cents%100;
		quarters = remain/25;
		System.out.println("no. of quaters: "+ quarters);
		int remaining = remain%25;
		dimes= remaining/10;
		System.out.println("no.of dimes: "+ dimes);
		pennies = remaining%10;
		System.out.println("no. of pennies: "+pennies);
		int coins= dollars+quarters+dimes+pennies;
		System.out.println("Total no. of coins: "+coins);
		
	}
		
	}

