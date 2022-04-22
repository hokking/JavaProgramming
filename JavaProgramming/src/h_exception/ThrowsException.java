package h_exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		try {
			method();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void method() throws IOException { // 메서드가 선언됐을 때 IOException
														// 예외가 선언될 수 있다
		throw new IOException();
	}

}
