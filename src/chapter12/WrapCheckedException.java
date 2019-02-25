package chapter12;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WrapCheckedException {
	public void throwRuntimeException(int type) {
		try {
			switch (type) {
			case 0:
				throw new FileNotFoundException();
			case 1:
				throw new IOException();
			case 2:
				throw new RuntimeException("Where an I?");
			default:
				return;
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
