public class WindError {
	public static void tune(InstrumentX i) {
	// ...
	i.play(NoteX.MIDDLE_C);
	}
	public static void main(String[] args) {
		WindX flute = new WindX();
		tune(flute); // Non è il comportamento desiderato!
	}
}
