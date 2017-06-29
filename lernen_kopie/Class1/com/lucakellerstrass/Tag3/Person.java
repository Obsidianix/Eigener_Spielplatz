package com.lucakellerstrass.Tag3;

public class Person {                
//Eigenschaften einer Person:
	private String name;             //wenn public, kann/muss jeder das verwenden
	private int alter;
	
	//Konstruktoren
	public Person(String n, int a){
		name = n;
		alter = a;
	}
	
	
	// Funktionen (get und set):            
	public String getName(){                 // getter name: ruft man diese methode auf, so
		return name;                         // kann man den Namen sehen
	} 
	
	public void setName(String n){           // setter name: verwendet man diese methode, so
		name = n;                            //kann mann den Namen verändern
	}
	
	
	public int getalter(){                 // getter alter
		return alter;
	}
	
	public void setalter(int a){           // setter alter
		alter = a;
	}
}









//Dies tuen wir, um die Variable von aussen verändern und lesen zu können.