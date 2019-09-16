package ReplIt;

import java.util.Scanner;

public class ReplIt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		/*Instructions from your teacher:
You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi*/    
		
		Scanner scan  = new Scanner(System.in);
		String word = scan.next();
	
		int Length  =word.length();
		
		if (Length%2 != 0 && Length >= 3) {
			System.out.println(word.substring(Length/2,Length/2+1));
		}else if(Length%2 == 0&& Length >=4) {
			System.out.println(word.substring(Length/2-1,Length/2+1));
		}else if (Length ==1) {
			System.out.println(word+word+word);
		}else if (Length ==2) {
			System.out.println(word+word);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
