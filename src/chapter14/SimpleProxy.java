package chapter14;

public class SimpleProxy implements	Interface {
	private Interface proxied;

	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}
	
	public void doSomething() {
		System.out.println("SimpleProxy doSomething");
		proxied.doSomething();
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("somethingElse" + arg);
		proxied.somethingElse(arg);
	}
	
}
