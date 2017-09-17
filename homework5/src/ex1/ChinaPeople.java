package ex1;

public class ChinaPeople extends People{
	public void chinaGongfu(){
		System.out.println("坐如钟，站如松，睡入弓");
	}
	public void speakHello(){
		System.out.println("你好");
	}
	public void averageHeight(){
		height=173.0;
		System.out.println("中国人的平均身高"+height+"厘米");
	}
	public void averageWeight(){
		weight=63.0;
		System.out.println("中国人的平均体重="+weight+"千克");
	}
}
