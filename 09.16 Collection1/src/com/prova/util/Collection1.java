package com.prova.util;
// Uso di Collection e Collections.

import java.util.*;
import com.prova.util.*;

public class Collection1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Collections2.fill(c,Collections2.countries, 10);
		c.add("ten");
		c.add("eleven");
		System.out.println(c);
		// Trasforma un List in Array:
		Object[] array = c.toArray();
		// Trasforma un List in Array di String:
		String[] str =(String[])c.toArray(new String[1]);
		// Trova elementi max e min; La semantica è
		// diversa a secondo della implementazione
		// dell’interfaccia Comparable:
		System.out.println("Collections.max(c) = " + Collections.max(c));
		System.out.println("Collections.min(c) = " + Collections.min(c));
		// Aggiungi una Collection ad un’altra Collection
		Collection c2 = new ArrayList();
		Collections2.fill(c2, Collections2.countries, 10);
		c.addAll(c2);
		System.out.println(c);
		c.remove(CountryCapitals.pairs[0][0]);
		System.out.println(c);
		c.remove(CountryCapitals.pairs[1][0]);
		System.out.println(c);
		// Rimuovi tutti i componenti che sono nella
		// collection passata in ingresso:
		c.removeAll(c2);
		System.out.println(c);
		c.addAll(c2);
		System.out.println(c);
		// C’è un elemento in questa collection? 
		String val = CountryCapitals.pairs[3][0];
		System.out.println( "c.contains(" + val + ") = "+ c.contains(val));
		// C’è una collection in questa Collection?
		System.out.println( "c.containsAll(c2) = "+ c.containsAll(c2));
		Collection c3 = ((List)c).subList(3, 5);
		// Mantiene tutti gli elementi che sono sia in
		// c2 e sia in c3 (intersezione):
		c2.retainAll(c3);
		System.out.println(c);
		// Elimina tutti gli elementi 
		// in c2 che appaiono anche in c3:
		c2.removeAll(c3);
		System.out.println("c.isEmpty() = " +
		c.isEmpty());
		c = new ArrayList();
		Collections2.fill(c,Collections2.countries, 10);
		System.out.println(c);
		c.clear(); // Rimuovi tutti gli elementi
		System.out.println("after c.clear():");
		System.out.println(c);
	}
}
