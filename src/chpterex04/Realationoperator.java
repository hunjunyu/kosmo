package chpterex04;

public class Realationoperator {

	public static void main(String[] args) {
		//크기비교 : true, false로 값을 반환
		System.out.println(5<2);
		System.out.println(5>2);
		System.out.println(5<5);
		
		System.out.println(5>5);
		System.out.println(5>=5);
		System.out.println(5<=5);
		
		
		//등가비교 : 
		// == : 같을때, ! = : 같지 않을때
		int a = 5;
		int b = 2;
		int c = 5;
		System.out.println(a==b);  //false
     	System.out.println(a==c);    //true
     	System.out.println(a!=b);   //true
		System.out.println("=================================================");
		
		//참조 자료형일때 등가비교, (객체의 참조주소를 비교하므로 // false)
		String  str1  = new String("안녕병신아");
		String  str2 = new String("안녕병신아");
		System.out.println(str1 ==str2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
