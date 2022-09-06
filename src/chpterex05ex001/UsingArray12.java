package chpterex05ex001;

import java.util.Arrays;

public class UsingArray12 {

	public static void main(String[] args) {
		
		// -1 ~ 1000까지 배열(arr)에 저장 후 
		
		// 1. 배열선언
		
		// 2. 입력 for 문을 사용해서 arr배열 변수에 값을 할당 
		
		// 3. for문을 사용해서 arr 배열변수의 값을 출력
		
		// 4. 향상된 for문 (enhanced for)문을 상요해서 출력
		
		// 5. Arrays.toString(arr)로 출력
		
		int []arr = new int [1000];
		
		for (int a =1; a<arr.length;a++) {
			System.out.print(a+" ");

		}
		System.out.println();
		 int b =1;
		for(int a : arr) {
			a+=b;
			b++;
			System.out.print(a+" ");
		}
		System.out.println();
		for (int a =0; a<arr.length;a++) {
			arr[a] = a+1;
		
		}
		System.out.println(Arrays.toString(arr));
		}
		
		
		
		
		

	}


