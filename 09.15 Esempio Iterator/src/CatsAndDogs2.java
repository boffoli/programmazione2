// Semplice uso di un Iteratore su un contenitore

import java.util.*;
public class CatsAndDogs2 {
	public static void main(String[] args) {
		ArrayList cats = new ArrayList();
		for(int i = 0; i < 7; i++)
		cats.add(new Cat(i));
		Iterator e = cats.iterator();
		while(e.hasNext())
		((Cat)e.next()).print();
	}
} 

