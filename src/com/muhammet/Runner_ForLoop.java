package com.muhammet;

public class Runner_ForLoop {

	public static void main(String[] args) {
		int toplam=0;
		// 1...n kadar olan sayýlarýn toplamý, ekrana yazdýr.
		for (int i = 1; i <= 10; i++) { // [1,10] -> 1...10, [1,10) 1...9
			
			//toplam = toplam + i;
			toplam += i;
			
		}
		System.out.println("Toplam....: "+ toplam);

		// 1...n kadar olan tek sayýlarýn toplamý 1,3,5,...
		for(int i=1;i<10;i+=2) System.out.println(i);
		
	}

}
