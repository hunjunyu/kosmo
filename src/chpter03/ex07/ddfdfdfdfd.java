package chpter03.ex07;

import java.util.Scanner;

public class ddfdfdfdfd {
	public static void main(String[] args) {
		/*
		 * 스캐너를 나이를 인풋받아서 출력 : 
		 * 나이 (age)가 8세 미만이면 : "취학 전 아동입니다"
		 *                        "입장료는 <1000>원 입니다.
		   나이 (age)가 14세 미만이면 : "초등학생입니다"
		                          "입장료는 <2000>원 입니다.
		    나이가 (age)가 20세 미만이면 : "중고등학생 입니다."
		                           "입장료는<2500>원 입니다."
		    나이가 (age)가 20-세 이상이면 : "일반인 입니다"
		                            "입장료는 <3000>원 입니다."
		 */
		Scanner sc =  new Scanner (System.in);
		System.out.println("나이를 입력해주세요>>>>>");
		System.out.println("====================");
		
		int age = sc.nextInt() ;		
		if (age < 8) {
			System.out.println("취학전 아동입니다. 입장료는 <1000>원입니다.");
		}else if (age >= 8 & age <= 13) {
			System.out.println("초등학생입니다. 입장료는 <2000>원입니다.");
		}else if (age >=14 & age <= 19) {
			System.out.println("중고등학생입니다. 입장료는 <2500>원입니다.");
		}else{
			System.out.println("일반인입니다. 입장료는 <3000>원입니다.");
		}
		
		sc.close ();		
	}

}
