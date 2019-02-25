package chapter14;

import java.util.ArrayList;
import java.util.List;

public class Part {
	public String toString() {
		return getClass().getSimpleName();
	}
	static List<? extends Part> partFactories = new ArrayList<>();
}
