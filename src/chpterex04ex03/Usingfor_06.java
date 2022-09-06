package chpterex04ex03;

public class Usingfor_06 {

	public static void main(String[] args) {
		//for 문에서 무한 루프 
		/*for (int i = 0; ; i++ ) {
			System.out.println(i);  //무한 루프
			System.out.println("");
		   
			
		}
		System.out.println("문자열 출력"); //도달할 수 없는 코드;;
		*/
		
		//무한 루프를 탈출 하는 방법 : break ; 사용.
		//break는 if 문 내에 break;
		for (int i = 0; ; i++ ) {
			System.out.println(i);  //무한 루프
			
			if(i==100) break;
		}
		System.out.println("문자열 출력"); //도달할 수 없는 코드;;
		
		//w

		
	}

}
