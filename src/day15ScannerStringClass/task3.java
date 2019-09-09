package day15ScannerStringClass;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		System.out.println("what is first name?");
		String firstName = input.nextLine();
		
		System.out.println("what is your last name?");
		String lastName = input.nextLine();
	
		System.out.println("Your full name is : "+firstName+ " "+ lastName);
		
		input.close();
		
		
	}

}
