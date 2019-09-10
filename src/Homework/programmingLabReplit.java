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
		/*
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
		    
		*/
	
		/*Write a switch statement that tests the value of the char variable response and performs the following actions:
if response is y, the message Your request is being processed is printed
if response is n, the message Thank you anyway for your consideration is printed
if response is h, the message Sorry, no help is currently available is printed
for any other value of response, the message "Invalid entry, please try again!" is printed

Create Scanner object.
Use charAt() method, in order to get the char value at the specified index.

Example:

-Display prompt: "Enter command:"
input: y
-Display prompt: "Your request is being processed"
		
		*/
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter command:");
		char result = scan.next().charAt(0);
		
		switch (result) {
		
		case 'y':
			System.out.println("Your request is being processed");
			break;
		case 'n':
			System.out.println("Thank you anyway for your consideration");
			break;
		case 'h':
			System.out.println("Invalid entry, please try again!");
			break;
		
		*//*
		Scanner scan = new Scanner (System.in);
		
		String word = scan.next();
		
	    System.out.println(word.charAt(0)+word.charAt(word.length()-1));
		
		*//*Write the program that will calculate average grade.
Declare 6 String variables: subject1,  subject2, subject3,  subject4, subject5, summary;
Declare 6 double variables: grade1,  grade2, grade3,  grade4, grade5, average;

-Create a Scanner object named scan.

Execution flow with example:
-Display prompt :"Welcome to the Grader!"
-Display prompt: "Please enter subject name number 1 and score for this subject"
Math
5.0
-Display prompt: "Please enter subject name number 2 and score for this subject"
Biology
4.2
-Display prompt: "Please enter subject name number 3 and score for this subject"
English
4.4
-Display prompt: "Please enter subject name number 4 and score for this subject"
Chemistry
4.8
-Display prompt: "Please enter subject name number 3 and score for this subject"
English
4.4
-Display prompt: "Please enter subject name number 4 and score for this subject"
Chemistry
4.8
-Display prompt: "Please enter subject name number 5 and score for this subject"
Music
3.4

-build summary variable by concatenating subject names and grades
calculate average score and define that value into average variable.

-Display prompt: "Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8,  Music - 3.4"
-Display prompt: "Your average score is: 4.36"
-Display prompt: "Thank you for using Grader!"
-Display prompt: "Goodbye!"*/
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Welcome to the Grader!");
	    
	    System.out.println("Please enter subject name number 1 and score for this subject");
	    String subject1 = scan.next();
	    double grade1 = scan.nextDouble();
	    
	    System.out.println("Please enter subject name number 2 and score for this subject");
	    String subject2 = scan.next();
	    double grade2 = scan.nextDouble();
	    
	    System.out.println("Please enter subject name number 3 and score for this subject");
	    String subject3 = scan.next();
	    double grade3 = scan.nextDouble();
	    
	    System.out.println("Please enter subject number 4 and score for this subject");
	    String subject4 = scan.next();
	    double grade4 = scan.nextDouble();
	    
	    System.out.println("Please enter subject name 5 and score for this subject ");
	    String subject5 = scan.next();
	    double grade5 = scan.nextDouble();
	    
	    System.out.println("Summary: "+subject1+ " - "+grade1 +", "+subject2+" - "+grade2+", "+subject3+" - "+grade3+", "+subject4+" - "+grade4+", "+subject5+" - "+grade5);
	    
	    System.out.println("Your average score is: "+(grade1+grade2+grade3+grade4+grade5)/5);
	    
	    System.out.println("Thank you for using Grader");
	    System.out.println("Goodbye!");
	    

	    	    String str = "boopity bop";
	    	    int i = 10;
	    	    
	    	    // write code here
	    	    System.out.print(str.charAt(5));
	    	    System.out.print(str.charAt(8));
	    	    System.out.print(str.charAt(1));
	    	   // System.out.print(i.charAt(th));
	  
	  }
		
		
		
		

		
		
}
