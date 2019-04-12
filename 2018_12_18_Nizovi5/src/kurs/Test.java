package kurs;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("Koliko clanova niza zelite: ");
		n = in.nextInt();
		
		int a[] = new int[100];
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("a[" + i + "] = ");
			a[i] = in.nextInt();
		}
		
		System.out.print("a: ");
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		// izbacivanje elemnta sa indeksom k
		System.out.print("Unesite k (sa koje pozicije brisete element):");
		int k = in.nextInt();
		
		if(k >= 0 && k <= n-1) // postoji element sa indeksom k
		{		
			// pomerimo sve od k-tog do kraja za jedno mesto levo
			for(int i = k; i <= n-2; i++)
				a[i] = a[i + 1];
			n--; // smanjimo duzinu niza za 1
		}
		
		System.out.print("nakon brisanja a: ");
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();


		System.out.print("Unesite k (na koju poziciju zelite da unesete element):");
		k = in.nextInt();
		System.out.print("Koji broj zelite da ubacite:");
		int x = in.nextInt();
	
		if(k >= 0 && k <= n)
		{
			// Pomerimo sve elemente od k-tog za jedno mesto desno
			for(int i = n-1; i >= k; i--)
				a[i+1] = a[i];
		
			a[k] = x;
			n++;			
		}
	
		System.out.print("nakon ubacivanja u niz a: ");
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	
	
	
	
	}

}
