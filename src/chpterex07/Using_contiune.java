package chpterex07;

public class Using_contiune {

	public static void main(String[] args) {
		//continue : continue를 만나면 continue 아래의 코드를 실행하지 않고 반복
		// - if 문과 같이 사용함.
		
		//단일 loop에서 continue
		for(int i = 0; i <10;i++) { // 0~9 : 10번
			System.out.println("A");
		continue;                  //구문을 빠져나가지 않고 반복된다.
			//System.out.println("B");  // 도달할 수 없는 코드
		}

		for(int i = 0; i <10;i++) { // 0~9 : 10번
			System.out.println("A");
		if(i%2==0)	{continue;} // i = 0, 2, 4, 6, 8, 
			System.out.println("B");
		}

		System.out.println("============================");
		for (int i = 0; i<10 ; i++) {
			if(i ==5|| i ==7) {continue; }
			System.out.print(i + " " );
			
		}
	
		System.out.println();
		System.out.println("============================");
		//1.for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		// 3의 배수만 출력 하세요.
		
		for (int a = 1; a <1001;a++ ) {
			if(a%3!=0) {continue;}
			System.out.print(a+" " );
			
		}
		    System.out.println();

		//2.for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
	    // 5의 배수만 출력 하세요.
		
		for (int b =1; b <1001;b++ ) {
			if(b%5!=0)  {continue;}  //5의 배수가 아닌것은 continue로 올려버림
			System.out.print(b + " ");
		}
			System.out.println();
			
		//3.for 문을 사용해서 1에서 1000까지 1씩 증가하고 if를 사용해서
	    // 3,5,7의 배수만 출력 하세요.
			
			for (int a =1; a <1001;a++ ) {
				if(a%3==0|| a%5==0||a%7==0) {
				
				System.out.print(a + " ");
			   }	
			}	
			
			
			
			System.out.println();
			System.out.println("==============================");

			
			
			
			
			System.out.println();
			//2. 다중 loop에서 continue
			for (int l= 0; l< 5 ; l++) {  // 5번
				for(int k = 0 ; k < 5; k++) {  //5번
					if(k==3) {continue;}
		           System.out.println( l +" , "+ k );
				}
			}
	 
			System.out.println();
			System.out.println("==============================");
	
			out:for (int l= 0; l< 5 ; l++) {  // 5번
				for(int k = 0 ; k < 5; k++) {  //5번
					if(k==3) {continue out;}
		           System.out.println( l +" , "+ k );
	  
				}
			}
	 
			System.out.println();
			System.out.println("==============================");
	
	
			out:for (int l= 0; l< 5 ; l++) {  // 5번
				for(int k = 0 ; k < 5; k++) {  //5번
					if(k==3) {
						l=100;    //바깥쪽에있는 for 문의 변수값을 증대시켜서 false빠져나옴.
						continue out;}
		           System.out.println( l +" , "+ k );
				}
			}
			
	
	
	
	
	
	
	
	
	
	
	}
}

