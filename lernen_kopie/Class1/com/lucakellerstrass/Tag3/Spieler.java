package com.lucakellerstrass.Tag3;

import java.util.Random;


public class Spieler extends Person {                //wir übernehmen die Klasse Person  //vererbung
//Zusätzliche EIgenschaften eiens Spielers:
	public int  staerke  ;        //von 1 (schlecht) bis 10 (super)
	public int   torschuss ;      //von 1 (schlecht) bis 10 (super)
	public int   motivation ;      //von 1 (schlecht) bis 10 (super)
	public int   tore ;           // sie viel wie halt gemacht
	
	
	//Konstruktoren
	public Spieler(String n, int a, int s, int t, int m){
		super(n, a);
		staerke = s;
		torschuss = t;
		motivation = m;
		tore = 0;
		}                              //Tore gehören wohl nicht wirklich zu den EIgenschaften

	
	
	//get und set
	public int getStaerke(){                 // getter staerke
		return staerke;
	}
	
	public void setStaerke(int s){           // setter staerke
		staerke = s;
	}
	
	public int getTorschuss(){                 // getter torschuss
		return torschuss;
	}
	
	public void setTorschuss(int t){           // setter torschuss
		torschuss = t;
	}
	
	public int getMotivation(){                 // getter motivation
		return motivation;
	}
	
	public void setMotivation(int m){           // setter motivation
		motivation = m;
	}
	
	public int getTore(){                     // getter tore
		return tore;
	}
	
	public void setTore(int to){                // setter tore
		tore = to; 
	}
	
	
	
// Der Spieler erhällt zwei methoden, nämlich addTor und schiessAufTor:
	//Spielerfunktion:
	
	
	//Der Spieler hat ein Tor geschossen:    
	public void addTor(){
		tore++;                        //macht nix anderes als Tore um 1 nach oben zu setzen
	} 
	// eine Zahl von 1-10 liedert die qualität des Torschussen. Diese liegt zufällt +-1 um die
	//Torschussstärke
	
	public int schiessAufTor(){
	Random r = new Random();               //Zufallszahl	
	// Entfernungspauschale :)
	torschuss = Math.max(1,  Math.min(10, torschuss  - r.nextInt(3)));    // r.nextInt(3) erzeugt zufallszahlen von 0 bis 2
	//wir wollen aber eine Varianz von +-1, also ziehen wir eins ab
	int ret = Math.max(1,  Math.min(10, torschuss  - r.nextInt(3)-1));
	return ret;	
	}
	
}



