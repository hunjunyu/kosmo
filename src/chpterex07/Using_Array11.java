package chpterex07;

import java.util.Scanner;

public class Using_Array11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//탁구, 야구, 축구, 농구, 씨름
		// 각 운동 종목의 구성원 수를 합과 평균

		String s;
		
		int a = 0; //정수를 담는 변수
		int b = 0; //합계를 출력하는 변수
		int c = 0; //카운트 함수
		do {
			System.out.println("각 종목의 구성원 수를 공백을 이용해서 넣으세요.");
		    s=sc.nextLine();
		    String [] d = s.split(" "); 
		    for(int i=0;i<d.length;i++) {
		    	if (i %2 != 0) {
		    	a = Integer.parseInt(d[i]);
		    	b+=a;  // 합  
		    	c++;   // 카운트
		    	
		    	}
		    	
		    }
		    System.out.println("구성원의 합 : " + b);
			System.out.println("구성원의 평균 : " + b/(double)c);
			if(s.equals("그만")) {
				break;
			}
			
			
	    }while(true);
		System.out.println("프로그램 종료");
	
	
	
	}
		 

}


