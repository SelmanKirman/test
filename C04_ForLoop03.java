package day15_forLoop;

import java.util.Scanner;

public class C04_ForLoop03 {
	
	public static void main(String[] args) {
		
		/* 100 den kucuk tam sayi iste
		 * 1 den baslazarak girilen sayiya kadar 3 un
		 * katlari olan sayilari yazdir
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 100 den kucuk pozitif bir tam sayi girin ");
		
		int sayi=scan.nextInt();
		
		for (int i = 1; i < sayi ; i ++) {
			
			if (i % 3==0) {
				System.out.print(i + " ");
			}
		}
	}

}

