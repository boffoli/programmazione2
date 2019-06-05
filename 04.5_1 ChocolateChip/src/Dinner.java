import c05.dessert.*;

public class Dinner {
	public Dinner() {	System.out.println("Dinner constructor");	}
	public static void main(String[] args) {
		Cookie x = new Cookie();
	//! x.bite(); // Non si puo’ accedere,e' protected
	}
}