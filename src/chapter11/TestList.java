package chapter11;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<Integer> list = new  ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		for(Integer i:list) {
			System.out.print(i + " ");
		}
	}
}
