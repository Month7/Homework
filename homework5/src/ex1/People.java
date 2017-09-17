package ex1;

public class People {
	protected double height;
	protected double weight;
	public void speakHello(){
		System.out.println("hello");
	}
	public void averageHeight(){
		height=173.0;
		System.out.println("average height="+height);
	}
	public void averageWeight(){
		weight=63.0;
		System.out.println("average weight="+weight);
	}
}
