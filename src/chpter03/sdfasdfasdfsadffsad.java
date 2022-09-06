package chpter03;

import java.util.Scanner;

public class sdfasdfasdfsadffsad {
	public static void main(String[] args) {
		//점수(score)와 학년(year)을 인풋 받아서 60점이상이면 합격, 미만이면 불학격
		//4학년인 경우 70점 이상이면 합격, 중첩 if 문사용 (if내에if문)
		
	 Scanner sc = new Scanner(System.in); 
	 
	 System.out.println("점수와 학년을 입력하세요. >>>");
			 
	int score, year;
	 
	score = sc.nextInt();
	year = sc.nextInt();
	 
	
	if (score >= 60 && year <= 3) {
		System.out.println("합격");
	} else if (score >= 70 && year >= 4) {
			System.out.println("합격");
	}else {
		System.out.println("불합격");
	}
	
	 
	 
		
		
		
		
	}

}
