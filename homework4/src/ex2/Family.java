package ex2;

public class Family {
	TV homeTV;
	public void buyTV(TV homeTV){
		this.homeTV=homeTV;
	}
	public void remoteControl(int x){
		homeTV.setChannel(x);
	}
	public void seeTV(){
		homeTV.showProgram();
	}
}
