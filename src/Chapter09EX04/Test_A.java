package Chapter09EX04;

public class Test_A {

	public static void main(String[] args) {
		
		
		// 객체생성 후 출력 (인스턴스 필드, 정적 필드)
        A a1 = new A ();
        System.out.println(a1.m);  //인스턴스 필드 : 객체 생성 후 출력
        System.out.println(a1.n);  //정적 필드 : 객체 생성후, 객체 없이도 출력
        
        
		// 객체 생성 없이 출력    (클래스이름.n)
		 System.out.println("==객체 생성없이 출력");
		System.out.println(A.n); // 정적 필드 출력 : 클래스명
		System.out.println(A.m);  // 인스턴스 필드 : 반드 시 객체
		
		// 정적 필든는 모든 객체에서 공유하하는 필드
		 A a2= new  A ();
		      a2.m =10;      //m : 3==>10 : 인스턴스필드 : 그 객체에서만 저장됨
		      a2.n = 1000;   //n : 5 ==> 정적 필름 ; 모든 객체에서 공유되는 필드
		      
		 A a3= new  A ();
		     a3.m = 20;      //m :10 ==>20
		     a3.n = 2000;    //n :10  == >2000
		 A a4= new  A ();
		      a4.m =10;		 
			 a4. n = 3000;
		
			 
		A.n  5000;
			 
			 
			 
			 
			 
	}

}
