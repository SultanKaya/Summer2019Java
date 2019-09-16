package ReplIt;

import java.util.Scanner;

public class ReplIt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Write a program that will print out even numbers from 2 to 100 through the comma. 


for (int i= 2;i<=100; i+=2) {

		System.out.println(i+",");
		
}
	/*  Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books 
	 * and offers 2 free books with every purchase of 8 or more books.
	 *  It offers regular customers 1 free book with every purchase of 7 or more books, 
	 *  and offers 2 free books with every purchase of 12 or more books. 
	 
 Write a program that assigns freeBooks the appropriate value based on the values of the boolean
     variable isPremiumCustomer and the int variable nbooksPurchased.
     Print amount of freeBooks into the console.
int freeBooks = 0;
Scanner scan = new Scanner(System.in);
boolean isPremiumCustomer = scan.nextBoolean();
int nbooksPurchased = scan.nextInt();
for (nbooksPurchase =0;nbooksPurchased)
if (isPremiumCoctumer && nooksPurchased/5 >0 )
	d*/


/*write a program that will look up for user
Assume that you have only 2 users: Max Payne and Alan Wake. 
First, ask user to enter full name. Display message: "Enter full name:". 
Then take input from user. If name is equals to either "Max Payne" or "Alan Wake", 
display message: "User found!". Otherwise,  display message: "User not found!".
Please make your search case insensitive!

Example:
Display message: Enter full name:
input: Max Payne
Display message: User found!
*/		
	/*Scanner scan = new Scanner (System.in);	
	String name1 = "Max Payne";
	String name2 = "Alan Wake";
	System.out.println("Display massage: Enter full name:");	
	String fullName =scan.nextLine();
if ( (fullName.contentEquals("Max Payne"))|| (fullName.contentEquals(name2))){
	System.out.println("Display massage: User found!");
}
*/
/*	Given a string word, if the first or last chars are 'x' or 'X', 
 * print the string without those 'x' or 'X' chars,  otherwise print the string unchanged. 
 
Scanner scan=new Scanner(System.in);
String word  = scan.nextLine();
String word1=word.toLowerCase();
String k= word1.substring(0,1);
String k2 =word1.substring(word1.length()-1);

if (k.contains("x") && (k2.contains("x"))) {
	System.out.println(word1.substring(1, k.length()-1));
}else if (k.equals("x")) {
	System.out.println(word1.substring(1));
}else if (k2.contentEquals("x")) {
	System.out.println(word1.substring(0,word1.length()-1));
}else {
	System.out.println(word);
}
	*//*Write a program that will reverse a string. Your program should reverse a string only 5 characters long. 
	*If word is shorter, display message: "Too short!". 
If word is longer, display message: "Too long!". 
Otherwise, reverse this word and print out result into the console. 
Example:
input: cat
output: Too short!

Example:
input: singularity
output: Too long!

Example:
input: apple
output: elppa*/
String word ="jkhkjgv";
int Length = word.length();

String result = (Length<5)? ("Too short!"):("");
System.out.println(result);

String result2 = (Length>5)?("Too long!"):("");
System.out.println(result2);
/*
We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.

 */
/*

Instructions from your teacher:
as Alejandro is time is precious and even with his little knowledge of programming he managed to save some time.
 but still he had a lot of emails to read.

he wants to add more conditions to his program, 
he wants only job related mails so he will narrow it down by also checking if the word "project" also appears
 beside his name, that way he will be sure its a job email that refers to him.
 
for example:
a = "dear alejandro.....alot of text"
outputs: "dont read"
a = "thunder blaz is the best drink in the galaxy..."
outputs: "dont read"
a = "subject : important project, alejandro we refer to you  this ...."
outputs: "read this mail"                     */

Scanner s = new Scanner(System.in);
String a = s.nextLine();

boolean result3 = a.contains("alejandro");
boolean result4 = a.contains("project");
 if ( result3 && result4) {
	 System.out.println("read this mail");
 }else {
	 System.out.println("dont read");
 }
























		
		
		
	}

}
