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
				System.out.println("���ˣ�����������Ĳ²�");
				guess=s.nextInt();
			}
			if(guess<number){
				System.out.println("С�ˣ�����������Ĳ²�");
				guess=s.nextInt();
			}
			else {
				System.out.println("��ȷ");
				break;
			}
		}
	}
}
