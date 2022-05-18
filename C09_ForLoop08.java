package day15_forLoop;

import java.util.Scanner;

public class C09_ForLoop08 {
	
	public static void main(String[]args) {
		
		// Faktoriyel bulma
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 10 dan kucuk bir pozitif tam sayi girin ");
		
		int sayi=scan.nextInt();
		
		System.out.print(sayi + "! = ");
		
		int faktoryel=1;
		for (int i = 1; i < sayi; i++) {
			
			System.out.print( i + " * " );
			faktoryel*=(i+1);
			
		}

	    System.out.println(sayi + " = " +  faktoryel);
	    
	    // kullanici 5 girdiysa bu islemin sonucunda konsolda 5!=1*2*3*4*5 = 120 yazdiralim
	    
	    
	    
	}
	
	
}


