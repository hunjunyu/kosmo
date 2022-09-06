package chpter03;

import java.util.Scanner;

public class ㄴㅇㅁㄹㅁㄴㅇㄹㅁㄴㅇㄹㄴㅁㅇㄹ {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("나이를 입력하세요>>>");
		int age = sc.nextInt();
		int prise = 0;
		
		if (age < 8) {
			System.out.println("취학전 아동입니다.");
			prise = 1000;
		}else if (age <14) {
			System.out.println("초등학생입니다.");
			prise = 2000;
		}else if (age < 20) {
			System.out.println("중고등학생입니다.");
			prise = 2500;
		}else {
			System.out.println("일반인입니다.");
			prise = 3000;
		}
		
		System.out.println("입장료는" + prise + "입니다.");
		
		
		
		
		
	}

}
