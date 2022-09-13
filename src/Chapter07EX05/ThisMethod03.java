package Chapter07EX05;

import java.util.Scanner;

class Book{
	
	String bookname;  // 책이름
	String author;    // 책 저자
 	
	Book(){
		bookname = "책 이름없음";
		author = "작자 미상";
	}
	Book(String bookname){
		this();
		this.bookname = bookname;
	}
	Book(String bookname, String author){
		this(bookname);         // this () 메소드 : 생성자 호출
		this.author = author;   // this 키워드 : 자신의 객체의 필드, 메소드 가르킬때 사용.
	}
	void show() {   //메모리의 필드의 값을 출력 해줌
		System.out.println("책의 이름은 : "+ bookname   );
		System.out.println("책의 저자는 : " + author );
	}
}



public class ThisMethod03 {

	public static void main(String[] args) {
		//  스캐너를 사용해서 2개의 값을 인풋 받습니다.
		System.out.println(" 책 이름을 입력하세요>>>");
		
		System.out.println(" 책의 저자를 입력 하세요>>>");
		
		// 1. 기본 생성자 호출
		System.out.println("== 기본 생성자 호출==");
		Scanner sc =  new Scanner(System.in);
		
		Book b = new Book ();
		b.show();
		
		//2. 매개변수 1개인 생성자 호출
		Book b2 = new Book("심청전");
		b2.show();
		
		//3. 매개변수가 2개인 생성자 호출
		Book b3 = new Book("홍길동", "허균");
		b3.show();
		
		//4. 매개변수가 2개인 생성자 호출 ("어린왕자", "생텍쥐베리" )
		System.out.println(" ==매개 변수가 2개인 생성자 호출 ===");
		Book b4 = new Book("어린왕자", "생텍쥐베리");
		b4.show();
		
		//5. 매개변수가 1개인 생성자 호출 ("포청천면")
		 System.out.println("== 매개변수 1개인 생성자 호출 ==");
		Book b5 = new Book( b.bookname,"포청천면");
		b5.show();
		
	}

}
