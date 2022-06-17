package com.muhammet;

import java.util.Scanner;

public class Runner_doWhile_Loop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("****************");
		System.out.println("*** ÝÞLEMLER ***");
		System.out.println("*****************");
		System.out.println();
		System.out.println("1- Toplama");
		System.out.println("2- Çarpma");
		System.out.println("3- Mod Alma");
		System.out.println("0- ÇIKIÞ");
		System.out.println();
		
		int secim;
		do {
			System.out.print("Seçiniz....: ");
			secim  = sc.nextInt();
		}while(secim!=0);
		
		/*
		while(secim!=0) { // seçim 0 a eþit ise sonlansýn.
			System.out.print("Seçiniz....: ");
			secim  = sc.nextInt();
		}
		*/
		System.err.println("PROGRAM SONLANDI.");
		

	}

}
