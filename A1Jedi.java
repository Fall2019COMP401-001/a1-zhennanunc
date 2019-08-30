package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// INPUT: Total number of items
		int numOfItem = scan.nextInt();
		
		// ITEM PART
		String[] itemName = new String[numOfItem];
		int[] itemNumber = new int[numOfItem];
		int[] cusNumber = new int[numOfItem];
		
		
		for (int i = 0; i < numOfItem; i++) {
			itemName[i] = scan.next();
			scan.nextDouble();
			
			itemNumber[i] = 0;
			cusNumber[i] = 0;
		}
		
		// INPUT: Total number of customers
		int numOfCus = scan.nextInt();
		
		// CUSTOMER PART
		for (int j = 0; j < numOfCus; j++) {
			
			scan.next();
			scan.next();
			
			int itemBought = scan.nextInt();
			
			// COUNT THE ITEM BOUGHT
			for (int k = 0; k < itemBought; k++) {
				
				int numberEach = scan.nextInt();
				String nameEach = scan.next();
				
				// FIND THE TOTAL NUMBER OF ITEM
				for (int a = 0; a < numOfItem; a++) {
					if (nameEach.contains(itemName[a])) {
						itemNumber[a] += numberEach;
						cusNumber[a] ++;
					}
				}
				
			}
			
		}
		
		// Find the maximum, minimum and average value
		
		for (int b = 0; b < numOfItem; b++) {
			if (cusNumber[b] == 0)
				System.out.println("No customers bought " + itemName[b]);
			else
				System.out.println(cusNumber[b] + " customers bought " +
								itemNumber[b] + " " + itemName[b]);
		}
		
		scan.close();
		
	}
	
}
