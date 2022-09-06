package chpterex04ex05;

public class Using_while01 {

	public static void main(String[] args) {
		//while (조건) {
		//     실행문;
		//}
		
		// while : 반복횟수를 알수 없는 경우 사용
		// for : 반복 횟수를 알수 있는 경우 사용.
		
		//   -- 초기값 선언을 반드시 while 밖에서 선언을 해야한다. 
	    //     <while 문 내에서 선언시 무한루프>
		//  --  증가값은 while 내에서 선언을 해야한다. <증가값을 선언하지 않으면 무한 루프>
		
		

		// 1. while 문에서 반복 횟수가 0 인 경우
		System.out.println("=============반복 횟수 0===============");
		int a = 0;  // 변수의 초기값은 while문 밖에서 선언.
		while (a<0) {   //false 
			System.out.println(a+ " ");  //조건이 true일때만 실행!
		}
		
		//2. while 문에서 반복 횟수가 1번인 경우
		System.out.println("===============반복 횟수 break================");
		a=0;
		while (a==0) {
			System.out.println(a + " ");
			System.out.println();
			break;
		}
		
		System.out.println("===============반복 횟수 1 (증가값을 사용)================");
		a=0;
		while (a==0) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();      // Enter
		System.out.println("===============반복 횟수 10====================");
		a = 0;      //초기값 : while  밖에서 선언
		while (a<10) {
			System.out.print(a +" ");
			a ++;                       // while 문 안에는 증가값을 넣거나 break를 넣어서 무한 루프가 안되게 막아줘야 한다.
		}
		
		System.out.println();
		System.out.println("============초기값을 while 문 내에 넣는 경우 : <무한 루프> ==============");
		
		
	

		
		while  (a < 10 ) {
			a = 0;                    //초기화 값을  while문 내에서 선언하면 
			System.out.print(a +" ");
			a ++;                       // while 문 안에는 증가값을 넣거나 break를 넣어서 무한 루프가 안되게 막아줘야 한다.
			
		}
		
		// while 문은 조건을 생략 할 수 없다.
		// for문은 조건을 생략하면 무한 루프     ex : for (int a =0 ;; a++)
		// while 문에서 무한 루프를 들릴때 조건에 true.
		
		System.out.println();
		System.out.println("=====================");
		a = 0;
		boolean b;
		b = true;
		while (b) {
			System.out.print(a+ " ");
			a++;
			if (a>200) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
