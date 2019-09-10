package Day17StringClass;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello Javengers";
		String str2 = "Hello Javengers";
		boolean R1 = str1 ==str2;        //since ther are located in same memory it is tRUE
		System.out.println(R1);
		
		
		
		String str3 = new String("Hello Javengers");
		
		String str4 = new String("Hello Javengers");
		
		boolean R2 = (str3 ==str4);       //FALSE SINCE WE CREATED NEW STRING THEY ARE IN DIFFERENT MEMORY LOCATION 
		System.out.println(R2);
		
		boolean R3 = (str1 ==str3);     //FALSE 
		System.out.println(R3);
		
		/*
		STRING METHODS
		concat,Length,charAt,toUpperCase,toLoverCase,contains(boolean),trim,substring,toCharArray,replace(have two types)(old char,new char)
		convert replace ,
		
		 */
		//SUBRSTRING    
		
		String Str = "Cybertek School";
		
		Str = Str.substring(9);
		System.out.println(Str);

		
		String Address = "1621 ponderosa dr. 75002 Allen TX ";
		String zipcode = Address.substring(19);
		System.out.println(zipcode);
		
		
		String street = Address.substring(5,18);//ending index num will be excluded then it returns it as a NEW String value
		System.out.println(street);
		
		System.out.println(Address.substring(0,5));
		String city = Address.substring(19, 23+1);   //since ending index excluded we put +1 to get exact result
		
		String city1 = Address.substring(19, 24);
		System.out.println(city);
		System.out.println(city1);
		
		
		
		
		String love = "I love my kids";
		String love2 = love.substring(10, 13+1);
		System.out.println(love2);
		
		//REPLACE (char old,char new) replaces all old char values to new char values returns it as NEW string value 
		
		String life1 = "Java fun programming language";
		life1 = life1.replace('a', 'e');
		System.out.println(life1);
		//OR
		System.out.println(life1.replace('a', 'e'));
		
	//REPLACE (ols str,new str) all returns itb as NEW string value
		
		String myHouse = "I did great job with my house ";
		
		System.out.println(myHouse.replace("great","awesome"));
		System.out.println(myHouse);    //output didn't chance because I didn't assign myHouse again like I did above at life1
		
		
		 myHouse = myHouse.replace("great", "incredible");
		
		System.out.println(myHouse);
		
		
	//replaceFirst():          replaceFirst(old str,new str): just replaces first occured one ONLY and returns it as new string value
		
		//replaceAll():
		
		
		String az = "They are adorable and They are so sweet";
		 String az1= az.replaceFirst("They","AyseZeynep");
		String az2 = az.replace("They", "They");
		 
		 
		System.out.println(az);
		System.out.println(az1);
		System.out.println(az2);
		
		/*
		 * 	String targetString = "Java is fun to learn";
		String s1= "JAVA";
		String s2= "Java";
		String s3 = "  Hello Java  ";
		
		System.out.println("Char at index 2(third position): " + targetString.charAt(2));
		System.out.println("After Concat: "+ targetString.concat("-Enjoy-"));
		System.out.println("Checking equals ignoring case: " +s2.equalsIgnoreCase(s1));
		System.out.println("Checking equals with case: " +s2.equals(s1));
		System.out.println("Checking Length: "+ targetString.length());
		System.out.println("Replace function: "+ targetString.replace("fun", "easy"));
		System.out.println("SubString of targetString: "+ targetString.substring(8));
		System.out.println("SubString of targetString: "+ targetString.substring(8, 12));
		System.out.println("Converting to lower case: "+ targetString.toLowerCase());
		System.out.println("Converting to upper case: "+ targetString.toUpperCase());
		System.out.println("Triming string: " + s3.trim());
		System.out.println("searching s1 in targetString: " + targetString.contains(s1));
		System.out.println("searching s2 in targetString: " + targetString.contains(s2));

		char [] charArray = s2.toCharArray();
		System.out.println("Size of char array: " + charArray.length);
		System.out.println("Printing last element of array: " + charArray[3]);

	
		 */
		
		String targetString = "Java is fun to learn";
		String s1 = "JAVA";
		String s2 = "java";
		String s3 = "Hello Java";
		System.out.println(targetString.charAt(2));
		
		System.out.println(targetString.concat("-Enjoy-"));
		System.out.println(targetString.equalsIgnoreCase(s1));
		System.out.println(s2.equals(s1));
		System.out.println(targetString.length());
		System.out.println(targetString.replace("fun", "easy"));
		System.out.println(targetString.substring(8));
		System.out.println(targetString.substring(8, 12));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println("Trimming string:"+targetString.trim( ));
		System.out.println(targetString.contains(s2));
		System.out.println("searching s1 in targetString:"+targetString.contains(s1));
	
		char [] charArray = s2.toCharArray();                               //REPEAT AGAIN ,DIDN,T GET IT NOW THIS LINE AND NEXT LINE
		System.out.println("size of char array:"+ charArray.length);
		
		System.out.println("Printing last element of array:"+charArray[3]);
		
		/*Original String = Java Exercises!                                                                             
				The character at position 0 is J                                                                              
				The character at position 10 is i 
		
		*/
		
		String os = "Java Exercices!";
		System.out.println(os.charAt(0));
		System.out.println(os.charAt(10));
		
		
		/*   Original String : w3resource.com                                                                              
		Character(unicode point) = 119                                                                                
		Character(unicode point) = 99
		
		*/
		
		System.out.println(os.codePointAt(11));
		System.out.println(os.codePointAt(6));
		
		/*
		5. Write a java program to compare two strings lexicographically. Go to the editor

Sample Output:

String 1: This is Exercise 1                                                                                  
String 2: This is Exercise 2                                                                                  
"This is Exercise 1" is less than "This is Exercise 2" 
*/
		String e1="This is exercise 1";
		String e2= "This is exercise 2";
		
	String e3 = (e1.length()>(e2.length())?(e1 +" is less than "+e2):(e2 +" is less than "+e1));
System.out.println(e3);
/*
String 1: PHP Exercises and                                                                                   
String 2: Python Exercises                                                                                    
The concatenated string: PHP Exercises and Python Exercises

*/

String p1  = "Php Exercises and " ;
String p2 = "Phyton Exercises";

System.out.println(p1.concat(p2));
/*
Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false
*/
String try1 = "Example.com";
String try2 ="example.com";
CharSequence m = "example.com";
System.out.println("comparing "+try1+" and "+m +" is "+(try1.contentEquals(m)));
System.out.println("comparing "+ try2+ " and "+m+" is "+(try2.contentEquals(m))    );


/*
12. Write a Java program to check whether a given string ends with the contents of another string. Go to the editor

Sample Output:

"Python Exercises" ends with "se"? false                                                                      
"Python Exercise" ends with "se"? true


        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        // The String to check the above two Strings to see
        // if they end with this value (se).
        String end_str = "se";

        // Check first two Strings end with end_str
        boolean ends1 = str1.endsWith(end_str);
        boolean ends2 = str2.endsWith(end_str);

        // Display the results of the endsWith calls.
        System.out.println("\"" + str1 + "\" ends with " +
            "\"" + end_str + "\"? " + ends1);
        System.out.println("\"" + str2 + "\" ends with " +
            "\"" + end_str + "\"? " + ends2);
    }
}
*/

String End = "Phyton Exercise";
String End2 = "Phyton Exercises";
 String End3= "se";
 
boolean result1 = End.endsWith("se");
boolean result2 = End2.endsWith("se");

System.out.println("\" "+End+ " ends with "+ "\" "+End2+result1);



	}

}
