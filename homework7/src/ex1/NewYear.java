package ex1;

public class NewYear {
	public static void main(String[] args) {
		MobieShop mobie=new MobieShop();
		mobie.setMobieAmount(30);
		System.out.println("手机专卖店目前有"+mobie.getmobieAmount()+"部手机");
		mobie.purchaseMoney1.buyMobie();
		mobie.purchaseMoney2.buyMobie();
		System.out.println("手机专卖店目前有"+mobie.getmobieAmount()+"部手机");
	}
}
