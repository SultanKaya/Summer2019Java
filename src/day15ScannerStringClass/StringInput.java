package day15ScannerStringClass;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstname = scan.nextLine();
		System.out.println(firstname);
		
		System.out.println("Enter your last name");
		String lastname = scan.nextLine();
		System.out.println(lastname);
		
	}

}
