package chapter15;

import java.util.ArrayList;
import java.util.Random;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<>();
	private Random random = new Random(47);
	public void add(T item) {
		storage.add(item);
	}
	public T select() {
		return storage.get(random.nextInt(storage.size()));
	}
	public static void main(String[] args) {
		RandomList<String> rs = new RandomList<>();
		for(String string : ("the quick brown fox jumped over " 
				+ "the lazy brown dog").split(" ")) {
			rs.add(string);
		}
		for(int i = 0;i < 11; i++) {
			System.out.print(rs.select() + " ");
		}
		System.out.println();
		System.out.println("It's Over!");
		RandomList<Pet> rp = new RandomList<>();
		for(Pet pet : Pets.arrayList(10)) {
			rp.add(pet);
		}
		for(int i = 0;i < 11; i++) {
			System.out.println(rp.select() + " ");
		}
	}
}
