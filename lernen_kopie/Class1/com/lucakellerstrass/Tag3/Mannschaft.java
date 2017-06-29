package com.lucakellerstrass.Tag3;

public class Mannschaft {
	//Eigenschaften der Mannschaft
	private String name;
	private Trainer trainer;
	private Torwart torwart;
	private Spieler[] kader;
	
	
	
	//Konstruktoren
	//Konstruktoren
		public Mannschaft(String n, Trainer t, Torwart tw, Spieler[] s){
			name = n;
			trainer = t;
			torwart = tw;
			kader = s;
			}                            

		
		
		//get und set
		public String getName(){                 // getter Name
			return name;
		}
		
		public void setName(String n){           // setter Name
			name = n;
		}
		
		public Trainer getTrainer(){                 // getter Trainer
			return trainer;
		}
		
		public void setTrainer(Trainer t){           // setter Trainer
			trainer = t;
		}
		
		public Torwart getTorwart(){                 // getter Torwart
			return torwart;
		}
		
		public void setTorwart(Torwart tw){           // setter Torwart
			torwart = tw;
		}
		
		public Spieler[] getSpieler(){                     // getter tore
			return kader;
		}
		
		public void setSpieler(Spieler[] s){                // setter tore
			kader = s; 
		}
//Mannschaftsfunktionen:
		
		//liefert durchschnittliche Mannschaftsstaerke
		public int getStaerke(){
			int sum = 0;
			for(int i = 0; i < 10; i++){
				sum += kader[i].getStaerke ();
			}
			return sum/10;
		}
		//durchschnittliche Mannschaftsmotivation
		public int getMotivation(){
			int sum = 0;
			for(int i = 0; i < 10; i++){
				sum += kader[i].getMotivation();
			}
			return sum/10;
		}
}
