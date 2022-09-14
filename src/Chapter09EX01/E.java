package Chapter09EX01;

//E 클래스는 A클래스를 상속바는다. <== A 클래스의 모든 필드와 메소드를 물려 받는다.
// A 클래스 : 부모 클래스 (super class)
// E 클래스 : 자식 클래스 (child class)
public class E extends A {

	public void print () {
		System.out.println("==부모의 필드 출력==");
		System.out.println(a);  //public   <== 부모의 a 필드
		System.out.println(b);  //protected <== 부모의 c 필드
		System.out.println(c); 
//		System.out.println(d); 
		
		print1();
		print2();
		print3();
//		print4();
	
		
	}
	
	
	
}
