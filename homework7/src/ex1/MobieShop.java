package ex1;

public class MobieShop {
	private int mobieAmount;
	InnerPurchaseMoney purchaseMoney1;
	InnerPurchaseMoney purchaseMoney2;
	public MobieShop(){
		purchaseMoney1=new InnerPurchaseMoney(20000);
		purchaseMoney2=new InnerPurchaseMoney(10000);
	}
	public void setMobieAmount(int mobieAmount){
		this.mobieAmount=mobieAmount;
	}
	public int getmobieAmount(){
		return mobieAmount;
	}
	class InnerPurchaseMoney{
		int moneyValue;
		public InnerPurchaseMoney(int moneyValue){
			this.moneyValue=moneyValue;
		}
		public void buyMobie(){
			if(moneyValue>=20000){
				mobieAmount-=6;
				System.out.println("��20000���ڲ�����ȯ����6���ֻ�");
			}
			else if(moneyValue>=10000&&mobieAmount<20000){
				mobieAmount-=3;
				System.out.println("��10000���ڲ�����ȯ����3���ֻ�");
			}
		}
	}
}
