package chapter11;

import java.util.ArrayList;

public class Gerbil {
	int gerbilNumber;
	public Gerbil(){
		gerbilNumber = 0;
	}
	public Gerbil(Integer i) {
		gerbilNumber = i;
	}
	public int hop() {
		System.out.println("gerbil " + gerbilNumber + " hops");
		return gerbilNumber;
	}
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for(int i=0;i<3;i++) {
			gerbils.add(new Gerbil());
		}
		for(int i=0;i<gerbils.size();i++) {
			System.out.println(gerbils.get(i).hop());
		}
	}
}
