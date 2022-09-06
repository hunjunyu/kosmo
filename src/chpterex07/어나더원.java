package chpterex07;

import java.util.Scanner;

public class 어나더원 {
	public static void main(String[] args) {
		//"그만" 할때 까지 정수값을 넣어서 합계와 평균 출력
		// 문자열을 정수로 변환
		// 1. String s = sc.nextline(); 인풋 받는다.
		// 2. s.splite(" ") ; <== 공백을 기준으로 잘라서 배열에 저장
		// 3. 문자형 String을 정수형으로 변환 , Inter.PerseInt()
		// 4. 전체 합계와 평균을 구하면 됩니다.
		
		Scanner sc = new Scanner (System.in);
		
		int a = 0; //정수값
		int b = 0; // 정수 합계
		int c = 0; // 카운터수
		
		String  s;
		do { 
			System.out.println("정수를 넣어주세요");
			s = sc.nextLine();
			if (s.equals("그만")) {break;}
		    String[] arr = s.split(" ");
			for(int i = 0; i<arr.length; i++) {
				a = Integer.parseInt(arr[i]);
				b+=a;
				c++;
				
				
			}
			System.out.println("정수의 합 : " + b);
			System.out.println("정수의 평균 : " + b/(double)c);
			
		
		
		
		}while (true);
		System.out.println("종료");
		
	}

}
