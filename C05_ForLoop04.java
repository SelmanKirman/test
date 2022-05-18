package day15_forLoop;

import java.util.Scanner;

public class C05_ForLoop04 {
	
	public static void main(String[] args) {
		/* Soru 5 100 den kucuk tamsayi iste . 1 den baslayarak
		 * girilen sayiya kadar 3 ve 5 in kati olan sayilari yazdir
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 100 den kucuk bir pozitif tam sayi girin ");
		
		int sayi=scan.nextInt();
		
		for (int i = 1; i < sayi; i++) {
			System.out.print(i);
		}
	}

}
