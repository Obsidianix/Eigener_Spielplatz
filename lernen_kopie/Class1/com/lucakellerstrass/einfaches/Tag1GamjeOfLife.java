
package com.lucakellerstrass.einfaches;

import java.util.Random;

public class Tag1GamjeOfLife {
	
	
	//Ausgabefunktion
	public static void gebeAus(boolean[][] m){                 //in die methode kommt eine bool Matrix
		//Ein "X" symbolisiert eine lebendige Zelle
		for (int i = 0; i <10; i++){
			for(int j =0 ; j<10; j++){                        //  wir gehen durch die zwei
			                                                  //for-schleifen durch alle Elemente der
				if (m[i][j])                                  // mxn Matrix druch.
					System.out.print("X ");                 // wenn der Eintrag "true" ist, dann
				else                                          // wird ein X ausgegeben.
					System.out.print("  ");                 // Sonst nur freier Platz
			}
			System.out.println();               //Zeilenumbruch für Matrix-Design
		}
		                 
		
	   } // Ende gebeAus	
		
	//Funktion, die die Elemente in der NAchbarschaft zählt
		  //hierbei ist wichtig, dass Java einen Fehler erzeugt, wenn man auf Elemente
		  // ausßerhalb der Matrix zugreifen wil
    	 
 
	
	public static int zaehleUmgebung(boolean[][] m , int x, int y){     //x und y ist die Position
	int ret = 0;    	
	for (int i = (x-1); i <(x+2); i++){                    //wir kalppern hier alle Martrixeinträge
		for (int j = (y-1); j <(y+2); j++){                // um x-y herum hab
		try{
			if(m[i][j])
            ret +=1;
		}
		catch (IndexOutOfBoundsException e){			
		}
		}
	}
	if (m[x][y]) ret -=1;                              //wenn unsere Zelle lebtr müssen wir sie wieder abziehen
	
	return ret;	
	} //Ende zaeleUmgebung
	
	
	//hier kommt endlich die main mothode
	
	public static void main(String[] args){
		//unsere Welt soll aus 10x10 Zellen bestehen
		boolean[][] Welt    = new boolean[10][10];
		boolean[][] WeltNeu = new boolean[10][10];
		
		//Jetzt erzeugen wir zufällig true oder false in den Eintrage der ersten Matrix
		Random vollFettKrassZufall = new Random();      //hier erzeugen wir eine Variable von Random
		double zufallswert;                             //das sollen die Zufallszahlen werden
		
		for (int i = 0; i <10; i++){
			for(int j =0 ; j<10; j++){     
				zufallswert = vollFettKrassZufall.nextDouble();           //zufallswert wird wirklich erstellt
				if (zufallswert >= 0.5)
				    Welt[i][j] = true;
			}
		}
	
	
	//jetzt haben wir eine Zuällige Welt, eine methode, die die Nachbarn zählt und eine methode zum Ausgeben
	// Jetzt fehlt nur noch alles zusammenzufügen	
		System.out.println("Generation 1: ");
		gebeAus(Welt);                              //hier wird schon mal die alte Welt geprinted
		
		int nachbarn;

		for (int i = 0; i <10; i++){
			for(int j =0 ; j<10; j++){    
				//zähle die Nachbarn mit methode
				nachbarn = zaehleUmgebung(Welt, i, j);         //jetzt hat man die Nachbarn für mxy
				
				//jetzt kommen die Regeln ins Spiel      
		 if(Welt[i][j]){
			 //Regel 1,2:                                   //Sind zu viele oder zu wenige Nachbarn da, stirbt die Zelle
			 if((nachbarn<2) || (nachbarn>3))
				 WeltNeu[i][j] = false;
			 
			 //Regel 3:                                    //Sind genau richitg viele Nacxhbarn da, dann überlebt die Zellle
			 if((nachbarn==2)||(nachbarn==3)){
				 WeltNeu[i][j]=true;
			 }
		 }
		 else{
			 //Regel 4:                                   //Ist die Zelle Tod, hat aber 3 Nachbarn, so wird sie wieder belebt
			 if(nachbarn==3)
				 WeltNeu[i][j]=true;
		 }
			 
	  }
  }
		//Am Ende müssen wir noch die zweite Generation ausgeben
		System.out.println("Generation 2");
		gebeAus(WeltNeu);
		
	}//Ende Main

	}
