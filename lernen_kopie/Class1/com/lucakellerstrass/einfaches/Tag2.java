package com.lucakellerstrass.einfaches;

import java.util.Random;

public class Tag2 {
	public static void main(String[] args){ 
		
//Teil 1  Eingabe über Komandozeile 	

		
//Teil 2 (Daten laden und Speichern)
		
		
           //Datenkonstrukte
//Teil 3 (array)
		int a=1, b=2, c=3, d=4;      //hässlicher Array
		//richtig:
		int[] meinArray;
		meinArray = new int[4];      //ich setze die Länge des Arrays auf 4
		meinArray[0] = a;            //und jetzt lege ich die Werte fest
		meinArray[1] = b;
		meinArray[2] = c;
		meinArray[3] = d;
		
		//alternativ:
		int[] gleicherArray = {1,2,3,4};
		
		//überprüfe die beiden Arrays:
		System.out.println("Überprüfe alle 4 einträge ob sie gleich sind:");
		for(int i = 0; i < 4; i++){
		System.out.println(meinArray[i] == gleicherArray[i] );
			
		}
//Teil 4 (Matrizen)      oder auch doppelarrays 	
		int[][] meineMatrix = new int[2][3];
		meineMatrix[1][1] = 5;
//Teil 5  (Game OF Life)
		//ist in gesondertem Programm
		
		
//Teil 6 debugging
		
		
		
		//Teil 7 Random
		
		Random r = new Random();               //Zufallszahl	
		// Entfernungspauschale :)
		int torschuss = 8;
		torschuss = Math.max(1,  Math.min(10, torschuss  - r.nextInt(3)));
		System.out.println(torschuss);
	}  //ende main
}  //Ende class
