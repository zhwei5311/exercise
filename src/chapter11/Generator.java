package chapter11;

import java.util.Collection;

public class Generator {
	int key = 0;
	public String next() {
		switch(key) {
		case 0:
			key++;
			return "��������";
		case 1:
			key++;
			return "�ڱ�";
		case 2:
			key++;
			return "�����ȫ����·��";	
		case 3:
			key++;
			return "��è����";
		case 4:
			key++;
			return "�캣�ж�";
		case 5:
			key++;
			return "�����ˣ��ҵĹ�";
		case 6:
			key++;
			return "���μ�Ů����";	
		default:
		case 7:
			key++;
			return "��Ĺ��Ӱ";
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
