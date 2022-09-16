package Chapter10EX06;

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
	@Override
	void run() {
		System.out.println("호랑이는 무섭게 뜁니다.");
	
	}
	void eat () {
		System.out.println("호랑이는 육식을 합니다.");
	}
	
}
class Egle extends Animal {
	@Override
	void run () {
		System.out.println("독수리는 납니다.");
	}
	void eat () {
		System.out.println("독수리는 육식을 하는 맹금류 입니다.");
	}
	
}
class Fish extends Animal {
	@Override
	void run () {
		System.out.println("물고기는 헤엄을 칩니다.");
	}
	void eat () {
	    System.out.println("물고기는 잡식성 입니다.");
	}
	
}
class Dog extends Animal {
	@Override
	void run () {
		System.out.println("강아지는 잘 달립니다.");
	}
	void eat () {
		System.out.println("강아지는 잡식성 입니다.");
	}
}

public class Using_Method_Overriding03 {

	public static void main(String[] args) {
		
		Animal a = new Animal ();
		Animal b = new Tiger();	
		Animal c = new Egle();	
		Animal d = new Fish();	
		Animal e = new Dog();
		
		//Animal의 메소드 호출
		a.eat();
		a.run();
		b.eat();
		b.run();
		c.eat();
		c.run();
		d.eat();
		d.run();
		e.eat();
		e.run();
		
		//배열에 객체를 저장 : Animal 객체를 배열에 저장
		System.out.println("=====for문을 이용해 출력 =====");
		Animal [] aa = new Animal [] {a,b,c,d,e};
		
		//For문을 사용해서 배열의 내용을 출력
		for (int t = 0; t<aa.length; t ++) {
			aa[t].eat();       // Animal의 메소드 호출
			aa[t].run();       // Animal의 메소드 호출
		}
		
	    //Enhanced For 문을 사용해서 출력
	    System.out.println(" ==== Enhanced for 문을 이용해 출력 =====");
	    for (Animal k : aa) {
	    	k.eat();
	    	k.run();
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
