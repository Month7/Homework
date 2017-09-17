package ex2;

public class Machine {
	public void checkBag(Goods goods) throws DangerException{
		if(goods.getIsDanger()){
			DangerException danger=new DangerException();
			throw danger;
		}
		else{
			System.out.println("≤ª «Œ£œ’∆∑");
		}
	}
}
