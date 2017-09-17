package ex3;

public class Land {
	public static void main(String[] args) {
		Village.setWaterAmount(200);
		int leftWater=Village.waterAmount;
		System.out.println("水井中有"+leftWater+"升水");
		Village a=new Village("赵庄");
		Village b=new Village("马家庄");
		a.setPeople(80);
		b.setPeople(120);
		a.drinkWater(50);
		leftWater=b.lookWater();
		String name=b.name;
		System.out.println(name+"发现井中有"+leftWater+"升水");
		b.drinkWater(100);
		leftWater=a.lookWater();
		System.out.println(a.name+"发现井中有"+leftWater+"升水");
		System.out.println("赵庄的人口"+a.peopleNumber);
		System.out.println("马家庄的人口"+b.peopleNumber);
	}
}
