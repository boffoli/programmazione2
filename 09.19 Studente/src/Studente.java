public class Studente{
	int matricola ;
	String cognome;
	
	Studente(int matricola, String cognome){
		this.matricola=matricola;
		this.cognome=cognome;
	}
	
	public boolean equals (Object o) {
		return (Studente)o.matricola==matricola;
	}
	
	public int hashCode() {
		return new Integer(matricola).hashCode() ;
	}
	public String toString(){ return cognome;}
}

