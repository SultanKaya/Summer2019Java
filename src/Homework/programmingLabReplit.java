package Homework;

import java.util.Scanner;

public class programmingLabReplit {
	
	public static void main(String[]args) {
	
		/*SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017. 

		In this assignment you will write a program that will find vehicle for recall. 
		-Create a scanner object
		-Create int variable named vehicleYear

		-Display prompt: "Enter vehicle's year:"
		input: 1996

		 if the value of modelYear does fall within the four recall ranges, display output:
		"Your vehicle needs to be recalled!"

		Otherwise, display message:
		"Your vehicle is fine, enjoy!"
		
		*/
		/*
		 Scanner scan = new Scanner(System.in);
		   System.out.println("Enter vehicle's year:");
		   int vehicleYear = scan.nextInt();
		   
		   if (1995<=vehicleYear && vehicleYear<=1998) {
			   System.out.println("Your vehicle needs to be recalled!");
		   }
		   else if (vehicleYear>=2001 && vehicleYear<=2002) {
			   System.out.println("Your vehicle needs to be recalled!");
		   }
		   else if (vehicleYear>=2004 && vehicleYear <= 2006) {
			   System.out.println("Your vehicle needs to be recalled!");
		   }
		   else if ( vehicleYear >=2015 && vehicleYear <=2017) {
			   
		    System.out.println("Your vehicle needs to be recalled!");

		   }else {
			   System.out.println("Your vehicle is fine, enjoy!");
		   }
	
		   */
		
/*
In the Happy Valley School System, children are classified by age as follows:


less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible

Given an int variable age, write an if statement that prints out, on a line by itself, the appropriate label from the above list based on age.

Example:
-Display prompt: Enter age:
8
-Display prompt: elementary
		
	*/
		/*
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter age:");
	int age = scan.nextInt();
	
	if (age<2) {
		System.out.println("ineligible");
	}else if(age==2) {
		System.out.println("toddler");
	}else if (age>=3 && age<=5) {
		System.out.println("early chilhood");
		}else if (age>=6 && age<=7){
			System.out.println("young reader");
		}else if (age>=8 && age<=10) {
			
			System.out.println("elementary");
		}else if (age>= 11 && age<=12) {
			System.out.println("middle");
		}else if (age == 13) {
			System.out.println("impossible");
		}else if (age>=14 &&age<=16) {
			System.out.println("high school");
		}else if (age >=17 && age<= 18) {
			System.out.println("scholar");
		}else if (age >18) {
			System.out.println("ineligible");
		}
	*/
		
		/*
		 U have an Integer number already declared and assigned value.

Using conditional statements, check if number is odd or even. Please follow the below examples and print message accordingly:

Enter a number:
10
10 is even

Enter a number:
33
33 is odd

Enter a number:
0
0 is even*/
		
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Welcome to the Grader!");
		    
		    System.out.println("Please enter subject name number 1 and score for this subject");
		    String subject1 = scan.nextLine();
		    double grade1 = scan.nextDouble();
		    
		    System.out.println("Please enter subject namenumber 2 and score for this subject");
		    String subject2 = scan.nextLine();
		    double grade2 = scan.nextDouble();
		    
		    System.out.println("Please enter subject name number 3 and score for this subject");
		    String subject3 = scan.nextLine();
		    double grade3 = scan.nextDouble();
		    
		    System.out.println("Please enter subject number 4 and score for this subject");
		    String subject4 = scan.nextLine();
		    double grade4 = scan.nextDouble();
		    
		    System.out.println("Please enter subject name 5 and score for this subject ");
		    String subject5 = scan.nextLine();
		    double grade5 = scan.nextDouble();
		  System.out.println("Summary: "+subject1+ "-"+grade1 +", "+subject2+"-"+grade2+", "+subject3+"-"+grade3+", "+subject4+"-"+grade4+", "+subject5+"-"+grade5);
		    
		    System.out.println("Your average score is: "+(grade1+grade2+grade3+grade4+grade5)/5);
		    
		    System.out.println("Thank you for using Grader");
		    System.out.println("Goodbye!");
		    
		
	
}
}