package chpter02EX06;

public class Prinmaydatatype01 {
       public static void main(String[] args) {
    	   
    	   // byte < short< int < long < float< double
    	   
    	   // 업캐스팅 : 자동으로 적용, 작은 데이터 타입에서 큰 데이터 타입으로의 변환
    	   // 다운캐스팅 : 수동으로 적용, 큰 데이터 타입에서 작은 데이터 타입으로의 변환
    	   
    	   //자바에서 = 왼쪽과 오른쪽은 반드시 데이터 타입이 같아야 한다.
    	      //byte, short는 예외로 적용됨, 
    	   
    	   int a = 10;
    	   float b = 10.11f ;
    	   
    	   float c = a + b;   //정수 a는 자동으로 float 으로 업캐스팅 됨.
    	   System.out.println(c);
    	   
    	   
    	   //int d = a + (int)b;    //오류발생
    	   int d = a + (int)b;
    	   System.out.println(d);
    	  
    	   
    	   
    	   //boolean : ture / false
    	   boolean bool1 = true;
    	   boolean bool2 = false;
    	   System.out.println(bool1);
    	   System.out.println(bool2);
    	   
    	   //정수 : byte, short, int, long
    	   //기본 값은  int 값으로 정의
    	   //
    	   
    	   
    	   
    	   byte value1 = 10;
    	   short value2 = -10;
    	   int value3 = 100;
    	   long value4 = -100L;  //int 값이 long 데이터 타입으로 업캐스팅 되어서 들어감
    	    System.out.println("통장잔고"+(value1 + value2 +value3 +value4) +"원" );
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
          }
       }
