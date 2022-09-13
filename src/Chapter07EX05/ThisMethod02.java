package Chapter07EX05;

// Aa 클래스 : 여러개의 생성자 사용시 this () 없이 사용한 경우 : 중복된 값을 매번 입력 해야함.

class Aaa{
	int m1, m2,m3,m4;   //정수 값을 담는 필드 4개 선언
	Aaa(){  //기본생성자
		m1 = 1; m2=2; m3= 3; m4=4; // 필드의 기본값 할당
	}
	Aaa(int a){
		this();
		m1=a;
	}
	Aaa(int a ,int b){
		this(a);
		m2=b;
	}
	void print() {  // 각 필드의 값을 출력 하는 메소드
		System.out.print(m1+ " ");
		System.out.print(m2+ " ");
		System.out.print(m3+ " ");
		System.out.print(m4+ " ");
		System.out.println();

	}
	
}

//Bb 클래스 : 여러개의 생성자 사용시 this ()를 사용한 경우 : 중복된 값을 지정


public class ThisMethod02 {

	public static void main(String[] args) {
		
	

		System.out.println();
		Aaa aaa1= new Aaa();
		aaa1.print();
		
		Aaa aaa2 = new Aaa(10);
		aaa2.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	

}
