package chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exe6_1 extends Exception {
	public static Logger logger = Logger.getLogger("Exe6_1");
	static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
