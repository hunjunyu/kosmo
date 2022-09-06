package chpterex07;

import java.util.Arrays;

public class Arrays00002 {
	public static void main(String[] args) {
		//한국을 빛낸 5명의 위인들만 s String  배열에 저장 후 4가지로 출력
		
		String [] a= new String [5];
		a  [0] = "강감찬";
		a  [1] = "세종대왕";       //Ljava.lang.String;@7637f22
		a  [2] = "이순신";
		a  [3] = "장보고";
		a  [4] = "장영실";
		
		
		System.out.println("======1======");
		for (int b = 0; b< a.length; b++) {
			System.out.print(a[b]+"\t");
		}
		System.out.println();
		System.out.println("======2=====");
		System.out.println(Arrays.toString(a));
		
		System.out.println("=====3======");
		for (int b = 0; b<5 ; b++) {
			System.out.print(a[b]+"\t");
		}
		
		System.out.println();
		System.out.println("==========4=========");
		System.out.print(a[0]+"\t");	
		System.out.print(a[1]+"\t");
		System.out.print(a[2]+"\t");
		System.out.print(a[3]+"\t");
		System.out.print(a[4]+"\t");
		
		for(String k : a) {
			System.out.println(k);
		}
		
		
		
		
		
	}

}
