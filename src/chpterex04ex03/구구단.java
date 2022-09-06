package chpterex04ex03;

public class 구구단 {

	public static void main(String[] args) {
		//이중 for 문을 사용해서 1단~9단까지 출력.
		/*   /n : enter, /t : tab
		 *   1*1+=1 	1*2=2	1*3=3	.....1*9=9
		 *   2*1 = 2	2*2=2	2*3=6	......2*9=18
		 *   ..........................
		 *  9*1= 9	
		 */
		for(int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b ++) {
				System.out.print(a + " * " + b + " = " + (a*b) + "\t");
			}
			
			System.out.println();
			
			 }
	}
	
}
