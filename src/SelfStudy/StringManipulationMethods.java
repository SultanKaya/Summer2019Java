package SelfStudy;

import java.util.Scanner;

public class StringManipulationMethods {
    public static void main(String[] args){
	
	/*
	String s1,s2;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 2 strings");
	s1 = sc.nextLine();
	s2 = sc.nextLine();
	
	int l1 = s1.length();
	int l2 =s2.length();
	System.out.println(l1);
			
	String s3 = s1.concat(s2);
	
	System.out.println("Result on concatenation is: "+s3);
	
	System.out.println(s1.toUpperCase());
	*/
    	//helloName("Bob") → "Hello Bob!"
    	//helloName("Alice") → "Hello Alice!"
  //helloName("X") → "Hello X!"
    	/*
String Name = "HelloNameBob";
String Name2 = "HelloNameAlice";
String R  = (Name.substring(0,5))+" "+(Name.substring(9));
String M= (Name2.substring(0,5))+" "+(Name2.substring(9));
System.out.println(R);
System.out.println(M);	
    	*/

/*Given an "out" string length 4, such as "<<>>", and a word, 
 * return a new string where the word is in the middle of the out string, e.g. "<<word>>".
 *  Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
  */
  /*String ban ="<<>>";
  String ban2 = "Yay";
  String ban3 = ban.substring(0, 2)+ban2.substring(0)+ban.substring(2);
    			
    	System.out.println(ban3);
    	
    	
    	
    /* Scanner scan = new Scanner (System.in);
    	    
    	    System.out.println("Enter Item1,count and its price:");
    	    String item1 = scan.nextLine();
    	    int count1 = scan.nextInt();
    	    double price1 = scan.nextDouble();
    	    
    	    System.out.println("Enter Item2, count and its price:");
    	    String item2 = scan.nextLine();
    	    int count2 = scan.nextInt();
    	    double price2 = scan.nextDouble();
    	    
    	    System.out.println("Enter Item3, count and its price:");
    	    String item3 = scan.nextLine();
    	    int count3 = scan.nextInt();
    	    double price3 = scan.nextDouble();
    	    
    	     double totalPrice = (count1>0? price1*count1:0)+
    	    (count2>0?price2*count2:0)
    	+(count3>0?price1*count1:0);
    	  String report = "";
    	   report = report+(count1>0?"Item1: "+item1+"price: "+ price1+count1:"" );
    	    report = report+(count3>0?", ":"");
    	    report = report+(count2>0?"Item2 "+item2+"Price: "+price2*count2:"");
    	   report = report+(count3>0?", ":"");
    	    
    	    report = report+(count3>0? item3+"Price: "+price3*count3:"");
    	    System.out.println(report);
    	    
    	   System.out.println("Total price: "+totalPrice); 	
    	*/
    	/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo'"

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
  */
    /*	String str = "woooohooo";
    	int str1 =str.length();
    		String result =	( str1%2==0)? str.substring(0,str1/2):(str.substring(0,str1/2+1));
    		
    		System.out.println(result );
    	                              *//*
    	Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1  
    	nonStart("Hello", "There") → "ellohere"*/
    	/*
    	String str = "hello";
    	String str1 = "there";
    	String result = str.substring(1)+str1.substring(1);
    	System.out.println(result);*/
    	
    	/*
    	String str = "abcdefghijk";
    	int Length = str.length();
    	String result = (Length%2 !=0)? (str.substring(Length/2-1,Length/2+2)):(str.substring(Length/2,Length/2+2));
    	System.out.println(result);
    	*/
    	/*String a="java";
    	String b= "uncool";
    	
    	String result = (a.substring(0,1)+ b.substring(b.length()-1));
    	System.out.println(result);*/
    	
    	/*Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
    	 * The string may be any length. If there are fewer than 2 chars, use whatever is there.
extraFront("Hello") → "HeHeHe"*/

  /*String str ="Zeynep";
  
  String result = str.substring(0,3);
  System.out.println(result.repeat(3));*/
    	
    	
    	/*Given a string and a second "word" string,
    	 *  we'll say that the word matches the string if it appears at the front of the string, 
    	 *  except its first char does not need to match exactly. On a match, return the front of the string,
    	 *   or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". 
    	 *   The word will be at least length 1.
    	startWord("hippo", "hi") → "hi"
    	startWord("hippo", "xip") → "hip"
    	startWord("hippo", "i") → "h"*/
    	
  /*  String str = 	"reword";
    String str2 = "word";
  String  bey =str.substring(str.length()-4);
  String result =( "" +str.contains(bey)) != null? (str.substring(str.length()-4)) :("");
  
    	System.out.println(result);*/
    	
    	
    	
  
   
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	
}
}
