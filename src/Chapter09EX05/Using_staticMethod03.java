package Chapter09EX05;

//static 필드의 값 초기화 : 클래스 내부에서 static { 필드의 값을 초기화 }
// 클래스명.필드명, 호출될때  static{}이 제일 먼저 작동
class C{
	
	int a ;
	static int b;
	
	static {  // 클래스가 클래스 영역에 로드될때 제일 먼저 작동. 생성자와 같은 역할
		b=5;
		System.out.println("클래스 C가 로딩 되었습니다.");
	}
	
	C(){     //생성자 : 객체를 생성시 필드의 초기값을 할당.
		a = 3;  // 인스턴스 필드 초기화
		b = 55; // 정적 필드 초기화
		
	}
	
	
}

public class Using_staticMethod03 {

	public static void main(String[] args) {
		// 객체 생성 없이 static 필드 호출.
		
		 System.out.println(C.b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
