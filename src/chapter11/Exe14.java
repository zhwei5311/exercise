package chapter11;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//����һ���յ�LinkedList<Integer>,ͨ��ʹ��ListIterator,�����ɸ�Integer�������List�У�����ʱ��  
//���ǽ����ǲ��뵽List���м�
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
