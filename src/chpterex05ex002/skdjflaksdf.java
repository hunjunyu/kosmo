package chpterex05ex002;

import java.util.Arrays;

public class skdjflaksdf {

	public static void main(String[] args) {
		// 
		String [] [] arr1 = new String [][] {{"홍길동","이순신","세종대왕"},
			{"독수리", "부엉이", "닭", "오리"},{"붕어", "가물치", "잉어"},
			{"호랑이", "사자"}};
		
			//출력 : 사람이름 : 홍길동, 이순신, 세종대왕
			// 새 이름 : 독수리, 부엉이, 닭, 오리
			//물고기이름 : 붕어, 가물치, 잉어
			//포유류 이름 : 호랑이, 사자
			String [] arr2 = new String [] {"사람 이름 : ", "새 이름 : ", "물고기 이름 : ", "포유류 이름 : "};
			int c = 0;
			//1. for문으로 출력
			System.out.println("====for문으로 출력====");
			for (int a=0;a<arr1.length;a++) {
				System.out.print(arr2 [a]);
				for(int b=0; b<arr1[a].length;b++) {
					
					System.out.print( arr1[a][b]+ " ");
					
					}System.out.println();
						
				}
			
			
			//2. Enhanced for문 출력
			System.out.println("=====Enhanced For문으로 출력====");
			for(String a[] : arr1) {
				System.out.print(arr2[c]);
				c++;
				for(String b : a) {

					System.out.print(b + " ");
				}
				System.out.println();
			}

			
			//3. Arrays.toString() 출력
		    System.out.println("====Arrays.toStirng으로 출력====");
		    for(int a =0; a<arr1.length;a++) {
		    	System.out.print(arr2 [a]);
            System.out.println(Arrays.toString(arr1[a]));
		    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
