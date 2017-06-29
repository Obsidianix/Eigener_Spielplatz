package com.lucakellerstrass.Tag3;

import java.util.Random;

public class Fussballfreundschaftsspiel {
private String nameHeimMannschaft;
private String nameGastMannschaft;
private int punkteHeim;
private int punkteGast;


//Konstruktor
public Fussballfreundschaftsspiel(){                            
	punkteHeim=0;
	punkteGast=0;
}

//Methoden des Interfaces, die implementiert werden m¸ssen
public String  getHeimMannschaft(){
	return nameHeimMannschaft;
}

public String  getHGastMannschaft(){
	return nameGastMannschaft;
}

public int getHeimPunkte(){
	return punkteHeim;
}

public int getGastPunkte(){
	return punkteGast;
}

//jetzt die methe starte Spiel, die alles in Rollen bringt.

public void starteSpiel(Mannschaft m1 , Mannschaft m2){         //man habe also die Parameter
nameHeimMannschaft  = m1.getName();
nameGastMannschaft  = m2.getName();
punkteHeim = 0;
punkteGast = 0;


//jetzt starten wir das Spielm und erzeugen f¸r die 90 Minuten
// plus nachspielzeit die verschiedenen Aktionen
// (Wahrscheinlichkeitsbedingt) f¸r das Freundschaftsspiel

Random r = new Random();

boolean spiellaeuft = true;                                // ist true bis es um ist
int spieldauer      = 90 + r.nextInt(5);                   //kann zwischen 0 und 4 min l‰nger dauern
int zeit            = 1;                                   //misst die Minute. Startet bei 1
int naechsteAktion  ;                                       //die Zeit bis zur n‰chsten Aktion

//solange das Spiel l‰uft kˆnnen Torchancen entstehen...
while(spiellaeuft){
	naechsteAktion = r.nextInt(5)+1;                      //Zufallszahlen zwischen 1 und 15
	
	//ist das Spiel schon zu Ende?
	if((zeit + naechsteAktion > spieldauer) ||( zeit > spieldauer) ){
		spiellaeuft = false;
		break;
	}
	
//Eine neue Aktion findet statt...
	zeit = zeit +naechsteAktion;                          //die Zeit geht also in "Aktionsschritten" vorran
	
	
	
	//welche Mannschaft hat jetzt also die Torschance?
	//EInfluss der Motivation auf die Staerke:
	float staerke_1 = (m1.getStaerke()/2.0f) +                       //Berechne die staerke von Mannschaft 1
			((m1.getStaerke()/2.0f)*(m1.getMotivation()/10.0f));
	float staerke_2 = (m2.getStaerke()/2.0f) +                      //Berechne die staerke von Mannschaft 2
			((m2.getStaerke()/2.0f)*(m2.getMotivation()/10.0f));
	
	//Einfluss des Trainers auf die St‰rke:
	int abweichung = r.nextInt(2);                                   
	if(staerke_1 > m1.getTrainer().getErfahrung())              //   hier also der Vergleich triner vs. stearke
		abweichung = -abweichung;
	staerke_1 = Math.max(1, Math.min(10, staerke_1 + abweichung)); 
	
	abweichung = r.nextInt(2);
	if (staerke_2 > m2.getTrainer().getErfahrung())
	abweichung = -abweichung;
	staerke_2 = Math.max(1, Math.min(10, staerke_2 + abweichung)); 
	
	
	//wir w‰hlen einen zuf‰lligen Spieler aus der"st‰rkeren Mannschaft" und lassen ihn schieﬂen
	
	
	int schuetze = r.nextInt(10);              //Zuf‰llige Wahl zwischen den 10 feldspielern
	
	if  ((r.nextInt(Math.round(staerke_1+staerke_2))-staerke_1)<=0){               //bedingung, dass Mannschaft 1
	Spieler s                  = m1.getSpieler()[schuetze];	                       //schieﬂen darf
	Torwart t                  = m2.getTorwart();
	int torschuss              = s.schiessAufTor();
	//h‰llt er den Schuss?
	boolean tor = !t.haeltDenSchuss(torschuss);
	
	System.out.println();
	System.out.println( zeit + " .Minute: ");
	System.out.println("  Chance f¸r "+ m1.getName() + " ....");
	System.out.println("   " + s.getName() + " schieﬂt !!!!");
	
	
	if(tor){
		punkteHeim++;
		s.addTor();
		System.out.println(" TOR!!! "+punkteHeim+":"+
				punkteGast+" "+s.getName()+"("+s.getTore()+")"); 
	}else {
			System.out.println(" "+m2.getTorwart().getName()
					+" pariert glanzvoll.");
		}
		
	//dies war der Fall, dass Mannschaft1 ein Tor machen will. Jetzt kommt der umgekehrte Fall	
		
	}else{
		Spieler s = m2.getSpieler()[schuetze];
		Torwart t = m1.getTorwart();
		int torschuss = s.schiessAufTor();
		boolean tor = !t.haeltDenSchuss(torschuss);
		System.out.println();
		System.out.println(zeit+".Minute: ");
		System.out.println(" Chance fuer "+m2.getName()+" ...");
		System.out.println(" "+s.getName()+" zieht ab");

		if (tor) {
		punkteGast++;
		s.addTor();
		System.out.println(" TOR!!! "+punkteHeim+":"+
		punkteGast+" "+s.getName()+"("+s.getTore()+")");
		} else {
		System.out.println(" "+m1.getTorwart().getName()
		+" pariert glanzvoll.");
	}
	}

}
	
}
           //Wir sind fast fertig
           // Es fehlt nur noch das Ergbnis
       public String getErgebnisText(){
    	   return "Das Freundschaftsspiel endete \n\n"+nameHeimMannschaft
    			   +" - "+nameGastMannschaft+" "+punkteHeim+":"
    			   +punkteGast+".";
    	   
       }


}

