package chapter12;

public class LostMessage {
	public void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	public void dispose() throws HoHumException {
		throw new HoHumException();
	}
	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				try {
					lm.dispose();
				} finally {
					throw new AnotherException();
				}
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
}
