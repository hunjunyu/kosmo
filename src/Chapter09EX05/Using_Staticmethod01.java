package Chapter09EX05;

// 메소드 이름앞에 static이 없는 메소드 : 인스턴스 메소드
// 메소드 이름앞에 static이 있는 메소드 : 정적 메소드

class A {
	
	void abc() {
		System.out.println("인스턴스 메서드");
	}
	static void bcd() {
		System.out.println("정적 메서드");
	}

}

public class Using_Staticmethod01 {

	public static void main(String[] args) {
		// 객체 생성 없이 바로 호출 : 정적 메소드 
//		A.abc();
		A.bcd();
		// 객체 생성후 호출
		System.out.println("================");
		A a = new A();
		a.abc();
		a.bcd();

	}

}
