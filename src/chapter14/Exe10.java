package chapter14;

public class Exe10 {
	public static void main(String[] args) {
		char[] c = new char[10];
		char c1 = 'a';
		// c is an Object:		
		System.out.println("Superclass of char[] c: " + 
			c.getClass().getSuperclass());
		System.out.println("char[] c instanceof Object: " + 
			(c instanceof Object));
		//Cannot invoke getClass() on the primitive type char
//		if(c1.getClass().isPrimitive()) {
		//下面的语句返回的是false，因为数组不是基本数据类型
//		if(c.getClass().isPrimitive()) {
//			System.out.println("char is a basic class");
//		} else {
//			System.out.println("char is not a basic class");
//		}
	}
}
