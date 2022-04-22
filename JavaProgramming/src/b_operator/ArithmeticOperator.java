package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {

		// 산술 연산자
		// - 사칙연산자 : +, -, *, /, %(나머지)
		// - 복합연산자 : +=, -=, *=, /=, %=
		// - 증감연산자 : ++, --

		int result = 10 + 20 - 30 * 40 / 50 % 60;

		// 나머지 연산 - 홀수, 짝수 구분
		// result = 10 / 3;
		// System.out.println(result);
		// result = 10 % 3;
		// System.out.println(result);

		// 5개의 산술연산자를 사용해 5개의 연산을 수행 후 결과를 출력해주세요.
		 result = 19 + 2;
		 System.out.println(result);
		 result = 21 - 18;
		 System.out.println(result);
		 result = 26 * 31;
		 System.out.println(result);
		 result = 30 / 2;
		 System.out.println(result);
		 result = 50 % 60;
		 System.out.println(result);

		// 복합연산자
		// result = result + 3;
		// System.out.println(result);
		//
		// result += 3;
		// System.out.println(result);

		// 아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		result += 10;
		System.out.println(result);
		result %= 5;
		System.out.println(result);
		result -= 2 * 3;
		System.out.println(result);

		// 증감연산자
		// 증가연산자(++) : 변수의 값을 1 증가시킨다.
		// 감소연산자(--) : 변수의 값을 1 감소시킨다.

		int i = 0;
		++i; // 전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		i++; // 후위형 : 변수의 값을 읽어온 후에 1 증가된다.

		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);

		// 피연산자의 타임이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double; // 타입 변환 생략 - 작은 타입에서 큰 타입으로의 변환은 자동적으로
											// 된다.

		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short; // int보다 작은 타입은 4byte인 int로 형변환된다.

		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2; // ASCII 코드값으로 변환 후 출력
		System.out.println(_int);

		// 오버플로우, 언더플로우
		// 표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127;
		b++;// 오버플로우
		System.out.println(b);
		b--;// 언더플로우
		System.out.println(b);

		// 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		long res = 123456 + 654321;
		res *= 123456;
		res /= 123456;
		res -= 654321;
		res %= 123456;
		System.out.println(res);

		// 3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		int num1 = 463;
		int num2 = 262;
		int num3 = 189;
		int sum = num1 + num2 + num3;
		double avg = sum / 3.0; // 둘 다 double타입이어야 하므로 3.0으로 나눠준다.
		System.out.println("합계 :" + sum + " 평균 :" + avg);

		// 반올림
		avg = Math.round(avg * 10) / 10.0; // 소수점 첫째자리에서 반올림을 해준다.
		System.out.println(avg);

		// 랜덤
		// Math.random() - 0.0 ~ 1.0 미만의 수(0.0 ~ 0.99)를 랜덤으로 발생시킨다.
		int random = (int) (Math.random() * 100) + 1;//(1 ~ 100)
		System.out.println(random);

	}

}
