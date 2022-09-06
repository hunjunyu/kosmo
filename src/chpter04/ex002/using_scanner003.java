package chpter04.ex002;

import java.util.Scanner;

public class using_scanner003 {

	public static void main(String[] args) {
	 // 문제 : Scanner로 정수값을 인풋 받아서
		//국어(aa), 영어(bb), 수학(cc), 과학(dd),음악(ee) 점수를 인풋 받습니다.
		// if 문을 사용해서 평균이 90점 이상이면 " A 학점", 80점이상 : "B학점" , 70점이상 : "C학점", 60점이상 : "D학점" 
		// 나머지 : "F학점"
		
		Scanner sc = new Scanner (System.in);
		
		 System.out.println("국어 영어 수학 과학 음악 점수를 대입하세요>>>>>>>>");
		 
		
		int aa,bb,cc,dd,ee;
		
		 aa = sc.nextInt();
		 bb = sc.nextInt();
		 cc = sc.nextInt();
		 dd = sc.nextInt();
		 ee = sc.nextInt();
		
		
		
		 
		double avg = (aa+bb+cc+dd+ee)/5;
		
		if (avg >= 90) 
		{
			          System.out.println("A 학점입니다.:"+avg);
			
		}
		else if (avg >= 80) 
		                 { System.out.println("B 학점입니다."+avg);
	    }
		else if (avg >= 70) 
		                     {System.out.println("C학점입니다."+avg);
	    }
		else if (avg >= 60)
		                   {System.out.println("D학점입니다."+avg);
		}
		else  {System.out.println("F학점입니다"+avg);}
		
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
