package com.muhammet;

import java.util.Scanner;

public class Runner_WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****************");
		System.out.println("*** ��LEMLER ***");
		System.out.println("*****************");
		System.out.println();
		System.out.println("1- Toplama");
		System.out.println("2- �arpma");
		System.out.println("3- Mod Alma");
		System.out.println("0- �IKI�");
		System.out.println();
		
		int secim=1;
		while(secim!=0) { // se�im 0 a e�it ise sonlans�n.
			System.out.print("Se�iniz....: ");
			secim  = sc.nextInt();
		}
		
		System.err.println("PROGRAM SONLANDI.");
		

	}

}
