package com.prova.util;
// Uso dei metodi Collections.unmodifiable

import java.util.*;
import com.prova.util.*;

public class ReadOnly {
	static Collections2.StringGenerator gen =	Collections2.countries;
	public static void main(String[] args) {
		Collection c = new ArrayList();	
		Collections2.fill(c, gen, 25); 		// Inserisci i dati		
		c = Collections.unmodifiableCollection(c);
		System.out.println(c); // Si pu� leggere
		//! c.add("one"); // Non si pu� variare
		List a = new ArrayList();
		Collections2.fill(a, gen.reset(), 25);
		a = Collections.unmodifiableList(a);
		ListIterator lit = a.listIterator();
		System.out.println(lit.next());// Si pu� leggere
		//! lit.add("one"); // Non si pu� variare
		Set s = new HashSet();
		Collections2.fill(s, gen.reset(), 25);
		s = Collections.unmodifiableSet(s);
		System.out.println(s); // Si pu� leggere
		//! s.add("one"); // Non si pu� variare
		Map m = new HashMap();
		Collections2.fill(m,
		Collections2.geography, 25);
		m = Collections.unmodifiableMap(m);
		System.out.println(m); // Si pu� leggere
		m.put("Ralph", "Howdy!");// Non si pu� variare si solleva l�eccezione
	}
}
/*Qualunque chiamata ai metodi che modificano il contenuto dei contenitori produrr� una eccezione UnsupportedOperationException.*/