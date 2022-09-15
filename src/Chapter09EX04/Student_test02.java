package Chapter09EX04;

class Student02{
	
	//필드의 접근 제어자 : default로 구성됨: -- 외부 클래스에서 객체를 생성후 직접 수정이 가능함.
	static int serialnum = 1000;
	int StudentID;         // 학생 공유 ID
	String StudentName;    // 학생 이름
	int grade;             // 학년  기본값 4학년
	String address;        // 주소  기본값 서울
	
}
class Student03{
	    //필드의 접근 제어자는 보안을 위해서 private으로 선언 할 수 있다.
	    // --setter
	
		private static int serialnum = 1000;
		private int StudentID;         // 학생 공유 ID
		private String StudentName;    // 학생 이름
	    private int grade;             // 학년  기본값 4학년
		private String address;        // 주소  기본값 서울
                 int month; ///값 1~12까지만 와야한다
		
		
		
		Student03(){
			serialnum ++;
			StudentID = serialnum;
			grade = 4;
			address = "서울";
		}
		Student03(String studentName){
			this();  //기본 생성자를 다시 호출
			this.StudentName = studentName;
			
			
		}
		void print() {
			System.out.println("학생 ID :" + StudentID );
			System.out.println("학생 이름 : "+StudentName);
			System.out.println("학년 : "+ grade);
			System.out.println("학생 주소 : "+address)	;
			System.out.println("월 : "+ month);
			
		}
		
		void setgrade (int grade) { //setter : grade 필드의 값을 할당하는 setter
			
			
		if (grade >= 1 && grade <= 4) {
			 this.grade = grade;
		}else {
			System.out.println("잘못된 값을 입력 햇습니다. 1~4 까지만 입력하세요.");
			return;
		}
		}
		void setmonth(int month) {
			if(month >=1 && month <=12) {
				this.month = month;
			}else {
				System.out.println("잘못된 값을 입력햇습니다.");
				return;
			}
		}
		
		
}



public class Student_test02 {

	public static void main(String[] args) {
		//객체 생성
		Student02 s = new Student02 ();
		
		//default 접근 제어자  :  동일한 패키지에 존재하는 클래스에서 필드의 값을 직접 수정
		s.serialnum = 2000;
		s.StudentID = 100;
		s.StudentName = "홍길동";
		
		//객체 생성
		Student03 s3 = new Student03("홍길동");
//		s3.serialnum = 2000;
//		s3.StudentID = 100;
//		s3.StudentName = "홍길동";

		// 필드의 값을 직접 입력하는 경우는 넣는 값을 제어 할 수 없다.
		
		
		s3.setgrade(3);
		s3.setmonth(11);
		s3.print();
		
		
		
		
	}

}
