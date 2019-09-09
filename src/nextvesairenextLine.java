import java.util.Scanner;

public class nextvesairenextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		/*
		
		System.out.println("Enter your first name");
		String f= scan.next();                           //Next method only  takes  one word*****IMPORTANT
		
		
		System.out.println("Enter last name");
		
		String L= scan.next();
		
		
		System.out.println("Your first name is: "+f);
		
		System.out.println("Your last name is: "+ L);        
		
		*/
		
		
		System.out.println("Enter your first name");   //USE NEXTLINE METHOD NOW
		String f= scan.nextLine();                          
		
		
		System.out.println("Enter last name");         // it ALLOWS FOR A SENTECE TO SCAN AS NEXTLINE method UNLIKE NEST method
		
		String L= scan.nextLine();
		
		
		System.out.println("Your first name is: "+f);
		
		System.out.println("Your last name is: "+ L);        
		
		
		
		
		
		
	}

}
