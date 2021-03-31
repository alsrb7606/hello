

public class CarTest {

	public static void main(String[] args) {
		
		
		Car truck = new Car();
		truck.setSpeed();
		truck.getSpeed();
		truck.getColor();
		
		//메소드 오버로딩
		truck.loadCarrier(true);
		truck.loadCarrier(true, false);
		//static 메소드 사용
		System.out.println("챠량의 고유색깔은"+truck.color);
		
	}

}
