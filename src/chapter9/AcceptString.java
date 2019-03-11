package chapter9;

public class AcceptString {
	public String name() {
		return getClass().getSimpleName();
	}
	
	public String change(String s) {
		char[] chars = s.toCharArray();
		int length = chars.length - 1;
		for(int i=0;i<length/2;i++) {
			char a = chars[i];
			chars[i] = chars[length - i];
			chars[length - i] = a;
		}
		StringBuilder sb = new StringBuilder();
		for(char a : chars) {
			sb.append(a);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String s = "1234567";
		Apply.process(new StringAdapter(new AcceptString()), s);
	}
}
