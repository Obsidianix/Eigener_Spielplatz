package com.lucakellerstrass.einfaches;

public class Tag1 {
	public static void main(String[] args){    // entry points
		double x = 0; 
		int i = 1;                        //variablen
		
		//Teil 1 (Helloworld)
		System.out.println("Endlich ist es soweit! Mein erstes Programm läuft...");  //printing is an object in some lebrary
	
		 System.out.println("\n" );
		
		//Teil 2  (rechnen)
		x = i +1;
		System.out.println("x ist: " + x); 
		
		 System.out.println("\n" );
		
		//Teil 3 (if - Schleifen)
		if (x > 0)                          // heir gibt es auch else Verzweigungen
			x = -x;
		System.out.println("x ist nun: " + x + ", da x > 0."); 
		
		 System.out.println("\n" );

	   //Teil 4 (switch + for Schleife)
	   for (int j = 0; j < 10; j++){
		   System.out.println("Die Schleife ist bei " + j); 
		   switch(j){
		   case 0:   System.out.println("Die Schleife ist in case0 bei " + j); break;
		   case 1:  // System.out.println("Die Schleife ist in case1 bei " + j); break;
		   case 2:   System.out.println("Die Schleife ist in case2 bei " + j); break;
		   case 3:   System.out.println("Die Schleife ist in case3 bei " + j); break;
		   case 4:   System.out.println("Die Schleife ist in case4 bei " + j); break;
		   case 5:   System.out.println("Die Schleife ist in case5 bei " + j); break;
		   case 6:   System.out.println("Die Schleife ist in case6 bei " + j); 
		   case 7:   System.out.println("Die Schleife ist in case7 bei " + j); break;
		 //  case 6:   System.out.println("Die Schleife ist bei " + j); break;
		   default:   System.out.println("default bei " + j); break;
		   
		 /* Beachte bei switch: hat man case 1: case2:  #######;  dann gilt #####; für
		  * beiden cases. Lässt man das break; weg, dann werden alle anderen cases auch durch-
		  * gegangen.
		  */
		   } // ende switch
	   }     // ende for-Schleife
	   System.out.println("\n" );
	   
	   // Teil 5  (do-while + while schleife)
	   int j = 0;
	   while (j < 1000){
		j = j*j + 1;   
	   }//ende while
	   System.out.println("Die While Schleife ergibt: "+ j  );
	   
	   do{
		 j = 0;
	   }
	   while (j < 0);
	   System.out.println("Obwohl j > 0 ist wird j trotzdem auf Null gesetzt, also j =  "+ j  );
	   
	   
	   //Teil 6  (break)
	   double gross = 9999999;
	   int schleifenAbbruch = 0;
	   for (int z = 0; z < 100000; z++){
		 gross = gross/2;
		 if (gross < 1) break;
		 schleifenAbbruch = z;
	   }
	   System.out.println("gross ist " + gross + "und die schleife wurde Abgebrochen bei" + schleifenAbbruch );
	
	   //break ist also ganz praktisch ;)
	   
	   
	   //Teil 7 (Sprunganweisungen)
	   //Rauskopiert
	   SprungZuI: // Sprungmarke
		   for (int q=0; q<=2; q++){
		   System.out.println("... jetzt sind wir hier bei i");
		   SprungZuJ: // Sprungmarke
		   for (int s=0; s<=2; s++){
		   System.out.println("... jetzt sind wir hier bei j");
		   for (int k=0; k<=2; k++){
		   System.out.println("... jetzt sind wir hier bei k");
		   if (k==1)
		   break SprungZuJ;
		   }
		   }
		   }
		   System.out.println("hier sind wir...");
		 // eigenes Sprungprogramm mit switch:
		   Sprung1:
		   for (int f = 0; f < 10; f++){
			   System.out.println("Die Schleife ist bei " + f); 
			   switch(f){
			   case 0:   System.out.println("Die Schleife ist in case0 bei " + f); break Sprung1;
			   case 1:  // System.out.println("Die Schleife ist in case1 bei " + j); break;
			   case 2:   System.out.println("Die Schleife ist in case2 bei " + f); break Sprung1;
			   case 3:   System.out.println("Die Schleife ist in case3 bei " + f); break Sprung1;
			   case 4:   System.out.println("Die Schleife ist in case4 bei " + f); break Sprung1;
			   case 5:   System.out.println("Die Schleife ist in case5 bei " + f); break Sprung1;
			   case 6:   System.out.println("Die Schleife ist in case6 bei " + f); 
			   case 7:   System.out.println("Die Schleife ist in case7 bei " + f); break Sprung1;
			 //  case 6:   System.out.println("Die Schleife ist bei " + j); break;
			   default:   System.out.println("default bei " + j); break Sprung1;
			   }
		   }
		   //wir gehen in die Schleife rein, aktivieren case0 und werden wieder raus geworfen.
			   
		   
		   // Teil 8 (continue)
           // Teilbarkeit durch 3 bis 100
		   for(int t = 1; t<=100; t++){
			   if(t%3 == 0){
				   System.out.println(t + " ist durch 3 Teilbar");
			   continue;
			   }
			   
		   }
		   
		   // Teil 9 (methods)
	       int aa = 4;
	       gebeAus(aa);
	} // ende main
	
	public static void gebeAus( int aa){    //neue Funktion
		System.out.println("Der Wert ist " + aa);
	}
} // ende class
