package Day20ForLoopWhile;

import java.util.Scanner;

public class warmUpTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// print find the sum of all number from 1 to 1000	
		
		int sum = 0;
	for (int num=1;num<=1000;num++) {
	sum+=num;
	}
		System.out.println(sum);
		
		
		
		
	// sum of even numbers between 	1 to 1000
		int sum2= 0;
		for (int num1 =1;num1 <=1000 ;num1++ ){
		if  ( num1 %2==0)
		sum2+=num1;
		}
		System.out.println(sum2);
		
		
		//SECOND SOLUTION 
		int sum3 =0;
		for ( int a =2; a <=1000; a+=2 ) {
			sum3+=a;
		}
		System.out.println(sum3);
		
		
		//find the sum of odd numbers between 1 to 1000
		
		int sum4 =0;
		for (int b =1; b<=1000; b+=2 ) {
			sum4+=b;
		}
		System.out.println(sum4);
		// write a program that asks user to enter number 10 times;
		//find the sum of those 10 inputs 
		
		
		Scanner scan = new Scanner (System.in);
		
		int Sum  =0;
		for (int z = 1; z <=5;z++) {
		System.out.println("Enter your number");
		int inputNum =scan.nextInt();
		Sum+=inputNum;
		}
		System.out.println("Sum is:"+ Sum);
		
		//find maximum number and the minimum number 
		
		int max = 999999999;
		for ( int c = 1;c <=5;c++) {
			System.out.println("Enter a number ");
			int inputnum = scan.nextInt();
			if (inputnum >max) {
				max = inputnum;
				
			}
		}
		System.out.println("Maximum number is:"+max );
	
		
		
		int min = 0 ;
		for (int abc = 0;abc<=5; abc++) {
			System.out.println("Enter a number");
			int input = scan.nextInt();
			if (input<min) {
				min=input;
				
			}
			
		}System.out.println("Minimum n umber is :"+min );
		
		
		
		
		
		
		
		
		
		
		
	}	

}
