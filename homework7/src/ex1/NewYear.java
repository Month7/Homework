package ex1;

public class NewYear {
	public static void main(String[] args) {
		MobieShop mobie=new MobieShop();
		mobie.setMobieAmount(30);
		System.out.println("�ֻ�ר����Ŀǰ��"+mobie.getmobieAmount()+"���ֻ�");
		mobie.purchaseMoney1.buyMobie();
		mobie.purchaseMoney2.buyMobie();
		System.out.println("�ֻ�ר����Ŀǰ��"+mobie.getmobieAmount()+"���ֻ�");
	}
}
