package chapter11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Exe18 {
	public static void main(String[] args) {
		Map<String, Gerbil> gerbils = new HashMap<>();
		gerbils.put("Fuzzy", new Gerbil(0));
		gerbils.put("Spot", new Gerbil(1));
		gerbils.put("Speedy", new Gerbil(2));
		gerbils.put("Dopey", new Gerbil(3));
		gerbils.put("Sleepy", new Gerbil(4));
		gerbils.put("Happy", new Gerbil(5));
		gerbils.put("Funny", new Gerbil(6));
		gerbils.put("Silly", new Gerbil(7));
		gerbils.put("Goofy", new Gerbil(8));
		gerbils.put("Wowee", new Gerbil(9));
		System.out.println(gerbils);
		Set<String> sorted = new TreeSet<>(gerbils.keySet());
		System.out.println(sorted);
		System.out.println("------------------");
		Map<String, Gerbil> sortedGerbils = new LinkedHashMap<>();
		for (String s : sorted) {
			System.out.println("Adding " + s + ",");
			sortedGerbils.put(s, gerbils.get(s));
		}
		System.out.println("++++++++++++++++++++++");
		System.out.println(sortedGerbils);
		System.out.println("++++++++++++++++++++++++++");
		Map<String, Gerbil> sortedGerbils2 = new TreeMap<>(gerbils);
		System.out.println(sortedGerbils2);
	}
}
