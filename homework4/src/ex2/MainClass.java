package ex2;

public class MainClass {
	public static void main(String[] args) {
		Family a=new Family();
		Family b=new Family();
		TV xTV=new TV();
		TV yTV=new TV();
		xTV.setChannel(5);
		b.buyTV(xTV);
		System.out.println("xTV��Ƶ����"+xTV.getChannel());
		System.out.println("b��ʼ�����ӽ�Ŀ");
		b.seeTV();
		int m=2;
		a.buyTV(yTV);
		a.remoteControl(m);
		System.out.println("a�����Ӹ�����"+m+"Ƶ��");
		System.out.println("yTV��Ƶ����"+yTV.getChannel());
		System.out.println("a�ڿ����ӽ�Ŀ");
		a.seeTV();
	}
	
}
