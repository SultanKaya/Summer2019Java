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
    	 Scanner scan = new Scanner(System.in);
    	    System.out.println("Welcome to the Grader!");
    	    
    	    System.out.println("Please enter subject name number 1 and score for this subject");
    	    String subject1 = scan.nextLine();
    	    double grade1 = scan.nextDouble();
    	    
    	    System.out.println("Please enter subject name number 2 and score for this subject");
    	    String subject2 = scan.nextLine();
    	    double grade2 = scan.nextDouble();
    	    
    	    System.out.println("Please enter subject name number 3 and score for this subject");
    	    String subject3 = scan.nextLine();
    	    double grade3 = scan.nextDouble();
    	    
    	    System.out.println("Please enter subject number 4 and score for this subject");
    	    String subject4 = scan.nextLine();
    	    double grade4 = scan.nextDouble();
    	    
    	    System.out.println("Please enter subject name 5 and score for this subject ");
    	    String subject5 = scan.nextLine();
    	    double grade5 = scan.nextDouble();
    	    
    	    System.out.println("Summary: "+subject1+ "-"+grade1 +", "+subject2+"-"+grade2+", "+subject3+"-"+grade3+", "+subject4+"-"+grade4+", "+subject5+"-"+grade5);
    	    
    	    System.out.println("Your average score is: "+(grade1+grade2+grade3+grade4+grade5)/5);
    	    
    	    System.out.println("Thank you for using Grader");
    	    System.out.println("Goodbye!");
	

	
	
}
}
