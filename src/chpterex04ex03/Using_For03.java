package chpterex04ex03;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
		//  정수, (음수 , 양수) 을 스캐너로 5개 인풋 받아서 
		// 양수만 더한 값을 출력하세요.
		// for 문내에 if문을 사용
		// 양수만 더한값과 평균값.
		
		Scanner sc = new Scanner(System.in);
	   int f;
       int bb = 0;
	   int cc;
	   
		for ( f = 1; f <= 5;  f +=1) {
			System.out.println("양수를 입력하세요.");
			int a = sc.nextInt();
		if(a>=0) {
		         bb += a;
		} System.out.println(bb/f);
		
	}
		System.out.println("더한 값은 :" +bb);
		System.out.println("평균값은 :"+ (bb/f));
		
		
	}

}
