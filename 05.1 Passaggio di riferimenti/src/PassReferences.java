// Passaggio dei riferimenti
public class PassReferences {
	
	static void f(PassReferences h) {		System.out.println("h inside f(): " + h);}
	
	public static void main(String[] args) {
		PassReferences p = new PassReferences();
		System.out.println("p inside main(): " + p);	//indirizzo dell'oggetto
		f(p);	//Stesso indirizzo
	}
}
