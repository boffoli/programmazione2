 package com.prova.util;
 
 import com.prova.util.*;
 import java.util.*;
 
 public class TestSort{
	 public static void main(String args[]){
	 Studente s[]=new Studente[5];
	 s[0]=new Studente(3,12,"Rossi", "Paolo");
	 s[1]=new Studente(2,16,"Rossi", "Mario");
	 s[2]=new Studente(1,12,"Verde", "Paolo");
	 s[3]=new Studente(4,15,"Bianchi", "Maria");
	 s[4]=new Studente(5,16,"Rossi", "Maria");
	 //Arrays2.print("Before sorting: ", s);
	 Arrays.sort(s);
	 //Arrays2.print("After sorting: ", s);
	 }
	//Che succede se voglio ordinare s in base alla matricola?
}
