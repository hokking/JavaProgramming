package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		// 비교연산자
		// - <, >, <=, >=, ==, !=
		// - 문자열 비교 : equals()

		int x = 10;
		int y = 20;
		boolean b = x < y;
		System.out.println(b);

		b = x <= y - 15; // 산술연산자가 비교연산자보다 우선순위가 더 높다.
		System.out.println(b);

		String str1 = "abc";
		String str2 = "ABC";
		b = str1 != str2; // 실제 값의 비교가 아닌 주소를 비교
		System.out.println(b);

		b = !str1.equals(str2); // 실제 문자열의 내용 비교
		System.out.println(b);

		// 다음의 문장들을 코드로 작성해주세요.
		// x는 y보다 작거나 같다.
		b = x <= y;
		
		// x + 5 와 y는 같다.
		b = x + 5 == y;
		
		// y는 홀수이다.
		b = y % 2 == 1;
		
		// "기본형"과 "참조형"은 다르다.
		b = !"기본형".equals("참조형");

	}

}
