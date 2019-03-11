package chapter8;

public class Drive extends Basic {
	private int i = 10;
	@Override
	public void print() {
		System.out.println("Drive:" + i);
	}
	public static void main(String[] args) {
		Drive drive = new Drive();
		drive.print();
	}
}
