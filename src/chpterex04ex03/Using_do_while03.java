package chpterex04ex03;

import java.util.Scanner;

public class Using_do_while03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean run = true;
		int un = 0; //스캐너에서 정수를 인풋 받는용.
		
		do {
			System.out.println("===============================================");
			System.out.println("1 19단출력 | 2. 홀수단 출력 | 3. 3의배수단 출력| 4. 종료");
			System.out.println("===============================================");
			System.out.println("원하는 숫자를 출력하세요. >>>");
			un = sc.nextInt();
			if(un == 1 ) {
				//1. 19단출력
				System.out.println("==1. 19단 출력==");
				for (int a = 1; a < 20; a++) {
					for (int b =1; b < 10; b++) {
						System.out.print(a+" * "+b +" = "+ a*b + "\t");
					}
					System.out.println();
				}
			}else if( un == 2) {
				//2. 홀수단 출력
				System.out.println("==2. 홀수단 출력==");
				for (int a = 1;a < 20 ; a+=2) {
					for(int b = 1;b<20; b++) {
						System.out.print(a+" * "+ b + " = " + a*b );
						System.out.print("\t");
					}
					System.out.println();
				}
			}else if ( un == 3) {
				//3. 3의 배수단 출력
				System.out.println("==3. 3의 배수단 출력==");
				 for (int c =1; c <20; c++) {
	        		   for (int d = 1; d <20; d++ ) {    			   
	        		   
	        			   if(c%3==0) {
	        			   System.out.print(c +" * "+ d + " = " + c*d);
	        			   System.out.print("\t");	   
	        		   }
	        		 
	        		  } if (c%3 == 0 ) {System.out.println();}
	        	   }
			}else if ( un == 4 ) {
				break; 
			}
			

			
		  }while (run); {  // 무한 루프
			System.out.println("프로그램 종료");
       }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
