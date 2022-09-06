package chpter03.ex07;

import java.util.Scanner;

public class 커피집 {

  public static void main(String[] args) {
	
	  //에프레소, 카페라떼 주문할경우 가격이 3,500원
	  //아메리카노를 주문할 경우 : 2,500원
	  //그 외의 메뉴를 출력 할 경우 : 우리 매장에는 없는 메뉴 입니다.
	  
	  //출력 : 주문하신 <에스프레소>는 가격이 <3,500>원 입니다.
	  
	 Scanner sc = new Scanner (System.in);
	 
	 System.out.println("주문하실 커피 메뉴를 골라 주십시요.>>>>>>>>>");
	 
	 String order = sc.next();
	 
	 
	 if (order.equals("아메리카노")) {
		 System.out.println("주문하신 <아메리카노>는 가격이 <2,500>원 입니다.");
	 }else if(order.equals("에스프레소")) {
		 System.out.println("주문하신 <에스프레소>는 가격이 <3,500>원 입니다.");
	 }else if(order.equals("카페라떼")) {
		 System.out.println("주문하신 <카페라떼>는 가격이 <3,500>원 입니다.");
	 }else {
		 System.out.println("주문하신 메뉴는 우리 매장에 없는 메뉴 입니다.");
	 }
	 
	 sc.close();
   }
}
