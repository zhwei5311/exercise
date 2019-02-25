package chapter14;

import java.lang.reflect.Field;

public class TestReflect {
	public static void main(String[] args) {
		ReflectPointer rp1 = new ReflectPointer(3, 4);
		try {
			changeBtoA(rp1);
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(rp1);
	}
	private static void changeBtoA(Object obj) throws RuntimeException, Exception {
		Field[] fields = obj.getClass().getFields();
		for(Field field : fields) {
			//由于字节码只有一份，用equals语义不准确
			if(field.getType() == String.class) {
				String oldValue = (String) field.get(obj);
				String newValue = oldValue.replace('b', 'a');
				field.set(obj, newValue);
			}
		}
	}
}
