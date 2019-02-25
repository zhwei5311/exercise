package chapter14;

public class SweetShop {
	public static void main(String[] args) {
		for(String arg : args)
			try {
				Class.forName(arg);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
}
