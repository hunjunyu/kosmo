package chpterex07;

import java.util.Arrays;
import java.util.Scanner;

public class asdfasdf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 정수 3개를 입력하세요");
		int a [] = new int [3];
		int c=0;
		
		for (int b= 0; b<a.length; b++) {
			a[b]=sc.nextInt();
			if(c<a[b]) {c=a[b];}
		}
		
		System.out.println("최대값 : "+ c);

		
		System.out.println();
		System.out.println("=======================");
		
		System.out.println(" == 2번째 방법은 Araays.sort() 메소드를 사용해서 출력 ===================");
	    Arrays.sort(a);  /// 배열방의 값을 정렬을 한다. 0 (최소값), 1, 2, 3, ......arr.length -1  최대값
		System.out.println( ("최대값 : " + a[a.length-1]));
		System.out.println("최소값 : "+ a[0]);
		
		
		System.out.println("========String을 사용하는 경우 ========");
		System.out.println("최대값은 : " + Arrays.stream(a).max().getAsInt());
		
		
		
		System.out.println(Arrays.stream(a).max().getAsInt());
		System.out.println(Arrays.stream(a).min().getAsInt());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
