package ex3;

public class Land {
	public static void main(String[] args) {
		Village.setWaterAmount(200);
		int leftWater=Village.waterAmount;
		System.out.println("ˮ������"+leftWater+"��ˮ");
		Village a=new Village("��ׯ");
		Village b=new Village("���ׯ");
		a.setPeople(80);
		b.setPeople(120);
		a.drinkWater(50);
		leftWater=b.lookWater();
		String name=b.name;
		System.out.println(name+"���־�����"+leftWater+"��ˮ");
		b.drinkWater(100);
		leftWater=a.lookWater();
		System.out.println(a.name+"���־�����"+leftWater+"��ˮ");
		System.out.println("��ׯ���˿�"+a.peopleNumber);
		System.out.println("���ׯ���˿�"+b.peopleNumber);
	}
}
