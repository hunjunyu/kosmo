package chpterex04ex05;

public class Using_while_03 {

	public static void main(String[] args) {
		// break ; <== 해당 구문({)을 탈출할 때 사용, if 조건과 같이 사용.
		// - 1단계만 탈출
		// for, while, do while (반복문)을 탈출할때 사용.
		
		// #1. 단일LOOP에서 탈출
		for (int i = 0; i <10; i++) {
			System.out.println(i);
			break;                //한단계 탈출
		}
		System.out.println("===================================");
		
		
		//break 는 for, while, do while 내에서 if 조건문과 같이 사용.
		for (int i = 0; i <10; i++) {
			System.out.println(i);
			if(i==5) break;                // i 가 5일때 탈출
		}
		
		//2. 다중 loop 문에서 break 사용
		//  case 1 : 하나의 loop문만 탈출
		System.out.println("====================");
		for (int a = 0; a <5;a ++ ) {  // 0~4 : 5번 loop 
			for (int b = 0; b <5; b++) {  // 0~4 : 5번 loop 
			if (b==2) {break;}                               //하나의 for문만 빠져나감
				System.out.println(a+","+b);
			}
		}
		
		
		System.out.println("===========================");
		// case 2. 한꺼번에 탈출 (바깥쪽 for 문의 변수의 값을 조건이 false가 나도록 증가시켜서
		System.out.println("====================");
		for (int a = 0; a <5;a ++ ) {  // 0~4 : 5번 loop 
			for (int b = 0; b <5; b++) {  // 0~4 : 5번 loop 
			if (b==2) {
			     a=100;   // 바깥쪽 for 문의 변수값을 증가시켜서 한꺼번에 탈출	
			break;}                               //하나의 for문만 빠져나감
				System.out.print(a+","+b+ "\t");
			}
		   System.out.println();
		}
		System.out.println("========이중for문 탈출 (label)============");
		//case 2-1. 한꺼번에 탈출 (lable를 사용해서 탈출)
		jump : for (int a = 0; a <5;a ++ ) {  // 0~4 : 5번 loop 
			for (int b = 0; b <5; b++) {  // 0~4 : 5번 loop 
			if (b==2) {
			       
			break jump; }                               //하나의 for문만 빠져나감
	       System.out.print(a+","+b+ "\t");
			}
		   System.out.println();
		}
		
		
		
		
		
		
		

	}

}
