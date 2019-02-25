package chapter14;

public class SimpleProxyDemo {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		consumer(new RealObject());//直接调用RealObject
		consumer(new SimpleProxy(new RealObject()));//代理调用RealObject,通过SimpleProxy动态代理
	}
}
