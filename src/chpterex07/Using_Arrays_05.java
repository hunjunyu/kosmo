package chpterex07;

import java.util.Arrays;

public class Using_Arrays_05 {
	public static void main(String[] args) {
		// 1 ~ 500까지 3의 배수를 배열에 저장
		// 출력 : 1. 직접출력 2.for 출력, enhanced for , tostring()
       //  합계 :   평균 :
   
		
		
		int[]a = new int [500/3];
		a[0] = 3;
		
		
		System.out.println("======= 1. 직접 출력 =======");
		System.out.println(a[0]);
		System.out.println();
		
		System.out.println("========2. for 출력======");
		for (int i=0, j=3 ; i<a.length ; i++, j+=3) {
			System.out.print(a[i] = j );
			System.out.print("\t");
			
		}
		System.out.println();
		System.out.println("=======3. Enhanced for 출력=========");
		for(int k : a) {
			System.out.print(k+"\t");
			
		}
		 System.out.println();
	   System.out.println("============4.toString 출력====");
	   System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
