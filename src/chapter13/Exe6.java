package chapter13;

public class Exe6 {
	private int i;
	private float f;
	private long l;
	private double d;
	public Exe6(int i,float f,long l,double d) {
		this.i = i;
		this.f = f;
		this.d = d;
		this.l = l;
	}
	public String toString() {//g表示double
		return String.format("%5d,%5.5f,%5d,%5.10g", i,f,l,d);
	}
	public static void main(String[] args) {
		Exe6 e = new Exe6(5, 5.55f, 300000000, 3.3333333);
		System.out.println(e);
	}
}
