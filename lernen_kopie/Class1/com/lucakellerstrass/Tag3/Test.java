package com.lucakellerstrass.Tag3;
//wir wollen ein Objekt trainer(J�rgen Kliensmann) der Klasse Trainer erstellen
public class Test {
	//brauchen wir dank den KOnstruktoren nicht mehr:
/*	public static void main(String[] args) {
	Trainer trainer = new Trainer();             //Speicherplatz reservieren
	trainer.setName("J�rgen Kliensmann");
	trainer.setalter(42);
	trainer.setErfahrung(7);  }   */       

	
//	Neue erstellung des Objekts
	public static void main(String[] args){
		Trainer trainer = new Trainer("J�rgen klinsmann", 42, 7);
	}

}
