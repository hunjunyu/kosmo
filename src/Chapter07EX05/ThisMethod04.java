package Chapter07EX05;

class Car{
	  
	// this.키워드 : 필드나 메서드 선언시 사용불가.
	// - 생정자, 매소드 내부에서 필드나 메소드를 사용할때 자신의 객체의 필드나 메소드를 지칭
	// - 자신의 객체의 필드, 메서드를 가르킨다, 기본적으로 생략해서 많이 사용.
	// - 반드시 사용해야 할 경우 : 멘소드, 생성자에서 입력 매개변수 이름, 필드 이름이 동일할 경우
	// this(); - 생성자 내부에서만 사용, 반드시 첫 라인에 위치
	// - 자신의 객체의 다른 생성자 호출시 사용.
	// - 생성자를 오버라이딩 할때 코드를 간략하게 만들어줌.
   String companyname;    //현대 자동차
   String color;          // 검은색
   double maxspeed;      // 200.0km/h
   
   //생성자
	Car(){  //리턴타입이 없다, 클래스이름과 동일
		companyname = "현대 자동차";  //this 키를 생략시 자동으로 컴파일러가 할당.
		color = "검은색";
		maxspeed = 200.0;
		
		
	}
	Car(String companyname){  //매개변수 이름, 필드이름이 같을때
		this();   //this () 메소드, 기본 생성자 호출
		this.companyname = companyname;
	}
	Car(String companyname,String color){
		this(companyname);
		this.color = color;
	}
	Car(String companyname,String color, int maxspeed){
		this(companyname,color);
		this.maxspeed = maxspeed;
	}
	void show () {
		System.out.println(companyname + "," + color + "," + maxspeed+"km/h");
	}
	

	
}

public class ThisMethod04 {

	public static void main(String[] args) {
		//this keyword, this method를 사용해 처리.
		
		// 1. 매개변수 0개일때, 기본 필드의 값 출력
		System.out.println(" == 매개변수 0개일때, 기본 필드의 값 출력==");
		Car c =new Car();
		c.show();
		// 2. 매개변수 1개일때, 컴퍼니네임만 출력
		System.out.println("==매개변수 1개일때, 컴퍼니네임만 출력==");
		Car c1 = new Car("기아 자동차");
		c1.show();
		
		// 3. 매개변수 2개일때, 컴퍼니네임, 컬러 출력
		System.out.println("==매개변수 2개일때, 컴퍼니네임만 출력==");
		Car c2 = new Car("기아 자동차","하얀색");
		c2.show();
		
		//3. 매개변수 3일때 , 전부 출력
		System.out.println("==매개변수 3개일때, 컴퍼니네임만 출력==");
		Car c3 = new Car("기아 자동차", "하얀색", 180);
		c3.show();
		
	}

}
