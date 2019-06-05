//Riuso per composizione
class WaterSource {
	private String s;
	WaterSource() {
		System.out.println("WaterSource()");
		s = new String("Constructed");
	}
	public String toString() { return s; }
}
