package daysAllJavaClasses;

public class stringMethodsBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//isEmpty METHGOD ---> CHECS IF THE STRING IS EMTP RETURNS BOOLEAN EXPRESSION 
		String str = "Cybertek";
		
		boolean R1 = str.isEmpty();
		System.out.println(R1);
		
		
		if (str.isEmpty()) {
		
		System.out.println("its empty string");
		}else 
			System.out.println("its not empty");
		
		
		
		//equals  METHOD ---> checks if two strings are face values  VISIBLE TEXT equal or not 
		//CASE SENSIVITY DOES NOT MATTER 
		
	String A1= "Cybertek";
	String A2 = new String("Cybertek");
	System.out.println(A1 == A2);   //false 
	
	boolean R2 = A1.contentEquals(A2);
	
		System.out.println(R2);
		System.out.println("java".equals("Java"));
		
		//???????????
		
		//equalIgnoreCase     METHOD 
		
		String s1 = "JAVA";
		String s2 = new String ("java");
		
		System.out.println(s1 ==s2);
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		
		//contains   METHOD  
		
		String name = "Muhtar";
		boolean r1 = name.contains("good guy");
		System.out.println(r1);
				
				
				
		// startsWith(str)   BOOLEAN EPRESSION WOULD BE THE OUTPUT 
				
		String Today= "Java";
		 boolean r2 = Today.startsWith("J");
		
		System.out.println(r2);
		
		
		
		
		String names = "Cybertek School is great place to learn Java";
		System.out.println(names.startsWith("Cybertek") || (names.startsWith("C")));      //true
		
		
		System.out.println(names.startsWith("Cybertek") && (names.startsWith("Y"))); 
		
		
		
		//endsWith METHOD 
		
		String B1 = "Sultan Kaya";
		 boolean r3 =B1.endsWith("a");
		 System.out.println(r3);            //true
		 
		 System.out.println(B1.endsWith("M"));   //false 
		 
		 
		 
		 /*
		 13. Write a Java program to check whether two String objects contain the same data. Go to the editor

		 Sample Output:

		 "Stephen Edwin King" equals "Walter Winchell"? false                                                          
		 "Stephen Edwin King" equals "Mike Royko"? false

		*/
		 
		 String str1 = "Stephen Edwin King";
		 String str2= "Walter Winchell";
		String str3= "Mike Royko";
		
			boolean result =str.contains(str2);
			boolean result2 = str1.contains(str3);
			
			System.out.println("\""+ str1+"\""+" equals  "+"\""+ str2+"\""+"? "+result );	 
		System.out.println("\""+str1 +"\""+" equals "+"\""+str3+"\""+"? "+result2);
		
		 /*
		 Write a Java program to compare a given string to another string, ignoring case considerations. Go to the editor

Sample Output:

"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "stephen edwin king"? true 
		
		*/
		
	String str4 = "stephen edwin king";
		 boolean rt1= str1.equalsIgnoreCase(str2);
		 boolean rt2 = str1.equalsIgnoreCase(str4);
		 
		 
		 
		 System.out.println("\""+str1 +"\""+" equals " +"\""+str2 +"\""+" ? "+ rt1);
		 System.out.println("\""+str1 +"\""+" equals "+ "\""+str4+"\""+" ? "+ rt2);
		 
		 
		 
		
		 
		 
		 

	}

}
