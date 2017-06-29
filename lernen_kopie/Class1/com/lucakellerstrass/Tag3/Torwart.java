package com.lucakellerstrass.Tag3;

import java.util.Random;

public class Torwart extends Spieler{
	//Zus�tzliche Eigenschaften eines Torwarts:
		private int reaktion;
		
		//Konstruktoren:
		public Torwart(String n, int a, int s, int t, int m, int r){
			super(n,a,s,t,m);
			reaktion = r;    
		
		}
		
		//get und set
		public int getReaktion(){                 // getter reaktion
			return reaktion;
		}
		
		public void setReaktion(int r){           // setter reaktion
			reaktion = r;
		}
		
		//Torwartfunktion
		//Der Torwart erh�llt die Torschussst�rke als Parameter und es muss entscheiden werden ob
		//er h�llt oder nicht. R�ckgabewerte nat�rlich boolean
	 public boolean haeltDenSchuss(int schuss){
		 Random r = new Random();                  //wieder f�r den Zufall
		// +-1 ist hier die Varianz
		 int ret = Math.max(1, Math.min(10, reaktion + r.nextInt(3)-1)); 
		 if (ret >= schuss)
			 return true;   //gehalten
		 else 
			 return false;  //TOR!!!
	 }
		
		
	}
