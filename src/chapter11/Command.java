package chapter11;
/**
 * дһ����ΪCommand���࣬������һ��String���һ����ʾ��String��operation()����
 * @author zhwei
 *
 */
public class Command {
	String s = new String();
	public Command(String s) {
		this.s = s;
	}
	public void operation() {
		System.out.println(s);
	}
}
