package example2;
import example.A;

public class B extends A{
	private int j;
	public B(int jj) { super(jj); j = jj; }
	public void change(int x) { set(x); }
}
