package day15_forLoop;

import java.util.Scanner;

public class C07_ForLoops06 {
	
	public static void main(String[] args) {
		
		/*Kullanicidan String iste tersten yazdir */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir Sting isteyin");
		
		
		String kelime=scan.nextLine();
		
		for (int i = 0; i < kelime.length(); i ++) {
			System.out.print(kelime.substring(kelime.length()-1-i, kelime.length()-1-i+1));
			
		}
	}

}
