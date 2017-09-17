package ex2;

public class Check {
	public static void main(String[] args) {
		Machine machine=new Machine();
		String name[]={"苹果","炸药","西服","硫酸","手表","硫磺"};
		Goods []goods=new Goods[name.length];
		for(int i=0;i<name.length;i++){
			goods[i]=new Goods();
			if(i%2==0){
				goods[i].setIsDanger(false);
				goods[i].setName(name[i]);
			}
			else{
				goods[i].setIsDanger(true);
				goods[i].setName(name[i]);
			}
		}
		for(int i=0;i<name.length;i++){
			try{machine.checkBag(goods[i]);
			System.out.println(name[i]+"检查通过");
			}
			catch(DangerException e){
				e.toShow();
				System.out.println(name[i]+"禁止通过");
			}
		}
	}
}
