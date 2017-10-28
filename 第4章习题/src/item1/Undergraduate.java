package item1;

public class Undergraduate extends Student{
	String major;
	public Undergraduate(String name, int age,String major) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.major=major;
	}
	public void show(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(major);
	}
}
