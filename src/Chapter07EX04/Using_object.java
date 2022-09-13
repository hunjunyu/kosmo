package Chapter07EX04;

class Person{
        // class : 객체를 생성하기 위한 틀, 붕어빵기계, 설계도
	    // Object(객체, 인스턴스) : 붕어빵, 건축물 <== 인스턴스화()
	
	    // 1. 필드 : 클래스 블락에서 선언된 변수 (Heap)영역에 저장
	    // 2. 지역변수 : 메소드 블락에서 선언된 변수 (Stack)영역에 저장
	    String name ;  // 이름             :null
	    float height;  // 키 (실수)         : 0.0
	    float weight;  // 몸무게 (실수)      : 0.0
	    int age;       // 나이             : 0
	    
	    // 3. 생성자 (Constructor) : 1. 리턴타입이 없다. 2. 클래스 이름과 동일(메소드)
	           // 필드의 기본값을 초기화
	           // 생성자 오버로딩 : 생성자 이름은 동일, 식별자 (인풋 매개변수 타입, 갯수) 
	           // 생성자 오버라이딩
	    Person () {     // 기본 생성자 : 인풋 값이 비어있는 생성자, 생략가능
	    	
	    }
	    Person (String s){ // this 키워드 없이 필드에 값 할당. 변수명이 다르다.
	    	name = s;
	    }
	    Person (String name, float height){ // this : 인풋 매개변수명, 값을 받는 변수, 필드명
	    	this.name = name;
	    	this.height = height;
	    }
	    Person (String name, float height, float weight, int age){
	    	this.name = name;
	    	this.height = height;
	    	this.weight = weight;
	    	this.age = age;
	    }
	    
	    // 4. 메소드 (함수) : 기능을 실행하는 코드가 저장. 호출시 작동, 메소드명 ();
	    
	    void show () {   //필드의 내용을 출력하는 메소드
	    	System.out.println(name + " , " + height + ", "+ weight + ", "+ age);
	    }
	    
	    // 5. getter(), setter <== 필드의 내용을 출력, 필드의 내용을 입력
	    
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getHeight() {
			return height;
		}
		public void setHeight(float height) {
			this.height = height;
		}
		public float getWeight() {
			return weight;
		}
		public void setWeight(float weight) {
			this.weight = weight;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	    
	  
	    

}

public class Using_object {

	public static void main(String[] args) {
		// 객체 생성, main method 
		
		//1. 기본 생성자 호출 
		Person p = new Person ();
	    	// 필드 내용 출력 (1. 객체 명으로 출력)
		
		System.out.println(p.name);
		System.out.println(p.height);
		System.out.println(p.age);
		
		// getter 를 사용해서 필드의 내용을 출력 (//필드의 값을 리턴)
		System.out.println("=======getter를 사용해서 출력==========");
		System.out.println(p.getName());
		System.out.println(p.getHeight());
		System.out.println(p.getWeight());
		System.out.println(p.getAge());
		
		//show() : 필드의 내용을 출력
		System.out.println("=======show() method를 사용해서 호출 ==========");
		p.show();
		
		
		// 2. 매개변수가 1개인 생성자 호출
		System.out.println("== 매개변수가 1개 출력==");
		Person lee = new Person ("이순신");
		//필드 내용 출력 (1. 객체 명으로 출력)
		System.out.println(lee.name);
		System.out.println(lee.height);
		System.out.println(lee.weight);
		System.out.println(lee.age);
		
		lee.show();
		
		//3. 매개변수가 4개인 생성자 호출
		System.out.println("== 매개변수가 4개 생성자 호출==");
		Person hong = new Person ("홍길동",187.5f,146.3f,26);
		System.out.println(hong.name);
		System.out.println(hong.height);
		System.out.println(hong.weight);
		System.out.println(hong.age);
		
		hong.show();
		
		//Setter 를 사용해서 필드의 값 할당. Getter를 사용해서 필드의 값 출력
		
		System.out.println("=============Setter/Getter 사용=============");
		Person jung = new Person();
		
		//setter를 사용해서 필드가 값 할당.
		jung.setName("정도령");
		jung.setHeight(187.5f);
		jung.setWeight(85.5f);
		jung.setAge(26);
		
		//getter를 사용해서 필드의 값을 호출
		System.out.println(jung.getName());
		System.out.println(jung.getHeight());
		System.out.println(jung.getWeight());
		System.out.println(jung.getAge());
		
		jung.show();
		
	}

}
