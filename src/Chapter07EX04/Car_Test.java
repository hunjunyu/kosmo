package Chapter07EX04;

class Car {
	
	// 1. 필드
	String company; // 제조회사
	String model;   // 자동차 모델
	String color;   // 자동차 색깔
	double maxSpeed; // 자동차 최대 출력
     
	// 2. 생성자
	Car(){}
	Car (String company,String model,String color,double maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 3. 메소드 show() : 필드의 값을 출력
	void show () {
		System.out.println(company+ ", "+model + ", "+color +", "+  maxSpeed );
	}
	
	// 4. 메소드 getter/setter
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}

public class Car_Test {

	public static void main(String[] args) {
		// 객체 생성
		// car 1  현대자동차 그랜져 <=====필드의 값을 직접 입력/출력
		Car car1 = new Car();
		car1.company = "현대 자동차";
		car1.model = "그랜져";
		car1.color = "검정색";
		car1.maxSpeed = 230;
	
		System.out.print(car1.company + " ");
		System.out.print(car1.model+ " ");
		System.out.print(car1.color+ " ");
		System.out.print(car1.maxSpeed+ " ");
		System.out.println();
		
		// car 2 쌍용자동차 체어맨 < ===생성자를 통해 값입력 /show 값 출력
		Car car2 = new Car("쌍용 자동차", "체어맨", "검정색",230);
		car2.show();
		
		// car 3 기아자동차 k-9 < == setter를 통해 값 입력, getter를 통해 값 출력.
		Car car3 = new Car();
		car3.setCompany("기아 자동차");
		car3.setModel("K-9");
		car3.setColor("흰색");
		car3.setMaxSpeed(250);
	    car3.show();

	}

}
