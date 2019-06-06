// Realizzazione di una pila con LinkedList.

import java.util.*;
//import com.prova.util.*;

public class StackL {
	private LinkedList list = new LinkedList();
	public void push(Object v) {
		list.addFirst(v);
	}
	public Object top() { return list.getFirst(); }
	public Object pop() { return list.removeFirst();}
	
	public static void main(String[] args) {
		StackL stack = new StackL();
		for(int i = 0; i < 10; i++)
			stack.push(Collections2.countries.next());
		System.out.println(stack.top());
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}

