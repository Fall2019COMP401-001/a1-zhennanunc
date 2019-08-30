package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// INPUT: Total number of items
		int numOfItem = scan.nextInt();
		
		// ITEM PART
		String[] itemName = new String[numOfItem];
		double[] itemPrice = new double[numOfItem];
		
		for (int i = 0; i < numOfItem; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}
		
		// INPUT: Total number of customers
		int numOfCus = scan.nextInt();
		
		String[] nameOfCus = new String[numOfCus];
		double[] priceOfCus = new double[numOfCus];
		
		// CUSTOMER PART
		for (int j = 0; j < numOfCus; j++) {
			
			String lastName = scan.next();
			String firstName = scan.next();
			
			nameOfCus[j] = lastName + " " + firstName;
			
			int itemBought = scan.nextInt();
			
			double totalPrice = 0;
			
			// COUNT THE ITEM BOUGHT
			for (int k = 0; k < itemBought; k++) {
				
				int numberEach = scan.nextInt();
				String nameEach = scan.next();
				
				// FIND THE NAME FROM ITEM PART
				for (int a = 0; a < numOfItem; a++) {
					if (nameEach.contains(itemName[a])) {
						totalPrice += numberEach * itemPrice[a];
						break;
					}
				}
				
				// COUNT TOTAL PRICE FOR EACH CUSTOMER
				priceOfCus[j] = totalPrice;
				
			}
			
			
		}
		
		// Find the maximum, minimum and average value
		
		int maxPos = CheckMaxPos(priceOfCus);
		int minPos = CheckMinPos(priceOfCus);
		double ave = findAverage(priceOfCus);
		
		System.out.print("Biggest: " + nameOfCus[maxPos] +
				"(" + String.format("%.2f", priceOfCus[maxPos]) + ")");
		
		System.out.print("\n" + "Smallest: " + nameOfCus[minPos] +
				"(" + String.format("%.2f", priceOfCus[minPos]) + ")");
		
		System.out.print("\n" + "Average: " + String.format("%.2f", ave));
		
		scan.close();
		
	}
	
	
	// Method to find the maximum value
	static int CheckMaxPos(double[] a) {
		
		int pos = 0;
		double max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if (max < a[i]) {
				
				max = a[i];
				pos = i;
			}
			
		} return pos;
		
	}
	
	// Method to find the minimum value
	static int CheckMinPos(double[] a) {
		
		int pos = 0;
		double min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if (min > a[i]) {
				
				min = a[i];
				pos = i;
			}
		} return pos;
		
	}
	
	static double findAverage(double[] a) {
		
		double total = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			total += a[i];
			
		} double ave = total / a.length;
		
		return ave;
	}
	
}
