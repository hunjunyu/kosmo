package Chapter10EX01;



class Fruit{  //과일 <==부모클래스
	String name;  //과일이름
	String color; //과일색갈
	int large;  // 과일크기
	
	void eat () {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
	void print() {
		System.out.println(name + "," + color + ","+large);
	}
	
	
}
class Apple extends Fruit { //사과 <== 자식클래스
	// 자식 클래스만 가지는 필드 1, 메소드1
	int applecount;
	void apple(){
		System.out.println("사과의 갯수 : "+applecount);
	}
	
}
class Orange extends Fruit { //오렌지 <== 자식클래스
	// 자식 클래스만 가지는 필드 1, 메소드1
	int orangecount;
	void orange () {
		System.out.println("오렌지의 갯수 : "+orangecount);
	}
}
class Banana extends Fruit { //바나나 <== 자식클래스
	// 자식 클래스만 가지는 필드 1, 메소드1
	 int bananacount;
	
	void banana () {
		System.out.println("바나의 갯수 : "+bananacount);
	}
	
}




public class Using_Inheritqance02 {

	public static void main(String[] args) {
		
		System.out.println("=== Furit 객체 출력 ===");
		Fruit f = new Fruit();
		
		f.name = "과일";
		f.color = "과일색깔";
		f.large = 10;
		
		f.eat();
		f.print();
		
		System.out.println("=== Apple 객체 출력 ===");
		
		
		Apple a = new Apple();
		a.name = "사과";
		a.color = "빨간색";
		a.large = 15;
		a.applecount = 30;
		
		a.eat();
		a.print();
		a.apple();
		
		System.out.println("===Orange 객체 출력 ===");
		Orange o = new Orange();
		o.name = "오렌지";
		o.color = "주황색";
		o.large = 20;
		o.orangecount = 5;
		
		o.print();
		o.orange();
		
		System.out.println("===Banana 객체 출력 ===");
		Banana b = new Banana();
		b.name = "바나나";
		b.color = "노란색";
		b.large = 20;
		b.bananacount = 8;
		
		b.print();
		b.banana();
		

	}

}
