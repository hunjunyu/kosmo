package chpter02;

public class consoloutput02 {
	public static void main(String[] args) {
		
	//# printf
	// %d : 점수값을 불러 들임	
	// %o : 점수값을 8진수로 불러들임	
	// %x : 점수값을 16진수로 불러들임	
	//  %s : 문자열을 불러들임
	//  %f  : 실수 값을 불러들임	
	// %4.2f : 전체 4자리 소수점이하 2자리 실수 불러들임	
		System.out.printf("%d 살입니다. \n",30);  //30 (10진수)
	    System.out.printf("%o 8진수로 출력 \n", 30);          //36   (8진수)
	    System.out.printf("%x : 16진수로 출력 \n", 30);
	    System.out.printf("%s : 문자열을 불러들임 \n", "화요일 입니다.");
	    System.out.printf("%f  : 실수값을 불러들임 \n", 5.8);
	    System.out.printf("%4.2f : 실수 불러들임 \n", 5.8);
	    
	    System.out.printf("당신의 나이는 %d이고, 몸무게는 %f 입니다 \n", 35,70.5);
	    System.out.printf("%d, %f, %s \n ", 30, 20.55, "오늘");
	}

}
