package chpterex04ex05;

import java.util.Scanner;

public class Using_dowhile_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		boolean run = true;
		int un = 0;  // 스캐너로 인풋 받는 변수
     
		do {
			System.out.println("=================================");
			System.out.println("1. 문자열출력 | 2. 정수 출력 | 3. 종료 ");
			System.out.println("=================================");
			System.out.println("원하는 번호를 입력 하세요 >>");
			un = sc.nextInt();
			
			if (un == 1 ) {
		        System.out.println("문자열을 출력 합니다. ");
		        System.out.println();
			}else if (un == 2) {
				System.out.println("정수를 출력 합니다.");
				System.out.println();
			}else if (un ==3 ){
				break;   //프로그램 종료.
			}
			
		}while (run);  //무한루프가 작동됨
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		
		
	}

}
