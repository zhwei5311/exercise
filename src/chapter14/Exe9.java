package chapter14;

public class Exe9 {
	public static void Hierarchy(Object o) {
		Object[] fields = o.getClass().getDeclaredFields();
		if(fields.length == 0) {
			System.out.println(o.getClass()
					+ "has no fields");
		}
		if(fields.length > 0) {
			System.out.println("Fields of " + o.getClass() + ":");
			for(Object obj : fields) {
				System.out.println(" " + obj);
			}
		}
		if(o.getClass().getSuperclass() != null) {
			System.out.println(o.getClass() + " is a subclass of " + 
					o.getClass().getSuperclass());
			try {
				Hierarchy(o.getClass().getSuperclass().newInstance());
			} catch(InstantiationException e) {
				System.out.println("Unabloe to instantiate obj");
			} catch(IllegalAccessException e) {
				System.out.println("Unable to access");
			}
		}
	}
	public static void main(String[] args) {
		Hierarchy(new ExtendsSuper());
	}
}
