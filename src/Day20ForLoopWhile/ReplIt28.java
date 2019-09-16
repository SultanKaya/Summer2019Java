package Day20ForLoopWhile;

import java.util.Scanner;

public class ReplIt28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner (System.in);
		   
		    
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
		  String report= "";
		   report = report+(count1>0?"Item1: "+item1+"price: "+ price1+count1:"" );
		    report = report+(count3>0?", ":"");
		    report = report+(count2>0?"Item2 "+item2+"Price: "+price2*count2:"");
		   report = report+(count3>0?", ":"");
		    
		    report = report+(count3>0? item3+"Price: "+price3*count3:"");
		    System.out.println(report);
		    
		   System.out.println("Total price: "+totalPrice);
		    
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
