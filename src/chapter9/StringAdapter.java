package chapter9;

public class StringAdapter implements Processor {
	AcceptString as;
	public StringAdapter(AcceptString acceptString) {
		as = acceptString;
	}
	
	@Override
	public String name() {
		return as.name();
	}

	@Override
	public Object process(Object input) {
		return as.change((String) input);
	}
	
}
