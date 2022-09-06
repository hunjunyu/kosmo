package chpterex04ex03;

import java.util.Scanner;

public class anotherproblem {

	public static void main(String[] args) {
		/*문제 1.
		 *  Scanner로 "gold"를 넣으면 "금메달"입니다 를 출력
		   Scanner로 "silver"를 넣으면 "은메달"입니다 를 출력
		   Scanner로 "bronze"를 넣으면 "동메달"입니다 를 출력
		그외는 "메달이 없습니다"
		
		
		/2. 문제 
		 * 스캐너로 월을 인풋 받아서 해달월의 총 날짜를 찍어준다.
		 * 0월은 00일까지 있습니다.
		 * <월은> <몇일> 까지 있습니다.
         */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메달을 입력해 주세요.");
		
		String medal = sc.next();
		
		switch (medal) {
		case "Gold" : 
			System.out.println("금메달 입니다.");
			break;
		case "Silver" : 
			System.out.println("은메달 입니다.");
			break;
		case "Bronze" : 
			System.out.println("동메달 입니다.");
			break;
		default : 
			System.out.println("메달이 없습니다.");
		}
	
		System.out.println("==================================");
		
		
		System.out.println("월을 입력해주십시요.");
		
		String month = sc.next();
		int day = 0;

		switch (month) {
		     case "1월" : case "3월": case "5월" : case "7월" : case "8월" : case "10월" : case "12월" :
		    	 day = 31;
		    	 break;
		     case "2월" : 
		    	 day = 28;
		    	 break;
		     case "4월" :  case "6월" :  case "9월" :  case "11월" :
		    	 day = 30;
		    	 break;
		     default :
		    	 System.out.println("그딴 월은 없습니다. 나가뒤지십쇼.");
		}
		
		     System.out.printf("%s는(은) %d일이 있습니다.", month, day);
		     
		      
		
	}
}
