package chpterex04ex03;

import java.util.Scanner;

public class 양수값출력 {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 
	 int a = 0; // 양수만 더함
	 int count = 0; // 모든수를 더함
	 int a1 = 0; // 양수를 카운트 하는 변수
	 int count1 = 0;  // 모든 수를 카운트함
	 System.out.println("정수 5개를 입력하세요 (음수,양수)>>");
	 
	 for (int i = 0; i < 5 ; i++) {
		 int n = sc.nextInt();
		 a1 += n;
		 count1 ++;
		 if(n>0) {                //입력 받은 모든 수를 더함
			 a+=n;                 // 모든 수를 카운트
			 count++;     //양수일때 1씩 증가
		 }
	 }
	 System.out.println("양수의 합 : "+ a + "양수의 평균 : "+ a / (double)count);
     System.out.println("모든 수의 합 : " + a1 + " 모든 수의 평균" + a1 / (double)count1);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
