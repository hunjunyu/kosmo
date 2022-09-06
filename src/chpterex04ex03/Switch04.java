package chpterex04ex03;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력해주세요>>>>>>>");
		int month = sc.nextInt();
		int day = 0;

		switch (month) {
		     case 1 : case 3: case 5 : case 7 : case 8 : case 10 : case 12 :
		    	 day = 31;
		    	 break;
		     case 2 : 
		    	 day = 28;
		    	 break;
		     case 4 :  case 6 :  case 9 :  case 11 :
		    	 day = 30;
		    	 break;
		     default :
		    	 System.out.println("그딴 월은 없습니다. 나가뒤지십쇼.");
		}
		
		     System.out.printf("%d 달은 %d일까지 있습니다.", month, day );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
