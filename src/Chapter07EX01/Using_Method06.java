package Chapter07EX01;

import java.util.Arrays;

public class Using_Method06 {
	
	
	static int add (int [] a ) {
		// 들어온 배열의 모든 값을 더해서 더한 값을 리턴
		int sum = 0;
		for(int i=0 ; i<a.length ; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static int div (int [] a ) {
		// 들어온 배열의 모든 값을 빼서 뺀 값을 리턴
		int div = 7;
		for (int i =0; i<a.length; i ++) {
			if(i==0) { continue; }
			div -= a[i];   // div = div - a[i]
		}
		return div ;
	}
	
	static long mul (int [] a ) {
		// 들어온 배열의 모든 값을 곱해서 곱한 값을 리턴
		long mul =1;      //곱할때는 초기값을 1로 넣어야 한다.
		for (int i =0; i<a.length; i ++) {
			mul *= a[i];  // mul
			
		}
		return mul;
	}
	
	static double avg (int [] a ) {
		// 들어온 배열의 모든 값의 평균값을 리턴
		int sum =0;
	
		for (int i =0; i<a.length; i ++) {
			sum += a[i];

	    }
		double avg = sum/(double)a.length;
		
		return avg;
	}

	public static void main(String[] args) {
		// 1 ~ 100까지 7의 배수만 저장 후 각 메소드 호출
		
		
		int []a = new int [100/7];
		
		for (int i=0, j=7 ; i<a.length ; i++, j+=7) {
			a[i] = j;
		}
		add (a);
		System.out.println("==========================");
		
		
		div (a);

		mul (a);
		
		avg (a );
		
		System.out.println("==========================");
		
		//메소드 호출 : add (a)
		int sum = add(a);
		System.out.println("더한 값 : "+ sum);
		
		//메소드 호출 : div(a)
		int div = div(a);   //변수명과 메소드 명은 같아도 사용법이 다르기때문에 괜찮음.
		System.out.println("뺀 값 : "+ div);
		
		//메소드 호출 : mul (a)      int 범위를 넘는다.  ===> long
		long mul = mul(a);
		System.out.println("곱한값 : "+ mul);  //int : 1760012288
		//int : 1760012288
		//long : 4513787149822699520
		
		//메소드 호출 : avg (arr1)
		double avg = avg(a);
		System.out.println("평균값 : "+ avg);
		
		
		

		
	}

}
