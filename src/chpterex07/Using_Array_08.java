package chpterex07;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array_08 {

	public static void main(String[] args) {
		// 정수 배열 방 10개를 생성하고
		// 임의 의 값을 10개에 방에 저장
		// 그중  최대 값을 뽑아서 출력하는 프로그램 생성해보시오
		// 출력 : 배열 방 10개에서 최대값음 : 000
		// 스캐너로 인풋받아 임의의 정수 10개 등록후
		
		System.out.println("10개의 정수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		
		
		int [] a = new int [10];
		int max = 0;

		for (int b =0; b <a.length; b++) {
			a[b] = sc.nextInt();
			if (max<a[b]) {max=a[b];}
			
		}
	
		System.out.println("최대값 : " + max);
		
      for (int b =0; b <a.length; b++) {
    	  if (a[b]>max) {
    		  max=a[b];
    	  }
      }
      System.out.println("최대값 : " + max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
