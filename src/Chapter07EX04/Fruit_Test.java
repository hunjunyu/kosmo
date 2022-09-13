package Chapter07EX04;

class Fruit{
	
	//1. 필드
	String name;//과일 이름
	String color;   //과일 색상
	int count ;     //과일 갯수
	int sugarcontent; //과일의 당도
	
	//2. 생성자
	Fruit(){}
	Fruit (String name,String color,int count, int sugarcontent){
		this.name = name;
		this.color = color;
		this.count = count;
		this.sugarcontent = sugarcontent;
	}
	
	//3. show() : 필드의 값을 모드 출력하는 메소드
	void show () {
		System.out.println(name + ", " + color + ", "+ count + ", "+ sugarcontent);
	}
	

	//4. getter/ setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSugarcontent() {
		return sugarcontent;
	}

	public void setSugarcontent(int sugarcontent) {
		this.sugarcontent = sugarcontent;
	}
	
	
	
	
	
	
}

public class Fruit_Test {

	public static void main(String[] args) {
		// 1. banana 객체 생성 후 필드에 기본값을 직접 입력 후 /직접출력 
		Fruit B = new Fruit ();
		B.name = "banana";
		B.color = "yellow";
		B.count = 4;
		B.sugarcontent = 13;
		
		//필드의 값 출력
		System.out.println("==== banana 객체 출력 ====");
		System.out.print(B.name + " ");
		System.out.print(B.color + " ");
		System.out.print(B.count + " ");
		System.out.print(B.sugarcontent + " ");
		System.out.println();
		
		
		// 2. apple 객체 : 생성자를 통해서 4개의 필드에 초기값 할당 show()출력
	   Fruit f = new Fruit ("apple", "red", 15, 14);
	   System.out.println("==== show() 메소드를 사용해서 출력 ====");
	   f.show();

		// 3. strawberry : setter를 사용해서 4개의 필드에 값 할당. getter 사용해서 출력
	   System.out.println("==== setter를 사용해서 출력 ====");
		Fruit c = new Fruit ();
		c.setName("strawberry");
		c.setColor("red");
		c.setCount(26);
		c.setSugarcontent(8);
	     
		c.show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
