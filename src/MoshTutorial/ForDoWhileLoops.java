package MoshTutorial;

import java.util.Scanner;

public class ForDoWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//FOR LOOPS *************************
		for (int i =0;i<5;i++) {
			System.out.println("hello world"+ i);
		}
		
		//WHILE LOOPS **********************
		
		int a =0;
		while (a>0) {
			System.out.println("Hello world "+ a);
			a--;
		}
		
		Scanner scan = new Scanner (System.in);
		
		/*
		
		String input = "";
	
		while (!input.contentEquals("quit") ){
			System.out.println("Enter a input:");
		input = scan.nextLine().toLowerCase();
	System.out.println("input is:"+ input );
		}
		
		*/
		
		
		//DO WHILE LOOPS ***********************
		
		String input2 ="";
		
		do {
			System.out.println("input:");
			input2 = scan.next().toLowerCase();
			System.out.println(input2);
			
		}while(!input2.contentEquals("quit"));
		
		
		
		
		
		
		
		
		// BREAK AND CONTINIUE STATEMENTS *************
		

		String input3 ="";
		while (true) {
			System.out.println("input ");
			input3 = scan.next().toLowerCase();
			if (input3.equals("pass"));
			continue;
			if (input3.contentEquals("quit")) {
				break;
			}
			
		
			}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
					
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
