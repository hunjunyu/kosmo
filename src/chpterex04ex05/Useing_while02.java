package chpterex04ex05;

import java.util.Scanner;

public class Useing_while02 {

	public static void main(String[] args) {
		// 스캐너를 사용해서 -1이 될때까지 정수값을 넣어서 평균을 계산하세요
		Scanner sc = new  Scanner (System.in);
		int count = 0; //정수가 입력 되는 갯수를 카운트함. <평균>
		int sum = 0;    //입력 받는 정수를 모두 더한 값
		
		System.out.println("원하는 정수를 입력하세요. 마지막에 -1로 종료를 해주세요");
		int n = sc.nextInt();    //콘솔에서 정수값을 입력 받아 n 변수에 할당.
		
		
		// 반복 횟수를 알 수 없는 경우 : while 
		while (n != -1) {  //입력받은 정수 값이 -1이 아니면 while 문을 실행
			sum += n;    // sum = sum + n;
			count ++;   //실행할때마다 정수값을 count함.
			n = sc.nextInt();    // -1이 정수 값으로 인풋이 되면 루프를 빠져나옴.		
		}
		if (count == 0) { //제일 처음에 정수값을 -1
			 System.out.println( "입력된 정수가 없습니다.");
			
		}else { //정수값을 하나 이상 넣은 경우
			System.out.println("입력된 정수는 " + count + " 개입니다.");
			System.out.println("입력된 정수의 합은 : " + sum + " 입니다.");
			System.out.println("평균은 : "+ sum / (double)count);
			
		}
		

		
		
		
		
		
		
		
		
		
		
	}

}
