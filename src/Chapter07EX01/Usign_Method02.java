package Chapter07EX01;

 class R {
	int a ;
	String b;
	
	R(int a,String b){
		this.a = a;
		this.b = b;

	}
	void call () {
		double area = 3.14 *a *a;
		System.out.println(b + "의 넓이는 "+ a + "입니다. ");
	}
	
	
	
	
	
}
public class Usign_Method02 {

	
	public static void main(String[] args) {
		// 원의 지름을 넣었을때 전체 넓이를 구하는 객체를 생성 후 출력 보세요.
		//   피자  : 10 (반지름)
		//   도넛 : 5 (반지름)
		// 피자의 넓이는 00입니다. 
		// 도넛의 넓이는 00 입니다.

		R pizza = new R (10,"피자");
		pizza.call();
        R donut = new R (5, "도넛");
        donut.call();
		
	}

}
