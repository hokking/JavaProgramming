package g_oop2;

public class SampleChild extends SampleParent {

	void childMethod() {
		System.out.println(var); // 상속받은 변수
		System.out.println(method(7, 13)); // 상속받은 메서드
	}

	// 오버라이딩 : 메소드를 다시 만드는 것
	// super, super() : 부모 클래스와 자식 클래스 변수의 이름이 중복될때 사용(메서드도 마찬가지) - super
	// 부모 클래스의 생성자를 호출할 때 사용 - super()
	// 다형성 : 객체의 타입과 변수의 타입이 서로 다른 거

	// 오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것
	@Override
	// 어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는 것
	int method(int x, int y) { // 리턴타입 메서드명 파라미터 모두 같아야 한다.
		return x * y;
	}

	// super, super()
	int var;

	void test(double var) {
		System.out.println(var); // 지역변수
		System.out.println(this.var); // 인스턴스 변수
		System.out.println(super.var); // 부모 클래스의 인스턴스 변수
		// super : 부모 클래스의 멤버와 자식 클래서의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20)); // 자식 클래스의 메서드
		System.out.println(super.method(10, 20)); // 부모 클래스의 메서드
	}

	SampleChild() {
		super(); // 부모 클래스의 생성자 호출
		// super()를 통해 클래스의 생성자를 호출하고 부모 클래스의 인스턴스 변수도 초기화한다.
		// super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	}

	// 다형성
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild(); // 상속관계에 있는 전제하에 변수를 저장할 수 있다.
		// SampleChild2
		// SampleChild3

		// SampleParent : 2개
		// SampleChild : 6개
		sc = (SampleChild) sp;
		sp = sc;

	}

}
