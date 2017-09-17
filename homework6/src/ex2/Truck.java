package ex2;

public class Truck {
	ComputerWeight []goods;
	double totalWeight=0;
	public Truck(ComputerWeight []goods){
		this.goods=goods;
	}
	public void setGoods(ComputerWeight []goods){
		this.goods=goods;
	}
	public double getTotalWeight(){
		totalWeight=0;
		for(int i=0;i<goods.length;i++){
			totalWeight+=goods[i].computerWeight();
		}
		return totalWeight;
	}
}
