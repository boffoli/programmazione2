// Uso di operatori relazionali e logici.
import java.util.*;

public class Bool {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int i = rand.nextInt() % 100; // 0-99
		int j = rand.nextInt() % 100;
		prt("i = " + i); 
		prt("j = " + j);
		prt("i > j is " + (i > j));
		prt("i < j is " + (i < j));
		prt("i >= j is " + (i >= j)); 
		prt("i <= j is " + (i <= j));
		prt("i == j is " + (i == j)); 
		prt("i != j is " + (i != j));
		prt("(i < 10) && (j < 10) is "+ ((i < 10) && (j < 10)) );
		prt("(i < 10) || (j < 10) is "+ ((i < 10) || (j < 10)) );
	}
	static void prt(String s) {		System.out.println(s);	} 
}
//Dall’output di questo programma si può notare che le rappresentazioni stringa di un valore boolean Java, 
//sono i letterali true o false operatori 