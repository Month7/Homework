package ex2;
import java.util.*;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int guess;
		int number=(int)(Math.random()*100);
		System.out.println(number);
		guess=s.nextInt();
		while(guess!=number){
			if(guess>number){
				System.out.println("大了，请再输入你的猜测");
				guess=s.nextInt();
			}
			if(guess<number){
				System.out.println("小了，请再输入你的猜测");
				guess=s.nextInt();
			}
			else {
				System.out.println("正确");
				break;
			}
		}
	}
}
