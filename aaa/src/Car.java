

import java.util.*;   //Scanner Ŭ���� ����


public class Car {
	Scanner input = new Scanner(System.in);
	//static���� color ����
	 int speed;
	 boolean onOff;
	static String color;
	boolean isLoad;
	boolean asector;
	boolean bsector;
	//������
	Car() {
		color = "red";
		speed = 30;
		onOff = false;
		isLoad = false;
		asector = false;
		bsector = false;
	}
	
	
	//static �޼ҵ� ����
	public static String getColor() {
		System.out.println("color�� �Է��Ͻÿ�: ");
		Scanner scan = new Scanner(System.in);
		color=scan.nextLine();
		return color;
	}

	
	void getonOff() {
		System.out.println("������ �õ�����=" + this.onOff);
	}
	
//�޼ҵ� �����ε� �� ����ĭ a sector, b sector ���� ����Ȯ��, this.
	void loadCarrier(boolean asector, boolean bsector) {
		this.asector = asector;
		this.bsector = bsector;
		System.out.println("a���� ���� ������"+ this.asector + "b���� ���� ������"+ this.bsector);
	}
	
	
	void loadCarrier(boolean asector) {
		this.asector = asector;
		System.out.println("a���� ���� ������" + this.asector);
	}

	
	void setSpeed() {
		System.out.println("�ڵ����� �ӵ��� �Է��Ͻÿ�: ");
		int speed1 = input.nextInt();
		this.speed = speed1;
	}
	
	
	void getSpeed() {
		System.out.println("���� ���� �ӵ��� : " + this.speed +"�Դϴ�." );
	}
}
