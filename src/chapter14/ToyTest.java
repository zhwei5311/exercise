package chapter14;

public class ToyTest {
	public static void printInfo(Class cc) {
		System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		System.out.println("Simple name: " + cc.getSimpleName());
		System.out.println("Canonical name: " + cc.getCanonicalName());
	}

	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("chapter14.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for (Class face : c.getInterfaces()) {
			printInfo(face);
			Class up = c.getSuperclass();
			Object obj = null;
			try {
				obj = up.newInstance();
			} catch (InstantiationException e) {
				System.out.println("Can't instantiate");
				System.exit(1);
			} catch (IllegalAccessException e) {
				System.out.println("Can't access");
				System.exit(1);
			}
			printInfo(obj.getClass());
		}
	}
}
