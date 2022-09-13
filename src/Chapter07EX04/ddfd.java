package Chapter07EX04;

import java.util.Scanner;

class ddfd{
	
	double rate;
	
	double tokwr(double dollor) {
		return dollor *rate;
		
	}
	double todollor(double won) {
		return won/rate;
	}
	void setrate(double rate) {
		this.rate = rate;
		
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
}

public class ddfd {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("1달러에 대한 오늘 환률을 입력하세요");
		double rate = sc.nextDouble();
		rate = 1377.30;
		
		ddfd c = new ddfd();
		
		//스캐너로 받은 rate 변수의 값을 setter주입
		c.setrate(rate);
		
	}

}
