package Chapter07EX04;

import java.util.Scanner;

class Converter {  //환률을 계산하는 클래스
	// 1. 필드
	double rate;    //환률을 저장하는 변수 1달라 =  1377.30 원 
	
    // 2. 메소드 생성 (달러를 인풋 받아서 원화로 변환하는 메소드), 메소드 이름 : toKWR()
	double tokwr(double dollor){
		return dollor* rate;
	}
	// 3. 메소드 생성 (원화를 인풋받아서 달러를 변환하는 메소드), 메소드 이름 toDoller()
	double todollor(double won) {
		return won/rate;
	}
	// 4. setRate() 메소드 생성 : setter를 사용해서 rate 필드의 값을 할당.
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}

}

public class Converter_Test {

	public static void main(String[] args) {
		// 네이버를 검색해서 오늘 환률을 알아와서
		// 객체 생성후 스캐너로 환률을 인풋 받아서 setRate()메소드에 저장후
	    // 원화 100만원 ==> 몇$ 인지 출력	
		// 100달러를 ==> 몇 만원인지 출력
		Scanner sc = new Scanner (System.in);
		System.out.println("오늘의 환률을 입력해주세요");
		double rate = sc.nextDouble();
        Converter c = new Converter ();
        c.setRate(rate);
        
		System.out.println("100달러는"+ c.todollor(1000000)+"만원 원");
		System.out.println("100만원은" + c.tokwr(100)+ "달러입니다.");
		
		System.out.println("===================");
		System.out.printf("원화 100만원은 %.2f $ 입니다.",c.todollor(1000000));
		System.out.println();
		System.out.printf("100달러는 %.2f 원입니다.",c.tokwr(100));

		//2. 변수에 더블 값을 할당 후 소숫점 2자리까지 변환해서 출력
		System.out.println();
		System.out.println("=======예시========");
		double per2 = 3.141592;
		    //String으로 변환 후 per2의 변수의 값을 소수점 2자리까지 출력 후 다시 더블형으로 변환
		double per1 = Double.parseDouble(String.format("%.2f", per2));
		System.out.println(per1);
		
		System.out.println("=====실수를 변수에 할당 후 소숫점 2자리 까지 출력======");
	    double d2  = c.todollor(1000000);
	    double d1 = Double.parseDouble(String.format("%.2f", d2));
	    System.out.println("원화 100만원은" + d1+ " $ 입니다");
		
		double d4 = c.tokwr(100);
		double d3 = Double.parseDouble(String.format("%.2f", d4));
		System.out.println("100달러는 "+ d3 + "원 입니다.");
		
		
		
	}//1377.30

}
