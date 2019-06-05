public class BreakAndContinue {
	public static void main(String[] args) {
		System.out.println("Ciclo 1");
		for(int i = 0; i < 100; i++) {
		if(i == 74) break; // Out of for loop
		if(i % 9 != 0) continue; //Altra iterazione
		System.out.println(i);
	}
	int i = 0;
	System.out.println("Ciclo 2");
	while(true) {
		i++;
		int j = i * 27;
		if(j == 1269) break; // Fine ciclo
		if(i % 10 != 0) continue; // Inizio ciclo
		System.out.println(i);
		}
	}
}
