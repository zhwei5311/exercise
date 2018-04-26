package chapter12;

public class Exe5 {
	public static int[] a = new int[3];
	static int i = 5;
	public static void main(String[] args) {
		while(true) {
			try {
				a[i] = 5;
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace(System.out);
				i--;
			}finally {
				System.out.println("finally方法被执行了");
			}
		}
		System.out.println("总算跳出来了");
	}
}
