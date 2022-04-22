package e_oop;

public class OOP {

	public static void main(String[] args) {

		// 객체지향 프로그래밍(Object Oriented Programming)
		// - 프로그램을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것.
		// - 코드의 재사용성이 높고 유지보수가 용이하다.

		SampleClass sc = new SampleClass(); // 객체 생성

		System.out.println(sc.field);

		String returnValue = sc.method1(10);
		System.out.println(returnValue);

		sc.method2();

		sc.flowTest1();

		Calculator cal = new Calculator();

		long res= cal.add(123456, 654321);
		res = cal.mul(res, 123456);
		res = cal.div(res, 123456);
		res = cal.sub(res, 654321);
		res = cal.rem(res, 123456);

		System.out.println(res);;

	}

}
