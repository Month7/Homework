package ex1;

public class GreekAlphabet {
	public static void main(String[] args) {
		int start=0;
		int end=0;
		char cStart='��';
		char cEnd='��';
		start=(int)cStart;
		end=(int)cEnd;
		System.out.println("ϣ����ĸ\'��\'��unicode���е�˳��λ��"+start);
		System.out.println("ϣ����ĸ��:");
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
