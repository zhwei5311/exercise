package chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exe7 {
	public static int a[] = new int[3];
	private static Logger logger = Logger.getLogger("Exe7's Exception!");
	static void logException(Exception e){  
        StringWriter trace=new StringWriter();  
        e.printStackTrace(new PrintWriter(trace));  
        logger.severe(trace.toString());  
    }
	public static void main(String[] args) {
		try {
			a[3] = 4;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Caught ArrayIndexOutOfBoundsException");
			logException(e);
		}
	}
}
