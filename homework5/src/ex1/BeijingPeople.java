package ex1;

public class BeijingPeople extends ChinaPeople{
	public void beijingOpera(){
		System.out.println("花脸、青衣、花旦和老生");
	}
//	public void speakHello(){
//		System.out.println("你好");
//	}
	public void averageHeight(){
		height=172.5;
		System.out.println("北京人的平均身高"+height+"厘米");
	}
	public void averageWeight(){
		weight=70.0;
		System.out.println("北京人的平均体重="+weight+"千克");
	}
}
