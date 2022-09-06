package chpterex04ex03;

import java.util.Scanner;

public class fadsadfsadsfasdfasdfasdfasdfasdfsadf {

	public static void main(String[] args) {
		
		for (int a = 1; a<19; a++) {
			for (int b =1; b<19; b++) {
				if (a % 3 == 0) {
					System.out.println(a + "*" + b + "=" + a*b);
					System.out.println("\t");
				}
			}
	        if (a%3 ==0) {
	        	System.out.println();
	        }
		
		}
		System.out.println("===================================");
	
        // 스캐너에서 입력 받은 단만 출력 (1~9)단
		//출력할 단을 입력하세요 (1~9단)>>>>>
		//1*1 =1
		//1*2 =2
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("출력할 단을 입력하세요.>>>>>");
		
		int a = sc.nextInt();
		
		for (int  b = 1; b < 10; b++) {
			System.out.println(a+"*"+ b + "=" + a*b);
	
			}
			sc.close();
		}
		
		
		

		
		
		
	}


