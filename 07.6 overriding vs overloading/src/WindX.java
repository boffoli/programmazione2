// Accidentally changing the interface.

class WindX extends InstrumentX {
	// OOPS! Modifica l’interfaccia del metodo:
	public void play(NoteX n) {//<- 
		System.out.println("WindX.play(NoteX n)");
	}
}

//InstrumentX.play()

