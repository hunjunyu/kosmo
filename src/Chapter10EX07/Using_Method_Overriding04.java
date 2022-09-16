package Chapter10EX07;


class Animal{
	// 자식 클래스에서 2개의 메소드를 오버 라이딩
	// Animal 타입으로 정의, 배열에 저장후, 오버라이딩된 메소드 출력 (for, enhanced for)
	
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat () {
		System.out.println("모든 동물은 먹습니다.");
	}
	
}
class Tiger extends Animal{
	int count;
	Tiger(int count){
		this.count = count;
	}
	

	@Override
	void run() {
		System.out.println("호랑이는 무섭게 뜁니다.");
	
	}
	void eat () {
		System.out.println("호랑이는 육식을 합니다.");
	}

}
class Egle extends Animal {
	int count;
	Egle(int count){
		this.count = count;
	}
	
	
	@Override
	void run () {
		System.out.println("독수리는 납니다.");
	}
	void eat () {
		System.out.println("독수리는 육식을 하는 맹금류 입니다.");
	}
	
}
class Fish extends Animal {
	int count;
	Fish(int count){
		this.count = count;
	}
	
	@Override
	void run () {
		System.out.println("물고기는 헤엄을 칩니다.");
	}
	void eat () {
	    System.out.println("물고기는 잡식성 입니다.");
	}
	
}
class Dog extends Animal {
	int count;
	Dog(int count){
		this.count = count;
	}
	
	@Override
	void run () {
		System.out.println("강아지는 잘 달립니다.");
	}
	void eat () {
		System.out.println("강아지는 잡식성 입니다.");
	}
}


public class Using_Method_Overriding04 {

	public static void main(String[] args) {
		//1. 객체생성
		//1. 객체 생성 (Animal 타입으로 생성)
		// 생성자를 통해서 각각의 필드에 값을 할당.
		Animal a = new Animal ();
		Animal b = new Tiger(10);	 // 10
		Animal c = new Egle(5);	 // 5
		Animal d = new Fish(50);	 // 50
		Animal e = new Dog(70);    // 70
		 
		//객체를 배열에 저장
		Animal [] aa = new Animal [] {a,b,c,d,e};
		
		System.out.println("=====for문을 이용해 출력 =====");
		
		//For문을 사용해서 배열의 내용을 출력
		
		
		
		//동물의 총 합을 구하는 변수 선언 
		int sum = 0;
		
		for (int i = 0; i <aa.length; i++) {
			
			//배열의 각 방에 저장된 객체를 Animal 객체에 저장
			Animal a1 = aa[i];
			a1.eat();  // Animal의 eat() 메소드 : 오버라이딩된 메소드 출력
			a1.run();  // Animal의 run() 메소드 : 오버라이딩된 메소드 출력
			
			if(a1 instanceof Tiger) {
				Tiger t1 = (Tiger) a1;
				sum += t1.count ;   //sum = sum + t1.count
				
			}
			if(a1 instanceof Egle) {
				Egle e1 = (Egle) a1;
				sum += e1.count ;   //sum = sum + t1.count
				
			}
			if(a1 instanceof Fish) {
				Fish f1 = (Fish) a1;
				sum += f1.count ;   //sum = sum + t1.count
				
			}
			if(a1 instanceof Dog) {
				Dog d1 = (Dog) a1;
				sum += d1.count ;   //sum = sum + t1.count
				
			}
			
		}
		System.out.println("총 동물의 수는 : " + sum);
		
		
	    //Enhanced For 문을 사용해서 출력
	    System.out.println(" ==== Enhanced for 문을 이용해 출력 =====");
	    for (Animal k : aa) {
	    	k.eat();
	    	k.run();
	    	System.out.println("총 동물의 수는 : " + sum);
	    }
		
		
		//For 문을 사용해서 출력 : eat(), run(), 동물의 총 수마리
		//1.  for 문을 사용해서 객체를 Animal객체로 뽑아서
		//2. 다운캐스팅해서 자식 필드의 count 읽어서 총 더한 값을 출력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
