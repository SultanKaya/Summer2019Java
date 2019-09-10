package daysAllJavaClasses;


public class WarmUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 *" enter your first name
	 mUhTar
	 "Enter your last name 
	 cYBtEk
	 output should be :Muhtar Cybertek
	 
	 * 
	 * */	
		/*
	Scanner scan = new Scanner (System.in);       //SOLUTION WITH SUBSTRING
		System.out.println("Enter your first name");
		String firstName =  scan.nextLine();
		//mUhTAr
		firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
		
		System.out.println(firstName);
		
		
		System.out.println("Enter your last name");
		String lastName =scan.nextLine();
		// cYberTEK
		
		lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(0).toLowerCase();
		
		System.out.println(lastName);
		
		*/
		
		//SOLUTION WITH charAt METHOD 
		//indexOf(str)    ---->returns the index number of the furst character in the given String as an int value
		/*
		String A1 = "Batch 12 is a great batch";
				 int num = A1.indexOf("g");
				 
				 System.out.println(num);
	int num2 = A1.indexOf("eat"+2);//2                            )int num2= A1.indexOf("at");
		
				System.out.println(num2); // negative number means str is not exist ind STring 
				 
			
		String B1 = "Today is tuesday,today we have class in the afternoon";	
		
		int n1 = B1.indexOf("te");
		System.out.println(n1);
		8?*/
		/*
		String Address = "7925 Jones Branch Dr, Mclearn,VA 22003";
		int begin = Address.indexOf(",")+2;
		int end = Address.indexOf(", V");
		
		String cityName= Address.substring(begin,end);
		System.out.println(cityName);
		
		*/
		/*
		String email = "RnadomEmails@gmail.com";
		int begin2 = email.indexOf("@"+1);
		int end2 = email.indexOf(".com");
				
		String emailType = email.substring(begin2,end2);
		System.out.println(emailType);
		*/
			
		//lastIndexOf METHOD
		
		String str = "ABCDABCD";
				int n2 = str.indexOf("B");
				System.out.println(n2);
				int n3 = str.lastIndexOf("B");
				System.out.println(n3);
				
				
				
				String myEmail = "Myemail.school@gmail.com";
				int begin = myEmail.indexOf("@")+1;
				int end = myEmail.lastIndexOf(".");
				 String myEmailType = myEmail.substring(begin,end);
				
				
				System.out.println(myEmailType);
				
				
				
				
				
				
				

	}

}
