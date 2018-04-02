package chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exe17 {
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
        Iterator<String> it = gerbils.keySet().iterator();
        while(it.hasNext()) {
        	String string = it.next();
//        	System.out.println(string);
//        	gerbils.get(string).hop();
        }
        Iterator<Gerbil> g = gerbils.values().iterator();
        while(g.hasNext()) {
        	System.out.println(g.next());
        }
	}
}
