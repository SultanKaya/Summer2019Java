import java.util.Scanner;

public class nextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Enter your phone number ");
		int phonenum = scan.nextInt();
		
		scan.nextLine();// to fic nextLine issue
		System.out.println("Enter youyr name");
		String name = scan.nextLine();
		
		
		
		
		
	}

}
