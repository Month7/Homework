package ex1;

public class User {
	public static void main(String[] args) {
		Vehicle car1=new Vehicle();
		Vehicle car2=new Vehicle();
		car1.setPower(128);
		car2.setPower(76);
		car1.speed=80.0;
		car2.speed=100.0;
		System.out.println("car1�Ĺ����ǣ�"+car1.power);
		System.out.println("car2�Ĺ����ǣ�"+car2.power);
		System.out.println("car1Ŀǰ���ٶȣ�"+car1.speed);
		System.out.println("car2Ŀǰ���ٶȣ�"+car2.speed);
		car1.speedDown(10);
		car2.speedDown(20);
		System.out.println("car1Ŀǰ���ٶȣ�"+car1.speed);
		System.out.println("car2Ŀǰ���ٶȣ�"+car2.speed);
	}
}
