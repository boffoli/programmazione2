class Note {
	private int value;
	
	private Note(int val) { value = val; }	//restituisce note

	public static final Note MIDDLE_C = new Note(0), C_SHARP = new Note(1), B_FLAT = new Note(2);	//liste inizializzaz
	}//non piu ereditabili

class Instrument {
	public void play(Note n) {		System.out.println("Instrument.play()");}
}

class Wind extends Instrument {
	public void play(Note n) {	 System.out.println("Wind.play()");}//overloading
}

public class Music {
   public static void tune(Instrument i) { i.play(Note.MIDDLE_C);}
   
   public static void main(String[] args) {
	   Wind flute = new Wind();	//prativamente instrument
	   tune(flute); // Upcasting: flute e' un wind ma anche un instrument
   }
}
