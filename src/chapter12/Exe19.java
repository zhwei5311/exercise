package chapter12;

public class Exe19 {
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
			} catch(VeryImportantException e) {
				throw new VeryImportantException();
			}finally {
				lm.dispose();
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
}
