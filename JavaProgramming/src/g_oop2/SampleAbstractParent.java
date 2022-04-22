package g_oop2;

public abstract class SampleAbstractParent {

	void method() {
		System.out.println("내용");

	}

	// 추상 메서드 : 선어부만 있고 구현부가 없는 메서드
	abstract void abstractMethod();

}

class SampleAbstractChild extends SampleAbstractParent {

	@Override
	void abstractMethod() {
		System.out.println("내용");
	}
	
}
