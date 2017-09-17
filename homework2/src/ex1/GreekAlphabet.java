package ex1;

public class GreekAlphabet {
	public static void main(String[] args) {
		int start=0;
		int end=0;
		char cStart='α';
		char cEnd='ω';
		start=(int)cStart;
		end=(int)cEnd;
		System.out.println("希腊字母\'α\'在unicode表中的顺序位置"+start);
		System.out.println("希腊字母表:");
		for(int i=start;i<=end;i++){
			char c='\0';
			c=(char)i;
			System.out.print(" "+c);
			if((i-start+1)%10==0){
				System.out.println(" ");
			}
		}
	}
}
