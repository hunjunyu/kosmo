package chpterex04ex03;

import java.util.Scanner;

public class ㅁㄴㅇㄹㄹㄴㅁㅇ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하실 커피 메뉴를 입력해주세요.");
		
		String order = sc.next();
		int price = 0;
		
		switch (order) {
		case "에스프레소" : case "카페라떼" : case " 아포가토":
			price = 3500;
			break;
		case "아메리카노" :
			price = 2500;
			break;
		default :
			System.out.println("우리매장에는 없는 메뉴입니다.");

		}
		
		System.out.printf("주문하신 커피는 %s 이고, 가격은 %d입니다.", order, price);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
