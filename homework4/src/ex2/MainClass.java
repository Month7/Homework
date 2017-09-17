package ex2;

public class MainClass {
	public static void main(String[] args) {
		Family a=new Family();
		Family b=new Family();
		TV xTV=new TV();
		TV yTV=new TV();
		xTV.setChannel(5);
		b.buyTV(xTV);
		System.out.println("xTV的频道是"+xTV.getChannel());
		System.out.println("b开始看电视节目");
		b.seeTV();
		int m=2;
		a.buyTV(yTV);
		a.remoteControl(m);
		System.out.println("a将电视更换到"+m+"频道");
		System.out.println("yTV的频道是"+yTV.getChannel());
		System.out.println("a在看电视节目");
		a.seeTV();
	}
	
}
