package chapter11;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//创建一个空的LinkedList<Integer>,通过使用ListIterator,将若干个Integer插入这个List中，插入时，  
//总是将它们插入到List的中间
public class Exe14 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		ListIterator<Integer> it = list.listIterator();
		for (int i = 0; i < 7; i++) {
//			 list.add(i);
			list.add((list.size()/2), i);
		}
		 System.out.println(list);
	}
}
