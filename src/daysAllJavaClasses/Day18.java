package daysAllJavaClasses;

import java.util.Scanner;

public class Day18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//WARM UP
		Scanner input = new Scanner (System.in);
				
		System.out.println("Enter your first and last name");
		String firstName = input.next();
		input.nextLine();           //THIS ONE TAKES OUT THE "ENTER" FROM SCANNER
		String lastName = input.nextLine();
		//String initials = firstName.substring(0)+lastName(lastName.substring(0));)
		
		//System.out.println("initial is "+ initials)?//soo far when we execute it will print whole first nasme and last name 
		//String initials = firstName.substring(0,1)+lastName.substring(0,1);
		
		
		String initials = ""+firstName.charAt(0)+"."+lastName.charAt(0);      //WE PUT "" TO MAKE CHAR PRIMITIVE TURN INTO STRING ???*******IMPORTANT 
		// WE PUT "." SO STRING VALUE CONCAT WITH CHAR BUT RESULT WOULD BE STRING ANYWAY
		
		
		 initials = initials.toUpperCase();      // YOU NEED TO ASSIGN AGAIN TO TURN INTO UPPERCASE BECAUSE STRING IS IMMUTABLE
		
		System.out.println("Initials is "+initials);
		
		//String lastLetter = ""+firstName .charAt(firstName.length()-1);
		
		//OR 
		
		int firstNameIndext = firstName.length()-1;
		
		int lastNameIndex  = lastName.length()-1;
		String LastLetters = ""+firstNameindex
		
		
		
		System.out.println(lastLetter);
		
		
		
		
		
		
		
		

	}

}
