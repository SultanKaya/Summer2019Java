package Homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		 1. Write a program that calculates the sum of two numbers entered by the user.
		    2. Write a program that asks user to enter three numbers and returns the largest number.
		    3. Write a program that asks user to enter first name and then last name. 
		    4.write a program that can convert numbers (between 0~9) to words.
		    5.Write a Java program to calculate total amount of sale based on the unit price and quantity of a product taken.
		    6.Write a program that determines the change to be dispensed from a vending machine. 
		*/
		 
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("Enter three numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int largest = 0;
		
	if (n1>n2 && n1>n3)largest = n1;
	else if (n2>n1&&n2>n3) largest = n2;
	else largest = n3;
	System.out.println("Largest number is: "+largest);
	
	*/
		
	//QUESTION1
		/*
		System.out.println("Enter 2 numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int sum = n1+n2;
		System.out.println(sum);
	
	*/
		
		//QUESTION 3
		/*
		
		System.out.println("Enter your first name");
		String fn = scan.nextLine();
		String ln= scan.nextLine();
		
		String fullname = fn+ln;
		System.out.println(fullname);
            
		*/
		
		//QUESTION 4
	/*	
		System.out.println("enter a number between 0-9");
	int number = scan.nextInt();
	
	String num = (number == 0)?   "zero"
			       :(number==1)?"one"
			       :(number==2)?"two" 
					:(number == 3)?"three"
				       :(number == 4)?"four"
				         :(number == 5)? "five"
						     :(number == 6)?  "six"
								:(number == 7)?   "seven"
										:(number == 8 )?"eight"
												:(number == 9)?"nine"
			SYSTEM.OUT.PRINTLN("you have entered : "+number);											:default"invalid"
			*/											
														
		//QUESTION 5
		/*	
	System.out.println("Enter unit price and quantity: ");
		double unitPrice = read.nextInt();
​
		System.out.println("Enter quantity: ");
		int quantity = read.nextInt();
​
		double grandTotal = unitPrice * quantity;
		double discount=0;
​
		System.out.println("Grand total: $"+ grandTotal);
​
		if(quantity>=100 && quantity<=120) {
			System.out.println("Discount: 10%");
			discount = grandTotal/10;
		}
		else if(quantity>120) {
			System.out.println("Discount: 15%");
			discount = grandTotal/15;
		}
​
		double total = grandTotal - discount;
​
​
		System.out.println("Discount applied: $"+ discount);
		System.out.println("Total: $"+ total);
​*/
		/*
	System.out.println("Enter unit price and quantity");
	double unitp = scan.nextDouble();
	int count = scan.nextInt();
	
	double total = unitp*count;
	
	System.out.println("Total price is: $"+total);
	
*/
		
	//QUESTION 6 - Write a program that determines the change to be dispensed from a vending machine. 
	
	System.out.println("Enter price in cents");
	
	int price = scan.nextInt();
	
		
		
		
		
		
		
		
	
	}
	
			
	
	}
		
	


