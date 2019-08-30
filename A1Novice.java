package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Total Number
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			// Last Name
			String lastName = scan.next().substring(0, 1);
			
			// First Name
			String firstName = scan.next();
			
			int itemBought = scan.nextInt();
			double totalPrice = 0;
			
			// Total Price
			for (int j = 0; j < itemBought; j++) {
				int numOfItem = scan.nextInt();
				scan.next();
				double priceOfItem = scan.nextDouble();
				totalPrice += numOfItem * priceOfItem;
			}
			
			// Output
			System.out.print("\n" + lastName + ". " + firstName
					+ ": " + String.format("%.2f", totalPrice));
			
		}
	
		scan.close();
	}
	
}
