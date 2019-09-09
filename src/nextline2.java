import java.util.Scanner;

public class nextline2 {

	public static void main (String[]args) {
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Please enter your zip code");
		
		
		int zipcode = input.nextInt();
		input.hasNextLine();//IMPORTANT
		System.out.println("Please enter your city name");
		String cityname = input.nextLine();
		
		System.out.println("zipcode is "+ zipcode);
		System.out.println("city nbame is "+cityname);
		
		
		System.out.println("Enter your phone number");
		
		int pn = input.nextInt();
		input.nextLine();                 //IMPORTANT 
		System.out.println("enter your state name ");
		
		String sn = input.nextLine();
		System.out.println(zipcode);
		System.out.println(sn);
		System.out.println(pn);
	}
}
