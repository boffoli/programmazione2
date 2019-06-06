package com.prova.util;

class Studente implements Comparable{
	int matricola;
	int numeroEsami;
	String cognome;
	String nome;
	
	Studente(int matricola,int numeroEsami, String cognome,String nome){
		this.matricola=matricola;
		this.numeroEsami=numeroEsami;
		this.cognome=cognome;
		this.nome=nome;
	}
	
	public int compareTo(Object o){
		Studente s= (Studente)o;
		if(s.numeroEsami==numeroEsami)
			return 0;		
		else if(s.numeroEsami<numeroEsami)	return -1;
			else 							return 1;
		}
}
