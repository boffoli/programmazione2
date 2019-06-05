// Non accede a membri friendly in altre classi
import c05.dessert.*;

public class ChocolateChip extends Cookie {			// Non accede a membri friendly in altre classi.
	public ChocolateChip() {		System.out.println("ChocolateChip constructor");}
	
	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		 x.bite();	//discendente che accede a bite
	}
}