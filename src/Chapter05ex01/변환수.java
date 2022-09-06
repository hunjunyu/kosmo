package Chapter05ex01;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;
import javax.swing.text.html.HTMLEditorKit.Parser;

public class 변환수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int value3 = 3;
		System.out.println(true | ++value3>6);
		System.out.println(value3);

		
		//or 연산에서 숏 서킷이 발생되는 예제
		
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++ value8;
		System.out.println(value9);
		
		
		int x = 52;
		double y = 36;
		double bb = x*y /3;
		System.out.println(bb);

		System.out.println(5+ ++ x + y++); //58+36
		
		int abc = 123; // 10진수
		int bcd = 0123; //8진수
		int efg = 0x123; // 16진수
		
	  System.out.println(abc);
		System.out.println(bcd);
		System.out.println(efg);
		
		System.out.println(5626<23);
		String str1 = new String ("안녕");
		String str2 = new String ("안녕");
		System.out.println(str1 + str2);
		System.out.println((5<=2)||(7>2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
