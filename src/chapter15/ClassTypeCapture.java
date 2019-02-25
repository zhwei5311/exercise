package chapter15;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeCapture<T> {
	Class<T> kind;
	Map<String, Class<?>> map;

	public ClassTypeCapture(Class<T> kind) {
		this.kind = kind;
	}

	public ClassTypeCapture(Class<T> kind, Map<String, Class<?>> map) {
		this.kind = kind;
		this.map = map;
	}

	public void addType(String typename, Class<?> kind) {
		map.put(typename, kind);
	}

	public Object createNew(String typename) throws InstantiationException, IllegalAccessException {
		if(map.containsKey(typename)) {
			return map.get(typename).newInstance();
		}
		System.out.println(typename + "class not available");
		return null;
	}
	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}

	public static void main(String[] args) {
		ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
		System.out.println(ctt1.f(new Building()));
		System.out.println(ctt1.f(new House()));
		ClassTypeCapture<House> ctt2 = new ClassTypeCapture<>(House.class);
		System.out.println(ctt2.f(new Building()));
		System.out.println(ctt2.f(new House()));
		ClassTypeCapture<Building> ctt3 = new ClassTypeCapture<>(Building.class,new HashMap<String,Class<?>>());
		ctt3.addType("House", House.class);
		ctt3.addType("Building", Building.class);
		System.out.println("ctt3.map = " + ctt3.map);
		try {
			Building building = (Building) ctt3.createNew("Building");
			House house = (House) ctt3.createNew("House");
			System.out.println("building.getClass().getName():");
			System.out.println(building.getClass().getName());
			System.out.println("house.getClass().getName()");
			System.out.println(house.getClass().getName());
			System.out.println("House house is instance of House:");
			System.out.println(house instanceof House);
			System.out.println("house is instance of Building:");
			System.out.println(house instanceof Building);
			System.out.println("Building building is instance of House: ");
			System.out.println(building instanceof House);
			ctt3.createNew("String");
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
