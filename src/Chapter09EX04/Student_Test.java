package Chapter09EX04;

class Student{
	
	static int serialnum = 1000;
	int StudentID;         // 학생 공유 ID
	String StudentName;    // 학생 이름
	int grade;             // 학년  기본값 4학년
	String address;        // 주소  기본값 서울
	
	Student(){
		
		grade = 4;
		address = "서울";
	}
	Student(String StudentName){
		this();
		this.StudentName = StudentName ;
		StudentID = serialnum++;
	}
	Student (String StudentName,int grade){
		this(StudentName);
		this.grade = grade;
		
	}
	Student(String StudentName,int grade,String address){
		this(StudentName,grade);
		this.address = address;

	}
    void print () {
    	System.out.println("학번 : "+ StudentID);
    	System.out.println("학생 이름 : "+ StudentName);
    	System.out.println("학년 : "+ grade);
    	System.out.println("주소: "+ address);
    	System.out.println();
    	
    }
	
	
}

public class Student_Test {

	public static void main(String[] args) {
		// 객체를 생성시 자동으로 학번이 1000번부터 1씩 자동으로 학번이 저장  되어야한다.
		//studentID : 1000부터 학생 객체를 만들때마다 고유한 값으로 적용되어 있어야한다.
		
		
		Student s = new Student ("이정원");
		s.print();
		
		Student s1 = new Student ("김정원");
		s1.print();
		
		
		
		
		
		
		
		

	}

}
