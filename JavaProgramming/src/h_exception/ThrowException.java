package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {

		try {
			throw new IOException(); // 예외를 강제로 발생
		} catch (IOException e) {
			e.printStackTrace();
		}

		// NullPointerException : 변수에 null이 들어있어서 발생된다

		// String str = null;
		// System.out.println(str.equals(""));
		
		// IndexOutOfBoundsException : 배열의 인덱스를 벗어나서 발생된다
		int[] a = new int[10];

		for (int i = 0; i <= a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
