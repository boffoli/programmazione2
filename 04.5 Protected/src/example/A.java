package example;
// La parola chiave protected.		04.5 Protected
import java.util.*;

public class A {
	private int i;
	protected int read() { return i; }
	protected void set(int ii) { i = ii; }
	public A(int ii) { i = ii; }
	public int value(int m) { return m*i; }
}
