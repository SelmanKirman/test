package day15_forLoop;

import java.util.Scanner;

public class C06_ForLoop05 {
	
	public static void main(String[] args) {
		/*
		 * Int Question 100 den kucuk bir sayi girin
		 * 1 den baslayarak girilen sayiya kadar tum sayilari yazdirin.
		 * Ancak
		 * Sayi 3 un kati ise  sayi yerine Java
		 * Sayi 5 in kati ise  sayi yerine Guzeldir
		 * Sayi hem 3 hem de 5 in kati ise sayi yerine Java guzeldir yazdirin
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 100den kucuk pozitif bir tam sayi giriniz");
		
		int sayi=scan.nextInt();
		
		for (int i = 1; i <= sayi ; i++) {
			if(sayi%3==0 && sayi%5==0) {
				System.out.print("Java guzeldir, ");
			}else if (i%3==0) {
				System.out.print("Java, ");
			}else if (i%5==0) {
				System.out.print("Guzeldir ");
			}else {
				System.out.print(i + ",");
			}
		}
	}

}
