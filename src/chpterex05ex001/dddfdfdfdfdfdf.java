package chpterex05ex001;

import java.util.Arrays;

public class dddfdfdfdfdfdf {

	public static void main(String[] args) {
		
		int []a = new int [500/3];
		int count = 0;
		for (int i =0,j=3; i<a.length;i++,j+=3) {
			if(j <= 500) {
				a[i] = j;
				
			}
		}
		System.out.println(a[0]);
		System.out.println();
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		for(int k : a) {
			System.out.print(k+"\t");
		}
		System.out.println();
		System.out.println();
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]);
			System.out.print("\t");
		}
		
		
		
	}

}
