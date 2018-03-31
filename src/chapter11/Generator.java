package chapter11;

import java.util.Collection;

public class Generator {
	int key = 0;
	public String next() {
		switch(key) {
		case 0:
			key++;
			return "三块广告牌";
		case 1:
			key++;
			return "黑豹";
		case 2:
			key++;
			return "从你的全世界路过";	
		case 3:
			key++;
			return "黑猫警长";
		case 4:
			key++;
			return "红海行动";
		case 5:
			key++;
			return "厉害了，我的国";
		case 6:
			key++;
			return "西游记女儿国";	
		default:
		case 7:
			key++;
			return "古墓丽影";
		}
	}
	public void fillAll(String[] s) {
		for(int i=0;i<s.length;i++) {
			s[i] = next();
		}
	}
	public Collection fill(Collection<String> c,int n) {
		for(int i = 0;i<n;i++) {
			c.add(next());
		}
		return c;
	}
}
