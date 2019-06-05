import java.util.HashSet;

public class Tester{
	public static void main (String ars[]){
		HashSet s=new HashSet();
		s.add(new Studente(1,"Bianchi"));
		s.add(new Studente(2,"Rossi"));
		s.add(new Studente(1,"Verde"));
		System.out.println(s);
	}
}				
