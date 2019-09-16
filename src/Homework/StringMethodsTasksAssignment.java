package Homework;

import java.util.Scanner;

public class StringMethodsTasksAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a word");
		String object = scan.nextLine();
		
		int sys = object.length()-1;
		char nUM2= object.charAt(sys);
		char nuM = object.charAt(sys-1);
		
		String RESult = (sys>=2)?  (object):(object.replace(nUM2,nuM));
		
		
		
	/*	Write a program StartEndWords:
you have 2 words that must be 5 characters, and check if last letter of first word and first letter of 
second work are same.
			if either one not 5 chars length:    print "need to be exactly 5 chars length"
			if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
			if they do not match:  print "Buzz - did not match"	
		
		*/
		String str1 = "Hello";
		String str2 = "movie";
		
	if ( (""+str1.charAt(0)) ==( ""+str2.charAt(4))){
	
		System.out.println("Fizz");
		
	}else if  ( (""+str1.charAt(0)) !=( ""+str2.charAt(4))) {
		
		
		System.out.println("Buzz - did not match");
		
	}else
		System.out.println("need to be exactly 5 chars length");
	/*	
	Ask user to enter two words. Print true is the first two characters of the first word and last two characters of the second word are same characters, print false otherwise.
	Input:

	banana

	abba

	Output:

	true*/
	
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter two words");
		String word = scan1.nextLine();
		String word2 = scan1.nextLine();
		
String STRING = word.substring(0,2);
String STRING2= word2.substring(4,6);

String RESULT = (STRING.equalsIgnoreCase(STRING2))? "true":"false";
System.out.println(RESULT);
/*
Ask user to enter a word. Print "really?"  if the word ends with ly, print "never mind" otherwise.
Input:
Seriously
Output:
really?*/

System.out.println("Enter a word");
String WORD = scan1.nextLine();


String R = (WORD.endsWith("ly"))?"really?" :"never mind" ;
System.out.println(R);







/*Write a Java method to display the middle character of a string. Go to the editor
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.


Input:
Input a string: elephant 
Output:

The middle character in the string: ph
*/
	
	/*
String love = "I love my daughters, my husband and our cats.";
int ku= (love.length());

int middle = ku/2;
int middle2 =ku/2+1;

String r1 =love.substring(middle2);
String r2 = love.substring(middle, middle2);

if ((ku%2)!=0) {
	System.out.println(r1);
}else
	System.out.println(r2);

*/
/*	Write a program CheckWords:

		Program accepts 3 words and :
		- if they are same length:      print "All words are same length"
		- if some same length and others not:    print "Not Same nor Different lengths"
		- if all different length :  print "All different length"
*/
	/*
String s1 = "chrome";
String s2 = "google";
String s3 = "youtube";

int S1= s1.length();
int S2 = s2.length();
int S3 = s3.length();
if (S1 ==S2 && S1==S3 && S2==S3)
System.out.println("ALL WORDS ARE SAME LENGTH");

else if (S1 ==S2 || S1==S3 ||S2==S3) {
	System.out.println("Not same nor Different");

}else
	System.out.println("All different length");
	*/

	/*
	Write a Java program that can check the URL

Valid extensions for URL are: com, net, edu, org, gov

- check that it starts with www.
- check if it contains the ending dot right before the extension
- assign String domain and 
String extension.
- print them
"Domain:" amazon
"Extension:" com */
	/*String address = "www.zasultan80@gmail.com";
	
	boolean l1 =address.startsWith("www");
	System.out.println(l1);
	
	boolean l2 = address.endsWith(".");
	System.out.println(l2);
	
	int domain = address.indexOf("@")+1;
	int domain2 = address.indexOf(".c");
	
	String last = address.substring(domain,domain2);
	System.out.println("domain is:"+last);
	
	System.out.println(address.substring(address.length()-3));*/
	
	/*Ask user to enter two words. Print first word without its first character then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana8*/

	//Scanner scan = new Scanner(System.in);
	System.out.println("Enter two words");
	String string =scan1.nextLine();
	String string2 = scan1.nextLine();
	
	System.out.println(string.substring(1));
	
	System.out.println(string2.substring(1));
	
	/*Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
Input:
abba
Output:
true */
	
	System.out.println("Enter a your name");
	String name = scan1.nextLine();
	
	char letter = name.charAt(0);
	char letter2 = name.charAt(name.length()-1);
	
	if (letter == letter2) {
		System.out.println("true");
	}else 
		System.out.println("false");
	
	/*
	Ask user to enter a word. If the word has 2 or more characters, print the word. But print by changing the places of the last two characters.
Input:
system
Output:
systme
*/
	System.out.println("Enter a word");
	String object1 = scan1.nextLine();
	
	int LEngth = object1.length()-1;
	char n1= object1.charAt(LEngth);
	char n2 = object1.charAt(LEngth-1);
	
	String REsult = (LEngth>=2)?  (object1):(object1.replace(n1,n2));
	
	/*
	System.out.println("Enter string to reverse:");
	
	Scanner read = new Scanner(System.in);
	String str = read.nextLine();
	String reverse = "";
	
	for(int i = str.length() - 1; i >= 0; i--)
	{
		reverse = reverse + str.charAt(i);
	}
	
	System.out.println("Reversed string is:");
	System.out.println(reverse);
}
	*/
	
	
	

	}

}
