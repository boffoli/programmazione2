public class Flower {
	int petalCount = 0;
	String s = new String("null");
	Flower(int petals) {
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount= " + petalCount);
	}
	Flower(String s, int petals) {
		this(petals);
		//! this(s); // Can't call two!
		this.s = s; // Another use of "this"
		System.out.println("String & int args");
	}
	Flower() {
		this("hi", 47);
		System.out.println( "default constructor (no args)");
	}
	void prn(String s, int petals) {
	this.s = s;
	System.out.println(s+petals);
	}
	public static void main(String args[])  {
		Flower a = new Flower(2);
		Flower b = new Flower("seconda", 2);
		a.prn("a:",2);
		b.prn("b:",3);
		}
}
