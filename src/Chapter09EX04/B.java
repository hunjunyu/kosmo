package Chapter09EX04;

class Bb{
	
	int m = 3;
	static int n = 5;
}


public class B {
	public static void main(String[] args) {
		//객체 생성
		Bb b1 = new Bb ();
		Bb b2 = new Bb ();
		
		//인스턴스의 필드의 값 변경 (객체 내부에 저장되어 있어 각 각 적용되어 있다.)
		b1.m = 5;   // m : 3 ==>5 로 수정
		b2.m = 6;   // m : 3 ==>5로 수정
		
		System.out.println(b1.m);
		System.out.println(b2.m);
		
		//정적 필드값 수정 : 모든 객체에서 공유해서 사용하는 필드 
		b1.n=7;
		b2.n = 8;
		
		System.out.println(b1.n);    //8
		System.out.println(b2.n);    //8
		
		//정적 필드 수정 : 객체 없이 클래스 명으로 수정
		Bb.n= 9;
		System.out.println(b1.n); //9
		System.out.println(b2.n); //9
		
		
		
	}
	
	
	
	
	
}
