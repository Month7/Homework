package ex1;

public class Vehicle {
	double speed;
	int power;
	public void speedUp(int s){
		speed+=s;
	}
	public void speedDown(int s){
		speed-=s;
	}
	public double getSpeed(){
		return speed;
	}
	public void setPower(int power){
		this.power=power;
	}
	public int getPower(){
		return power;
	}
}
