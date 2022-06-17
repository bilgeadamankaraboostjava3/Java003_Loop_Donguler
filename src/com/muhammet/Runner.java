package com.muhammet;

public class Runner {

	public static void main(String[] args) {
		// Döngü ->
		// for döngüsü -> Döngünün devamýný saðlayan ana koþul
		// orta kýsýmda yazmýþ olduðunuz iliþkinin doðru olmasý koþuludur yani;
		// koþul saðlandýkça döngü devam etsin.
		// i -> index
		for(int i=0;i<10;i++) { // i=10 olduðunda süslüparantez içi çalýþmaz
			System.out.println("Muhammet HOCA"+ i);
		}// for döngü sonu
		
		// ÖNEMLÝ!!! süslüparantezler -> döngü, koþul operatörlerinde tek bir satýr için 
		// kullanýmlarda eklenmek zorunda deðillerdir.
		for(int i=0;i<3;i++)
			System.out.println("ilk satýr");
		System.out.println("ikinci satýr");			
		
		for(int i=0;i<3;i++);{ // döngü süslü parantez için çalýþmaz. çünkü ; ile sonlanmýþtýr.
			System.out.println("ilk satýr");
		System.out.println("ikinci satýr");
		}
		
		for(int i=0;i<3;i++); // döngü ilk satýr için çalýþmaz, çünkü ; ile döngü bitmiþtir.
			System.out.println("ilk satýr");
		System.out.println("ikinci satýr");
		
		/*
		for(;;) { // sonsuz döngü
			System.out.println("Durdurun dünyayý....");
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
			System.out.println("Sayaç.....: "+ sayac);			
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
