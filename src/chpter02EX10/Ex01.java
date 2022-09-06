package chpter02EX10;

public class Ex01 {
	public static void main(String[] args) {
		
		//각 변수의 평균값을 계산 하세요.
		
		int aa = 80;
		int bb = 90;
		int cc = 100;
		double dd= 75.5;
		double ee = 60.3;
		
		int arv = ( aa+bb+cc )/3;
		double arvb = (dd +ee)/2;
		
		int ag = (int) (aa + bb + cc + dd + ee) / 5;
		double agg = (aa + bb + cc + dd + ee) / 5;
		
		System.out.println("각 과목의 평균 값은 : ");
		System.out.printf("");
		
		System.out.println("각 과목의 평균 값은 : "+(aa + bb + cc + dd + ee)/5);
		System.out.printf("각 과목의 평균 값은 : %4.2f", agg);
		
		
		
		
		
		
		
		
	}

}
