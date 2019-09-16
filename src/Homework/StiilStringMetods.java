package Homework;

import java.util.Scanner;

public class StiilStringMetods {
	
	public static void main(String[]args) {
	
		Scanner scan= new Scanner (System.in);
	/*	System.out.println("Enter a word");
		String object = scan.nextLine();
		
		int sys = object.length();
		char num1= object.charAt(sys);
		char num2 = object.charAt(sys-1);
	
		String pi = object.substring(0,num2)+object.charAt(num1)+object.charAt(num2);
		
		
	System.out.println(pi);//?????????????????????????*/
	
	/*Ask user to enter two words. If they are equal length, print them together. If one is longer than the other one, print equal number of characters from the long one.
	Input:
	book
	pen
	Output:
	boopen
		*/
		/*System.out.println("Enter two numbers");
		String word1 =scan.nextLine();
		String word2 = scan.nextLine();
		
		int l1 = word1.length();
		int l2 = word2.length();
		
		
	if (l1==l2) {
		System.out.println("word1+word2");
	}else if (l1>l2) {
	System.out.println(word2+word1.substring(0,l2));
	}
	else 
		System.out.println("word1+word2.substring(0,l1");
	
	
	/*Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

	Input:
one
eight
Output:
	oneight
	*//*
	System.out.println("Enter two words");
	String newWord = scan.nextLine();
	String newWord2 = scan.nextLine();
	
	System.out.println(newWord+newWord2);
	
	char newWordc = newWord.charAt(newWord.length()-1);
	char newWord2c= newWord2.charAt(0);
	
	String result =(newWordc == newWord2c)? (newWordc+""):("false"
			+ "");
	System.out.println(result);
	*/
	/*
	 * for(int i = str. length() - 1; i >= 0; i--)
{
reverse = reverse + str. charAt(i);
}
System. out. println("Reversed string is:");
System. out. println(reverse);

}Ask user to enter a word. If the word has 2 or more characters, print the word. But print by changing the places of the last two characters.
Input:
system
Output:
systme
	 */
	//*Ask user to enter a word. If the work contains starts with x, print the word without x.

/*System.out.println("Enter a word");	
String str5 = scan.nextLine();


	 String D =(str5.startsWith("x"))? (str5.substring(1)):"";
	System.out.println(D);*/
		
//Ask user to enter a word. If the word has 2 more more characters, print first 2 characters of the word three times Input:

	/*String str = "banane";
	String bal1 = str.substring(0, 2);
		
	String bal = (str.length()>2)?  bal1.repeat(3)	:"";
	System.out.println(bal);
		*/
		
		
		// Ask user to enter a word. If the first or second or both letter of the word is x, print the word without x(s). If x is the third letter it should be printed. If the first and second are x, both should be ignored.
		
		String str = "xcylphone";
		String a= ""+str.charAt(0);
		String b=""+ str.charAt(1);
		
		
		

if ( a==("x") ||b==("x")) {
	System.out.println(str.substring(2));
}else if (a==("x")) {
	System.out.println(str.substring(1));
}else if (b=="x") {
	System.out.println(str.charAt(0)+str.substring(2));
}
		
		
		
		
}

	}
