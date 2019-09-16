package days19;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int b = 0; b<=10 ; b++ ){
			System.out.println("Value of b is :"+b);
			}
			for(int i= 0; i<=100; i+=5) {
				System.out.println("zeynep and ayse "+i);
			}
		//TASK 1 -
		
		for (int a =1; a<=100; a+=3) {
			System.out.println("value of the number is :"+ a);
		}
		
		//TASK2 - 
		
		for (int i = 1; i<=10; i++) {
			System.out.println("square of "+i +" is "+ i*i);
		}
		
		
		//write a program that displays each even numbers between 1 to 32 
		for (int c = 1;c<=33; c++) {
			if (c%2 ==0) {
				System.out.println(c);
			}
		}
		
		//TASK4- 
		

	for (int t =1;t<=32;t++) {
		if (t%2!=0) {
			System.out.println(t);
		}
	}
		
		String str ="Java";
		String Rev =""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
		String Reversed = "";
		for (int d =str.length();d>+0;d--) {               //Important for (int d =str.length-1
			Reversed+=str.charAt(d);
			
		}
		System.out.println(Reversed);
		
		
		

	}

}
