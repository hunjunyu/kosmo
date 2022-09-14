package Chapter08EX02;

// import 없이 외부 클래스 접근.
  // A 클래스 (public) (접근 가능 o), B 클래스 (default)(접근 불가능 x)


public class Using_Package03 {

	public static void main(String[] args) {

		 //전체이름 : 패키지명.클래스명 (public)
         Chapter08EX01.A a = new  Chapter08EX01.A();
         
		System.out.println(a.m);  //외부 패키지에서 접근가능 (public)
		System.out.println(a.n);  //외부 패키지에서 접근가능 (public)
		
		a.print();                //외부 패키지에서 접근가능 (public)
		
		
		
		
	}

}
