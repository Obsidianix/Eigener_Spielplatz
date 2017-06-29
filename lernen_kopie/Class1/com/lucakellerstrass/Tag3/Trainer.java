package com.lucakellerstrass.Tag3;

public class Trainer extends Person{
	//Zusätzliche EIgenschaften eienes Trainers:
		private int   erfahrung  ;        //von 1 (schlecht) bis 10 (super)
		
		//konstruktoren
		public Trainer(String n, int a, int e){
			super(n, a);
			erfahrung        = e;
		}
		
		
		public int getErfahrung(){                 // getter Erfahrung
			return erfahrung;
		}
		
		public void setErfahrung(int e){           // setter Erfahrung
			erfahrung = e;
		}
}
