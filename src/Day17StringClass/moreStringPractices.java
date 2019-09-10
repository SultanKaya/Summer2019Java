package Day17StringClass;

import java.util.Scanner;

public class moreStringPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
         
//write code below
		  /*
System.out.println(str.substring(5,23));
System.out.println(str.substring(7,10));

//fill in the blanks below:
System.out.println(str.substring(16,23)); //fill in substring so it prints "harambe"
System.out.println(str.substring(3,12)); 
		*/	

		/* For you to do:

			 Given a string variable "word", do the following tests

			 If the word ends in "y", print "-ies"
			 If the word ends in "ey", print "-eys"
			 If the word ends in "ife", print "-ives"
			 If none of the above is true, print "-s"
			 No more than one should be printed.
		  */
		  
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String word = inp.nextLine();
		
	  	if (word.endsWith("y")) {
	  		System.out.println("-ies");
	  	} else if (word.endsWith("ey")){
	  		
	  		System.out.println("-eys");
		
	}else if (word.endsWith("ife")){
		System.out.println("-ives");
	}else
		System.out.println("-s");

}
}