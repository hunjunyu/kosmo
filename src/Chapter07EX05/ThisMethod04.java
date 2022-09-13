package Chapter07EX05;

class Car{
	  
   String companyname;    //현대 자동차
   String color;          // 검은색
   double maxspeed;      // 200.0km/h
	Car(){
		companyname = "현대 자동차";
		color = "검은색";
		maxspeed = 200.0;
		
		
	}
	Car(String companyname){
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
