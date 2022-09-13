package Chapter07EX05;

class AA {
	int m;   //0
	int n;   //0
	 
	void init (int m,int n) {   // this 키를 명시하지 않은 경우
		m=n;    // 3개의 m모두 지역변수
		n=m;
	}
}

class BB{
	int m;
	int n;
	
	void init(int m, int n) {   //this 키를 명시한 경우
		this.m = m;  // this.m : 필드, m : 지역변수
		this.n = n;
	}
	
}

public class ThisKeyword02 {

	public static void main(String[] args) {
		
		AA aa = new AA();   //기본 생성자 호출
		aa.init(10, 20);
		System.out.println(aa.m);  //0
		System.out.println(aa.n);  //0
		
		BB bb = new BB();
		bb.init(10, 20);
		System.out.println(bb.m);
		System.out.println(bb.n);
		
		
		

	}

}
