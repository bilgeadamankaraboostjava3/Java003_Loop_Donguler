package com.muhammet;

public class Runner_ForLoop {

	public static void main(String[] args) {
		int toplam=0;
		// 1...n kadar olan say�lar�n toplam�, ekrana yazd�r.
		for (int i = 1; i <= 10; i++) { // [1,10] -> 1...10, [1,10) 1...9
			
			//toplam = toplam + i;
			toplam += i;
			
		}
		System.out.println("Toplam....: "+ toplam);

		// 1...n kadar olan tek say�lar�n toplam� 1,3,5,...
		for(int i=1;i<10;i+=2) System.out.println(i);
		
	}

}
