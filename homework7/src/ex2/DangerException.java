package ex2;

public class DangerException extends Exception{
	String message;
	public DangerException(){
		message="Œ£œ’";
	}
	public void toShow(){
		System.out.println(message+"");
	}
}
