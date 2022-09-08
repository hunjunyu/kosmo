package Chapter07EX03;

class A {
	//클래스 내부에 생성자가 존재하지 않는 경우 컴파일러가 기본 생성자를 자동으로 만들어 준다.
	//A () {}
	
	
	//필드 (인스턴스 필드 : 객체를 생성후 호출 (static이 없으므로))
	int m ;
	
	//메소드 (인스턴스 메소드 : 객체를 생성후 호출 (static이 없으므로))
	void work() {
		System.out.println(m);
	}
	
}

class B {
	//1. 필드
	int m;
	
	//2. 생성자 
	B () {}      // 기본 생성자 명시
	
	//3. 메소드
	void work() {
		System.out.println(m);
	}
}	
class C {
	// 1. 필드
	int m;
	
	// 2. 생성자 : 매겨변수가 하나인 생성자
	// 클래스 내부에 생성자가 존재하면 컴파일러가 생성자를 넣지 않는다.
   
	C (int a) {   //입력 매개 변수, 입력 매개 변수를 받는 변수, 필드의 변수 3개의 이름이 동일할때.
		        // 필드의 변수에 this. 를 사용해야함.
        m = a;
	}
	
	// 3. 메소드
	void work() {
		System.out.println(m);
	}
  
}

class Using_constructor {
	

	public static void main(String[] args) {
		// 객체 생성
        A a = new A();     //기본 생성자 호출 : A() , 생성자 생략된 경우 (컴파일러가 자동으로)
        
        System.out.println(a.m);  //0
        a.work();
        System.out.println("=================");
        
        B b = new B ();   //기본 생성자 호출 B();
        System.out.println(b.m);
        b.work();   //0
        
        System.out.println("=================");
        
        //오류발생
        //C c = new C ();   //오류 발생 : 생성자가 클래스 내부에 하나라도 존재하면 생성자를 자동으로  넣지 않는다.
        
        C c = new C (10);   // 필드의 값을 초기화 할때 생성자를 사용
        System.out.println(c.m);
        c.work();
        
        
        
        
	}

}
