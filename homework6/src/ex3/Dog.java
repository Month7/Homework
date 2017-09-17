package ex3;

public class Dog {
	DogState state;
	public void show(){
		state.showState();
	}
	public void setState(DogState state){
		this.state=state;
	}
}
