import java.util.*;
import com.prova.util.*; 

public class Set1 {
	static Collections2.StringGenerator gen =Collections2.countries;
	
	public static void testVisual(Set a) {
		Collections2.fill(a, gen.reset(), 10);
		Collections2.fill(a, gen.reset(), 10);
		Collections2.fill(a, gen.reset(), 10);
		System.out.println(a); // Nessun duplicato!
		// Aggiungi un altro insieme:
		a.addAll(a);
		a.add("one");
		a.add("one");
		a.add("one");
		System.out.println(a);
		// Cerca qualcosa:
		System.out.println("a.contains(\"one\"): " +
		a.contains("one"));
	}
	public static void main(String[] args) {
			System.out.println("HashSet");
			testVisual(new HashSet());
			System.out.println("TreeSet");
			testVisual(new TreeSet());
	}
}
