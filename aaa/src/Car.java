

import java.util.*;   //Scanner 클래스 포함


public class Car {
	Scanner input = new Scanner(System.in);
	//static변수 color 선언
	 int speed;
	 boolean onOff;
	static String color;
	boolean isLoad;
	boolean asector;
	boolean bsector;
	//생성자
	Car() {
		color = "red";
		speed = 30;
		onOff = false;
		isLoad = false;
		asector = false;
		bsector = false;
	}
	
	
	//static 메소드 선언
	public static String getColor() {
		System.out.println("color를 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		color=scan.nextLine();
		return color;
	}

	
	void getonOff() {
		System.out.println("차량의 시동유무=" + this.onOff);
	}
	
//메소드 오버로딩 짐 수하칸 a sector, b sector 짐의 유무확인, this.
	void loadCarrier(boolean asector, boolean bsector) {
		this.asector = asector;
		this.bsector = bsector;
		System.out.println("a섹터 짐의 유무는"+ this.asector + "b섹터 짐의 유무는"+ this.bsector);
	}
	
	
	void loadCarrier(boolean asector) {
		this.asector = asector;
		System.out.println("a섹터 짐의 유무는" + this.asector);
	}

	
	void setSpeed() {
		System.out.println("자동차의 속도를 입력하시오: ");
		int speed1 = input.nextInt();
		this.speed = speed1;
	}
	
	
	void getSpeed() {
		System.out.println("지금 차의 속도는 : " + this.speed +"입니다." );
	}
}
