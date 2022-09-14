package Chapter09EX02;

import Chapter09EX01.A;

//class D는 class A를 상속 받는다. (패키지 외부에서 상속 설정)
// D클래스는 A 클래스의 필드와 메소드를 상속 받는다.

// protected 접근 제어자 : 상속 관계가 있을때만 외부 패키지에서 접근가능


public class D extends A {
	
	public void print () {
	     System.out.println("== 부모 클래스의 필드 출력==");
		System.out.println(a);    //public
		System.out.println(b);    //protected
		//System.out.println(c);  //default
		//System.out.println(d);  //private
	}
	
	
	

}
