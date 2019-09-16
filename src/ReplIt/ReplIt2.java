package ReplIt;

import java.util.Scanner;

public class ReplIt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Write a program that will print out information about user based on email.
	 *  Print first and last name from the upper case.
	 *//*
Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com                     */
		
	/*	   Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		
		int end1 =email.indexOf("_");
		int end2 = email.indexOf("@");
		int end3 = email.indexOf(".");
		int end4= email.length();
		
		String beg1 = email.substring(0,1).toUpperCase();
		String beg2= email.substring(end1+1,end1+2).toUpperCase();
		String name = beg1+email.substring(1,end1);
		String lastName = beg2+email.substring(end1+2,end2);
		String Domain = email.substring(end2+1,end3);
		String TopLevel = email.substring(end3+1,end4);
		
		System.out.println("First name: "+name);
		System.out.println("Last name: "+lastName);
		System.out.println("Domain: "+Domain);
		System.out.println("Top-Level Domain: "+TopLevel);
		    
		    */
		    /*
		We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
*//*
		Scanner scan = new Scanner (System.in);
	    String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
int b1= message.indexOf("<");	    
int e1  =message.indexOf(">");

int b2 = message.indexOf("[");
int e2 =message.indexOf("]");

int b3 = message.indexOf("{");
int e3 =message.indexOf("}");

System.out.println("Sender: "+message.substring(b1+1,e1));
System.out.println("Phone Number: "+ message.substring(b2+1,e2));
System.out.println("Message body: "+message.substring(b3+1,e3));
	  	*/
		/*
		    Online Book Merchants offers premium customers 1 free book with every purchase of 5 or
		     more books and offers 2 free books with every purchase of 8 or more books. 
		     It offers regular customers 1 free book with every purchase of 7 or more books,
		      and offers 2 free books with every purchase of 12 or more books. 
 Write a program that assigns freeBooks the appropriate value 
 based on the values of the boolean variable isPremiumCustomer and the int variable nbooksPurchased. 
 Print amount of freeBooks into the console. */
		
		/*int freeBooks = 0;
		    Scanner scan = new Scanner(System.in);
		    boolean isPremiumCustomer = scan.nextBoolean();
		    int nbooksPurchased = scan.nextInt();
		 
		if (isPremiumCostumer ==true && nbooksPurchased>5) {
			System.out.println("1");
		}
		else if (isPremiumCostumer ==true && nbooksPurchased>8) {
			System.out.println("2");
		}else if (isPremiumCostumer ==false && nbooksPurchased>7) {
			System.out.println("1");
		}else if (isPremiumCostumer == false && nbooksPurchased >12) {
			System.out.println("2 freebooks");
		}
		*/
		
		/*
		 Scanner scan = new Scanner(System.in);
		  char start = scan.next().charAt(0);
		    char end = scan.next().charAt(0);
		    
		    String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		  String lowercase ="abcdefghijklmnopqrstuvwxyz";
		
		  int m = letters.indexOf(start);
		  int m1 = lowercase.indexOf(end);
		  
		  int m3 = letters.indexOf(end);
		  int m4 = lowercase.indexOf(start);
		  String squence = ""+start+end;
		  
		boolean result = lowercase.contains(squence);
		  boolean result2 =letters.contains(squence);
		  
		  if (result ==true){
		    System.out.println(lowercase.substring(m4,m1));
		  }else if (result2 == true){
		    System.out.println( letters.substring(m,m3));
		  }
		  */
		
		String someString = "elephant";
		char someChar = 'e';
		int count = 0;
		  
		for (int i = 0; i < someString.length(); i++) {
		    if (someString.charAt(i) == someChar) {
		        count++;
		    }
		}
		assertEquals(2, count);                    
		
		
		

		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		
		
		
		
		
		
		
	}

	private static void assertEquals(int i, int count) {
		// TODO Auto-generated method stub
		
	}

}
