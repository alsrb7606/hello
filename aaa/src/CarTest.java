

public class CarTest {

	public static void main(String[] args) {
		
		
		Car truck = new Car();
		truck.setSpeed();
		truck.getSpeed();
		truck.getColor();
		
		//�޼ҵ� �����ε�
		truck.loadCarrier(true);
		truck.loadCarrier(true, false);
		//static �޼ҵ� ���
		System.out.println("í���� ����������"+truck.color);
		
	}

}
