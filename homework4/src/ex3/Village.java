package ex3;

public class Village {
	static int waterAmount;
	int peopleNumber;
	String name;
	public Village(String name){
		this.name=name;
	}
	public void setPeople(int peopleNumber){
		this.peopleNumber=peopleNumber;
	}
	static void setWaterAmount(int x){
		if(x>0)
		waterAmount=x;
	}
	public void drinkWater(int n){
		if(waterAmount>=n){
			waterAmount-=n;
			System.out.println("ºÈÁË"+n+"ÉıµÄË®");
		}
		else{
			waterAmount=0;
		}
	}
	public int lookWater(){
		return waterAmount;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
