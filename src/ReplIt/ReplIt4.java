package ReplIt;

import java.util.Scanner;

public class ReplIt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
		   boolean isPremiumCustomer = scan.nextBoolean();
		    int nbooksPurchased = scan.nextInt();
		    
		    	boolean isPremiumCostumer = scan.hasNextBoolean();
	if (isPremiumCostumer){
				if (nbooksPurchased>=5) {
					System.out.println("1");
			}else{
				   if (nbooksPurchased>=7) {
					System.out.println("1");
				}else if (nbooksPurchased >=12) {
					System.out.println("2 freebooks");
				}
				}
					}
				else if (isPremiumCostumer && nbooksPurchased>=8) {
					System.out.println("2");
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
					
		
	}

}
