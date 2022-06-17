package com.muhammet;

public class Runner {

	public static void main(String[] args) {
		// D�ng� ->
		// for d�ng�s� -> D�ng�n�n devam�n� sa�layan ana ko�ul
		// orta k�s�mda yazm�� oldu�unuz ili�kinin do�ru olmas� ko�uludur yani;
		// ko�ul sa�land�k�a d�ng� devam etsin.
		// i -> index
		for(int i=0;i<10;i++) { // i=10 oldu�unda s�sl�parantez i�i �al��maz
			System.out.println("Muhammet HOCA"+ i);
		}// for d�ng� sonu
		
		// �NEML�!!! s�sl�parantezler -> d�ng�, ko�ul operat�rlerinde tek bir sat�r i�in 
		// kullan�mlarda eklenmek zorunda de�illerdir.
		for(int i=0;i<3;i++)
			System.out.println("ilk sat�r");
		System.out.println("ikinci sat�r");			
		
		for(int i=0;i<3;i++);{ // d�ng� s�sl� parantez i�in �al��maz. ��nk� ; ile sonlanm��t�r.
			System.out.println("ilk sat�r");
		System.out.println("ikinci sat�r");
		}
		
		for(int i=0;i<3;i++); // d�ng� ilk sat�r i�in �al��maz, ��nk� ; ile d�ng� bitmi�tir.
			System.out.println("ilk sat�r");
		System.out.println("ikinci sat�r");
		
		/*
		for(;;) { // sonsuz d�ng�
			System.out.println("Durdurun d�nyay�....");
		}
		*/
		int i=0;
		for(;i<5;) { // foreach
			System.out.println("Ekrana yaz");
			i++;
		}
		
		// while -> 
		int sayac=4;
		while(sayac<4) {
			sayac++;
			System.out.println("Saya�.....: "+ sayac);			
		}
		
		// do...while();
		sayac=4;
		do {
			sayac++;
			System.out.println(sayac);
		}while(sayac<4);
		
		System.err.println("PROGRAM SONLANDI.");

	}// main sonu
}//class sonu
